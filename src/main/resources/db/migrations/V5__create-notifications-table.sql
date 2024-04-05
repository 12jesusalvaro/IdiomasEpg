-- Table of notifications --
CREATE TABLE notifications (
    id SERIAL PRIMARY KEY ,
    name VARCHAR (100) ,
    file VARCHAR (100) ,
    description VARCHAR (255)
);