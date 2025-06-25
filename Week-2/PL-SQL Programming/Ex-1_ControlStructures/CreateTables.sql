CREATE TABLE customers (
  customer_id     NUMBER PRIMARY KEY,
  name            VARCHAR2(50),
  age             NUMBER,
  balance         NUMBER,
  interest_rate   NUMBER,
  isvip           VARCHAR2(5)
);

CREATE TABLE loans (
  loan_id      NUMBER PRIMARY KEY,
  customer_id  NUMBER,
  due_date     DATE,
  FOREIGN KEY (customer_id) REFERENCES customers(customer_id)
);

