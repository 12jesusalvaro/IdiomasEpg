-- Table of languages ---
CREATE TABLE languages (
    id SERIAL PRIMARY KEY,
    name VARCHAR (50) NOT NULL,
    total_cost DECIMAL(10,2),
    active BOOLEAN,
    curricular_structure VARCHAR (100)
);