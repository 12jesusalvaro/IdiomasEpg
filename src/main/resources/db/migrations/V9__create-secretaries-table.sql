-- Table of secretaries --
CREATE TABLE secretaries (
    id SERIAL PRIMARY KEY ,
    user_id INT REFERENCES users(id) ON DELETE CASCADE ON UPDATE CASCADE,
    rol_id INT REFERENCES rols(id)
);