-- Table of books --
CREATE TABLE books (
    id SERIAL PRIMARY KEY ,
    name VARCHAR (255),
    description VARCHAR (255),
    other VARCHAR (255),
    issue_date DATE ,
    group_id INT REFERENCES groups(id) ON DELETE CASCADE ON UPDATE CASCADE
);