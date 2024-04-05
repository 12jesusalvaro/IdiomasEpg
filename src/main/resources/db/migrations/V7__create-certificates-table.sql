-- Table of certificates --
CREATE TABLE certificates (
    id SERIAL PRIMARY KEY ,
    name VARCHAR (100) NOT NULL ,
    issue_date DATE ,
    issued BOOLEAN
);