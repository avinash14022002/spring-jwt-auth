drop table if exists public.userdetails;
CREATE TABLE public."userdetails" (
    id serial PRIMARY KEY,
    username varchar NOT NULL,
    password VARCHAR NOT NULL,
    active boolean NOT NULL,
    roles TEXT NOT NULL,
    company TEXT NOT NULL,
    department TEXT NOT NULL
);

INSERT INTO public."userdetails" (id,username,password,active,roles,company,department)
VALUES (1,'test', 'test', true, 'ROLE_USER','TRF','Programming');