CREATE TABLE IF NOT EXISTS department (
  dp_id INT PRIMARY KEY AUTO_INCREMENT,
  dp_name VARCHAR(100)
);

CREATE TABLE IF NOT EXISTS employee (
  emp_id INT PRIMARY KEY AUTO_INCREMENT,
  emp_name VARCHAR(100),
  emp_salary DOUBLE,
  dp_id INT,
  FOREIGN KEY (dp_id) REFERENCES department(dp_id)
);

CREATE TABLE IF NOT EXISTS skill (
  sk_id INT PRIMARY KEY AUTO_INCREMENT,
  sk_name VARCHAR(100)
);

CREATE TABLE IF NOT EXISTS employee_skill (
  emp_id INT,
  sk_id INT,
  PRIMARY KEY (emp_id, sk_id),
  FOREIGN KEY (emp_id) REFERENCES employee(emp_id),
  FOREIGN KEY (sk_id) REFERENCES skill(sk_id)
);
