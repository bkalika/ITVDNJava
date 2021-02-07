CREATE TABLE IF NOT EXISTS public.clients
(
    id SERIAL PRIMARY KEY,
    name TEXT,
    age INTEGER,
    phone INTEGER
);

CREATE TABLE IF NOT EXISTS public.authors
(
    id SERIAL PRIMARY KEY,
    name VARCHAR(45)
);

CREATE OR REPLACE TABLE public.books
(
    id SERIAL PRIMARY KEY,
    name VARCHAR(45)
    author_id INTEGER
);