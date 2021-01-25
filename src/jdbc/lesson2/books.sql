CREATE TABLE IF NOT EXISTS public.books(id       SERIAL    PRIMARY KEY, name     TEXT      NOT NULL, price    REAL      NOT NULL);
INSERT INTO books (name, price) VALUES('Harry Potter', 45.5);
INSERT INTO public.books (name, price) values('Inferno', 45.0);
INSERT INTO public.books (name, price) values('It', 25.0);
INSERT INTO public.books (name, price) values('Spartacus', 55.0);
INSERT INTO public.books (name, price) values('Green mile', 20.6);
INSERT INTO public.books (name, price) values('Solomon key', 5.0);
