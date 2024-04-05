-- Table of groups --
CREATE TABLE groups (
    id SERIAL PRIMARY KEY,
    name VARCHAR (100) NOT NULL,
    language_id INT REFERENCES languages(id) ON DELETE CASCADE ON UPDATE CASCADE,
    class_schedule_id INT REFERENCES class_schedules(id) ON DELETE SET NULL ON UPDATE CASCADE,
    cant_minimum_est INT ,
    active BOOLEAN
);