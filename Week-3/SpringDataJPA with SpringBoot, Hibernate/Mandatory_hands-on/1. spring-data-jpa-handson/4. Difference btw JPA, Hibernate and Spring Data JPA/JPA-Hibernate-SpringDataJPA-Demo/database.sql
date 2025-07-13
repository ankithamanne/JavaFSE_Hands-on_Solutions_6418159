-- Create schema and table
CREATE DATABASE demo;

USE demo;

CREATE TABLE employee (
  id INT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(100),
  salary DOUBLE
);
