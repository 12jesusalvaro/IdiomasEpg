-- Table of inscriptions --
CREATE TABLE inscriptions (
    id SERIAL PRIMARY KEY ,
    student_id INT REFERENCES students(id) ON DELETE CASCADE ON UPDATE CASCADE,
    group_id INT REFERENCES groups(id) ON DELETE SET NULL ON UPDATE CASCADE
);