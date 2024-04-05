-- Table of pays --
CREATE TABLE pays (
    id SERIAL PRIMARY KEY ,
    student_id INT REFERENCES students(id) ON DELETE CASCADE ON UPDATE CASCADE,
    serie VARCHAR (50) NOT NULL,
    sequence VARCHAR (50) UNIQUE NOT NULL,
    amount DECIMAL(10, 2) NOT NULL,
    pay_date DATE NOT NULL,
    pay_number VARCHAR (50),
    voucher VARCHAR (100)
);