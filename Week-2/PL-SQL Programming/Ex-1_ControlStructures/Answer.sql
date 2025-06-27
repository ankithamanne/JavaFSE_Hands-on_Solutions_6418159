--1. CREATE TABLE

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


--2. INSERT DATA

INSERT INTO customers VALUES (1, 'John Doe', 65, 15000, 8.5, 'FALSE');
INSERT INTO customers VALUES (2, 'Jane Smith', 45, 9000, 9.0, 'FALSE');
INSERT INTO customers VALUES (3, 'Ankitha R', 70, 12000, 7.5, 'FALSE');

INSERT INTO loans VALUES (101, 1, SYSDATE + 15);
INSERT INTO loans VALUES (102, 2, SYSDATE + 40);
INSERT INTO loans VALUES (103, 3, SYSDATE + 5);

COMMIT;

--To View Table Data
SELECT * FROM customers;
SELECT * FROM loans;


--3. Scenario 1: The bank wants to apply a discount to loan interest rates for customers above 60 years old.

BEGIN
  FOR cust IN (SELECT customer_id, interest_rate, age FROM customers) LOOP
    IF cust.age > 60 THEN
      UPDATE customers
      SET interest_rate = interest_rate - 1
      WHERE customer_id = cust.customer_id;
    END IF;
  END LOOP;

  COMMIT;
  DBMS_OUTPUT.PUT_LINE('Discount applied to eligible customers.');
END;

--To view OUTPUT
SELECT customer_id, name, age, interest_rate FROM customers;


--4. Scenario 2: A customer can be promoted to VIP status based on their balance.

BEGIN
  FOR cust IN (SELECT customer_id, balance FROM customers) LOOP
    IF cust.balance > 10000 THEN
      UPDATE customers
      SET isvip = 'TRUE'
      WHERE customer_id = cust.customer_id;
    END IF;
  END LOOP;

  COMMIT;
  DBMS_OUTPUT.PUT_LINE('VIP status updated.');
END;
/

--To view OUTPUT
SELECT customer_id, name, balance, isvip FROM customers;



--5.Scenario 3: The bank wants to send reminders to customers whose loans are due within the next 30 days.

BEGIN
  FOR loan IN (
    SELECT loan_id, customer_id, due_date
    FROM loans
    WHERE due_date BETWEEN SYSDATE AND SYSDATE + 30
  ) LOOP
    DBMS_OUTPUT.PUT_LINE('Reminder: Loan ID ' || loan.loan_id ||
                         ' for Customer ' || loan.customer_id ||
                         ' is due on ' || TO_CHAR(loan.due_date, 'DD-MON-YYYY'));
  END LOOP;
END;
/

--To view OUTPUT
SELECT * FROM loans WHERE due_date <= SYSDATE + 30;







