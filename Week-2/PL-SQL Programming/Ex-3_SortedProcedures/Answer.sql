//1. CREATE TABLE

CREATE TABLE ACCOUNTS (
    account_id NUMBER PRIMARY KEY,
    account_type VARCHAR2(20),
    balance NUMBER(10, 2)
);

CREATE TABLE EMPLOYEES (
    emp_id NUMBER PRIMARY KEY,
    department_id NUMBER,
    salary NUMBER(10, 2)
);


//2. INSERT DATA

INSERT INTO ACCOUNTS VALUES (101, 'Savings', 1000.00);
INSERT INTO ACCOUNTS VALUES (102, 'Savings', 2000.00);
INSERT INTO ACCOUNTS VALUES (103, 'Current', 3000.00);

INSERT INTO EMPLOYEES VALUES (1, 10, 50000);
INSERT INTO EMPLOYEES VALUES (2, 10, 60000);
INSERT INTO EMPLOYEES VALUES (3, 20, 55000);

COMMIT;


//3. VIEW TABLE DATA

SELECT * FROM ACCOUNTS;
SELECT * FROM EMPLOYEES;


//4. Scenario_1: The bank needs to process monthly interest for all savings accounts.

CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest IS
BEGIN
    UPDATE ACCOUNTS
    SET balance = balance + (balance * 0.01)
    WHERE account_type = 'Savings';

    COMMIT;
END;
/
EXEC ProcessMonthlyInterest;

--To view OUTPUT
SELECT * FROM ACCOUNTS;


//5. Scenario 2: The bank wants to implement a bonus scheme for employees based on their performance.

CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus(
    dept_id IN NUMBER,
    bonus_percent IN NUMBER
) IS
BEGIN
    UPDATE EMPLOYEES
    SET salary = salary + (salary * bonus_percent / 100)
    WHERE department_id = dept_id;

    COMMIT;
END;
/
EXEC UpdateEmployeeBonus(10, 10);  

--To view OUTPUT
SELECT * FROM EMPLOYEES;


//6. Scenario 3: Customers should be able to transfer funds between their accounts.

CREATE OR REPLACE PROCEDURE TransferFunds(
    from_acc IN NUMBER,
    to_acc IN NUMBER,
    amount IN NUMBER
) IS
    bal NUMBER;
BEGIN
    SELECT balance INTO bal FROM ACCOUNTS WHERE account_id = from_acc;

    IF bal >= amount THEN
        UPDATE ACCOUNTS SET balance = balance - amount WHERE account_id = from_acc;
        UPDATE ACCOUNTS SET balance = balance + amount WHERE account_id = to_acc;
        COMMIT;
    ELSE
        DBMS_OUTPUT.PUT_LINE('Insufficient balance.');
        ROLLBACK;
    END IF;
END;
/
EXEC TransferFunds(101, 103, 500);

--To view OUTPUT
SELECT * FROM ACCOUNTS;




