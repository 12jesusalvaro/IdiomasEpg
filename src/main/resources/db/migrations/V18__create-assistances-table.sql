-- table of assistances --
CREATE TABLE assistances (
    id SERIAL PRIMARY KEY ,
    inscription_id INT REFERENCES inscriptions(id) ON DELETE CASCADE ON UPDATE CASCADE ,
    total_attendance INT ,
    attendance_number INT
);