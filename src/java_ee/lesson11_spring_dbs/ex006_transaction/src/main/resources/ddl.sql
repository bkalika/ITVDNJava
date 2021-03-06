CREATE DATABASE IF NOT EXISTS itvdn_db;

DROP TABLE IF EXISTS mp3;

DROP TABLE IF EXISTS author;

CREATE TABLE IF NOT EXISTS author(
    id SERIAL,
    name VARCHAR(40),
    PRIMARY KEY(id)
)

CREATE TABLE IF NOT EXISTS mp3(
    id SERIAL,
    name VARCHAR(25) NOT NULL,
    author_id INTEGER NOT NULL,
    PRIMARY KEY(id),
    FOREIGN KEY(author_id) REFERENCES author(id)
)

CREATE OR REPLACE VIEW mp3_view AS
    SELECT a.name as author_name, a.id as author_id, m.name as mp3_name, m.id as mp3_id
    FROM mp3 m
    INNER JOIN author a on m.author_id = a.id;
