CREATE TABLE IF NOT EXISTS public.flowers(
	id       SERIAL    PRIMARY KEY,
	mark     CHAR(45)      NOT NULL
	);

CREATE TABLE IF NOT EXISTS public.bunch(
	id       SERIAL    PRIMARY KEY
	);

CREATE TABLE IF NOT EXISTS public.flowers_exists(
	id       SERIAL    PRIMARY KEY,
	mark_id  INTEGER NOT NULL,
	price REAL NOT NULL,
	length_steak INTEGER NOT NULL,
	ice_level INTEGER NOT NULL,
	bunch_id INTEGER,
	FOREIGN KEY(mark_id) REFERENCES flowers(id),
	FOREIGN KEY(bunch_id) REFERENCES bunch(id)
	);
	
CREATE TABLE IF NOT EXISTS public.user(
	id SERIAL PRIMARY KEY,
	name CHAR(45) NOT NULL,
	password CHAR(45) NOT NULL,
	admin BOOLEAN NOT NULL DEFAULT FALSE
);

CREATE TABLE IF NOT EXISTS public.user_bunch(
	user_id INTEGER NOT NULL,
	bunch_id INTEGER NOT NULL,
	PRIMARY KEY (user_id, bunch_id),
	FOREIGN KEY(bunch_id) REFERENCES bunch(id),
	FOREIGN KEY(user_id) REFERENCES public.user(id)
);

INSERT INTO public.flowers(mark) VALUES('Romashka'),
	('Fialka'),
	('Podsnezhnik'),
	('Rose'),
	('Tulpin');
