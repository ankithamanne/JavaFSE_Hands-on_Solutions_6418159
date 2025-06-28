--Scenario-1: The bank needs to process monthly interest for all savings accounts.

CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest IS
BEGIN
    UPDATE Accounts
    SET Balance = Balance + (Balance * 0.01),
        LastModified = SYSDATE
    WHERE AccountType = 'Savings';
END;
/

EXEC ProcessMonthlyInterest;

--To view OUTPUT
SELECT * FROM Accounts WHERE AccountType = 'Savings';


--Scenario 2: The bank wants to implement a bonus scheme for employees based on their performance.

CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus(
    dept_name IN VARCHAR2,
    bonus_percent IN NUMBER
) IS
BEGIN
    UPDATE Employees
    SET Salary = Salary + (Salary * bonus_percent / 100)
    WHERE Department = dept_name;
END;
/

EXEC UpdateEmployeeBonus('IT', 10);  

--To view OUTPUT
SELECT * FROM Employees;


--Scenario 3: Customers should be able to transfer funds between their accounts.

CREATE OR REPLACE PROCEDURE TransferFunds(
    from_account IN NUMBER,
    to_account IN NUMBER,
    amount IN NUMBER
) IS
    insufficient_balance EXCEPTION;
BEGIN
    -- Check balance
    FOR acc IN (SELECT Balance FROM Accounts WHERE AccountID = from_account) LOOP
        IF acc.Balance < amount THEN
            RAISE insufficient_balance;
        END IF;
    END LOOP;

    -- Deduct from source
    UPDATE Accounts
    SET Balance = Balance - amount,
        LastModified = SYSDATE
    WHERE AccountID = from_account;

    -- Add to destination
    UPDATE Accounts
    SET Balance = Balance + amount,
        LastModified = SYSDATE
    WHERE AccountID = to_account;
    
EXCEPTION
    WHEN insufficient_balance THEN
        DBMS_OUTPUT.PUT_LINE('Transfer failed: Insufficient funds.');
END;
/

EXEC TransferFunds(1, 2, 300);

--To view OUTPUT
SELECT * FROM Accounts WHERE AccountType = 'Savings';





