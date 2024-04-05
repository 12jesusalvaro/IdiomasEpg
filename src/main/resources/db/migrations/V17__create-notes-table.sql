-- Table of notes --
CREATE TABLE notes (
    id SERIAL PRIMARY KEY ,
    inscription_id INT REFERENCES inscriptions(id) ON DELETE CASCADE ON UPDATE CASCADE,
    note_1 DECIMAL (10, 2),
    note_2 DECIMAL (10,2),
    note_3 DECIMAL (10,2),
    end_note DECIMAL (10,2)
);