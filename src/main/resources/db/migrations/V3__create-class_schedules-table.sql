-- Table of class_schedules --
CREATE TABLE class_schedules (
    id SERIAL PRIMARY KEY,
    name VARCHAR (50) NOT NULL,
    start_time TIME,
    end_time TIME ,
    active BOOLEAN ,
    start_date DATE
);