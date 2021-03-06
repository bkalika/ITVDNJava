package com.itvdn.spring.dao.impls;

import com.itvdn.spring.dao.interfaces.MP3Dao;
import com.itvdn.spring.dao.objects.MP3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.*;
import java.util.List;

@Component("sqliteDAO")
public class SQLiteDAO implements MP3Dao {

    private NamedParameterJdbcTemplate jdbcTemplate;

    @Autowired
    public void setDataSource(DataSource dataSource){
        this.jdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public void insert(MP3 mp3){
        String sql = "INSERT INTO public.mp3(name, author) VALUES(:name, :author)";

        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("name", mp3.getName());
        params.addValue("author", mp3.getAuthor());

        jdbcTemplate.update(sql, params);
    }

    public void insert(List<MP3> mp3List){
        for(MP3 mp3 : mp3List){
            insert(mp3);
        }
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
        String sql = "SELECT * FROM mp3 WHERE upper(author) like :author";

        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("author", "%" + author.toUpperCase() + "%");
        System.out.println("params: " + params.getValues());
        return jdbcTemplate.query(sql, params, new MP3RowMapper());
    }

    public int getMP3Count(){
        String sql = "SELECT COUNT(*) FROM mp3";
        return jdbcTemplate.getJdbcOperations().queryForObject(sql, Integer.class);
    }

    private static final class MP3RowMapper implements RowMapper<MP3> {

        public MP3 mapRow(ResultSet rs, int rowNum) throws SQLException{

            MP3 mp3 = new MP3();
            mp3.setId(rs.getInt("id"));
            mp3.setName(rs.getString("name"));
            mp3.setAuthor(rs.getString("author"));
            return mp3;
        }

    }
}
