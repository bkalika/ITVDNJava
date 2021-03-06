package com.itvdn.spring.dao.impls;

import com.itvdn.spring.dao.interfaces.MP3Dao;
import com.itvdn.spring.dao.objects.Author;
import com.itvdn.spring.dao.objects.MP3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSourceUtils;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.sql.*;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

@Component("sqliteDAO")
public class SQLiteDAO implements MP3Dao {
    private static final String mp3Table = "mp3";
    private static  final String mp3View = "mp3_view";

    private NamedParameterJdbcTemplate jdbcTemplate;

    @Autowired
    public void setDataSource(DataSource dataSource){
        this.jdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    @Transactional
    public int insert(MP3 mp3){
        String sqlInsertAuthor = "INSERT INTO author (name) VALUES(:authorName)";

        Author author = mp3.getAuthor();

        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("authorName", author.getName());

        KeyHolder keyHolder = new GeneratedKeyHolder();
        jdbcTemplate.update(sqlInsertAuthor, params, keyHolder, new String[] {"id"});
        int author_id = keyHolder.getKey().intValue();

        String sqlInsertMP3 = "INSERT INTO mp3(author_id, name) VALUES (:authorId, :mp3Name)";

        params = new MapSqlParameterSource();
        params.addValue("mp3Name", mp3.getName());
        params.addValue("authorId", author_id);

        return jdbcTemplate.update(sqlInsertMP3, params);
    }

    public int insertList(List<MP3> mp3List){
        String sql = "INSERT INTO mp3 (author, name) VALUES (:author, :name)";

        // old version:
//        SqlParameterSource[] params = new SqlParameterSource[mp3List.size()];
//
//        int i = 0;
//        for(MP3 mp3 : mp3List){
//            MapSqlParameterSource p = new MapSqlParameterSource();
//            p.addValue("name", mp3.getName());
//            p.addValue("author", mp3.getAuthor());
//
//            params[i] = p;
//            i++;
//        }
        //        int[] updateCounts = jdbcTemplate.batchUpdate(sql, params);

        SqlParameterSource[] batch = SqlParameterSourceUtils.createBatch(mp3List.toArray());
        int[] updateCounts = jdbcTemplate.batchUpdate(sql, batch);
        return updateCounts.length;
    }

    public Map<String, Integer> getStat(){
        String sql = "SELECT author, COUNT(*) as count FROM mp3 GROUP BY author";

        return jdbcTemplate.query(sql, new ResultSetExtractor<Map<String, Integer>>() {
            public Map<String, Integer> extractData(ResultSet resultSet) throws SQLException, DataAccessException {
                Map<String, Integer> map = new TreeMap<String, Integer>();
                while (resultSet.next()){
                    String author = resultSet.getString("author");
                    int count = resultSet.getInt("count");
                    map.put(author, count);
                }
                return map;
            };
        });
    }

    public void delete(int id) {
        String sql = "DELETE FROM public.mp3 where id=:id";

        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("id", id);

        jdbcTemplate.update(sql, params);
    }

    public void delete(MP3 mp3){
        delete(mp3.getId());
    }

    public MP3 getMP3ByID(int id) {
        String sql = "SELECT * FROM mp3 WHERE id = :id";

        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("id", id);

        return jdbcTemplate.queryForObject(sql, params, new MP3RowMapper());
    }

    public List<MP3> getMP3ListByName(String name) {
        String sql = "SELECT * FROM mpe WHERE upper(name) like :name";

        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("name", "%" + name.toUpperCase() + "%");

        return jdbcTemplate.query(sql, params, new MP3RowMapper());
    }

    public List<MP3> getMP3ListByAuthor(String author) {
        String sql = "SELECT * FROM "  + mp3View + " WHERE upper(author_name) like :author_name";

        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("author_name", "%" + author.toUpperCase() + "%");

        return jdbcTemplate.query(sql, params, new MP3RowMapper());
    }

    public int getMP3Count(){
        String sql = "SELECT COUNT(*) FROM mp3";
        return jdbcTemplate.getJdbcOperations().queryForObject(sql, Integer.class);
    }

    private static final class MP3RowMapper implements RowMapper<MP3> {

        public MP3 mapRow(ResultSet rs, int rowNum) throws SQLException{
            Author author = new Author();
            author.setId(rs.getInt("author_id"));
            author.setName(rs.getString("author_name"));

            MP3 mp3 = new MP3();
            mp3.setId(rs.getInt("mp3_id"));
            mp3.setName(rs.getString("mp3_name"));
            mp3.setAuthor(author);
            return mp3;
        }

    }
}
