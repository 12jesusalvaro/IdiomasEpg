-- Table of users----
CREATE TABLE users (
    id SERIAL PRIMARY KEY,
    names VARCHAR(100) NOT NULL,
    epg_code VARCHAR(10) UNIQUE,
    f_last_name VARCHAR(50) NOT NULL,
    s_last_name VARCHAR(50),
    phone_number VARCHAR(15) NOT NULL,
    email VARCHAR(100) NOT NULL,
    password VARCHAR(255) NOT NULL
);