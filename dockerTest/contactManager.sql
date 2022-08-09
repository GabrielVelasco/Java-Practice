--
-- PostgreSQL port of the MySQL "World" database.
--
-- The sample data used in the world database is Copyright Statistics 
-- Finland, http://www.stat.fi/worldinfigures.
--

BEGIN;

SET client_encoding = 'LATIN1';

CREATE TABLE contact (
    name text NOT NULL,
    sex text NOT NULL,
    profession text NOT NULL,
    phonenumber text NOT NULL,
    email text NOT NULL,
    age integer NOT NULL,
    contacttype text NOT NULL
);

COPY contact (name, sex, profession, phonenumber, email, age, contacttype) FROM stdin;
Abel male computer phone abel@ass 20 family
Gabriel male computer phone abel@ass 24 family
\.

COMMIT;

ANALYZE contact;