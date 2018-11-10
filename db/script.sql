-- Table: study."user"

-- DROP TABLE study."user";

CREATE TABLE study."user"
(
    user_name character varying(20) COLLATE pg_catalog."default" NOT NULL,
    first_name character varying(100) COLLATE pg_catalog."default" NOT NULL,
    last_name character varying(100) COLLATE pg_catalog."default" NOT NULL,
	password character varying(20) COLLATE pg_catalog."default" NOT NULL,
	is_active integer NOT NULL,
	VERSION integer NOT NULL
	CREATED_BY character varying(100) COLLATE pg_catalog."default" NOT NULL,
    CREATED_DATE timestamp without time zone NOT NULL,	
	LAST_UPDATED_BY character varying(100) COLLATE pg_catalog."default" NOT NULL,
    LAST_UPDATED_TIME timestamp without time zone NOT NULL,
	CONSTRAINT user_pkey PRIMARY KEY (user_name)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE study."user"
    OWNER to latheesh;
COMMENT ON TABLE study."user"
    IS 'Stores user details';


-- Table: study.book

-- DROP TABLE study.book;

CREATE TABLE study.book
(
    book_id integer NOT NULL,
    isbn character varying(20) COLLATE pg_catalog."default" NOT NULL,
    title character varying(200) COLLATE pg_catalog."default" NOT NULL,
    author character varying(200) COLLATE pg_catalog."default" NOT NULL,
    description character varying(1000) COLLATE pg_catalog."default",
	VERSION integer NOT NULL
	CREATED_BY character varying(100) COLLATE pg_catalog."default" NOT NULL,
    CREATED_DATE timestamp without time zone NOT NULL,	
	LAST_UPDATED_BY character varying(100) COLLATE pg_catalog."default" NOT NULL,
    LAST_UPDATED_TIME timestamp without time zone NOT NULL,
    CONSTRAINT book_pkey PRIMARY KEY (book_id)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE study.book
    OWNER to latheesh;

COMMENT ON TABLE study."book"
    IS 'Stores book details';

insert into study.book values (1, '87878787878', 'Book 1', 'Author 1', 'Book 1 description',1,'admin',LOCALTIMESTAMP,'admin',LOCALTIMESTAMP); --current_time
insert into study.book values (2, '232423424', 'Book 2', 'Author 2', 'Book 2 description',1,'admin',LOCALTIMESTAMP,'admin',LOCALTIMESTAMP);
insert into study.book values (3, '8766565', 'Book 3', 'Author 3', 'Book 3 description',1,'admin',LOCALTIMESTAMP,'admin',LOCALTIMESTAMP);
