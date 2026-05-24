CREATE DATABASE IF NOT EXISTS hospital_management_system;
USE hospital_management_system;

-- 1. LOGIN TABLE
CREATE TABLE IF NOT EXISTS login (
    username VARCHAR(20),
    password VARCHAR(20)
);
INSERT INTO login VALUES ('admin', 'admin123');

-- 2. EMPLOYEE TABLE
CREATE TABLE IF NOT EXISTS employee (
    name VARCHAR(50),
    age VARCHAR(10),
    phone_number VARCHAR(20),
    salary VARCHAR(20),
    gmail VARCHAR(50),
    aadhar_number VARCHAR(30)
);
INSERT INTO employee VALUES ('Dr. Alok Sharma', '45', '9876543210', '95000', 'alok@gmail.com', '123456789012');
INSERT INTO employee VALUES ('Dr. Priya Verma', '38', '9876543211', '90000', 'priya@gmail.com', '987654321098');

-- 3. ROOM TABLE
CREATE TABLE IF NOT EXISTS room (
    room_number VARCHAR(20),
    availability VARCHAR(20),
    price VARCHAR(20),
    clean_status VARCHAR(20)
);
INSERT INTO room VALUES ('101', 'Available', '1500', 'Clean');
INSERT INTO room VALUES ('102', 'Occupied', '2500', 'Clean');

COMMIT;