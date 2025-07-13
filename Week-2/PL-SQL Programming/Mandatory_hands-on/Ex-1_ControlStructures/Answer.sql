--Scenario 1: The bank wants to apply a discount to loan interest rates for customers above 60 years old.

BEGIN
  FOR rec IN (
    SELECT l.LoanID, c.CustomerID, FLOOR(MONTHS_BETWEEN(SYSDATE, c.DOB)/12) AS Age
    FROM Loans l
    JOIN Customers c ON l.CustomerID = c.CustomerID
  ) LOOP
    IF rec.Age > 60 THEN
      UPDATE Loans
      SET InterestRate = InterestRate - 1
      WHERE CustomerID = rec.CustomerID;
    END IF;
  END LOOP;

  COMMIT;
  DBMS_OUTPUT.PUT_LINE('1% interest discount applied for customers above 60.');
END;
/
--To view OUTPUT
SELECT LoanID, CustomerID, InterestRate FROM Loans;


--Scenario 2: A customer can be promoted to VIP status based on their balance.

BEGIN
  FOR rec IN (SELECT CustomerID, Balance FROM Customers) LOOP
    IF rec.Balance > 10000 THEN
      UPDATE Customers
      SET IsVIP = 'TRUE'
      WHERE CustomerID = rec.CustomerID;
    END IF;
  END LOOP;

  COMMIT;
  DBMS_OUTPUT.PUT_LINE('VIP status updated for high-balance customers.');
END;
/

--To view OUTPUT
SELECT CustomerID, Name, Balance, IsVIP FROM Customers;


--Scenario 3: The bank wants to send reminders to customers whose loans are due within the next 30 days.

BEGIN
  FOR rec IN (
    SELECT LoanID, CustomerID, EndDate
    FROM Loans
    WHERE EndDate BETWEEN SYSDATE AND SYSDATE + 30
  ) LOOP
    DBMS_OUTPUT.PUT_LINE('Reminder: Loan ID ' || rec.LoanID ||
                         ' for Customer ' || rec.CustomerID ||
                         ' is due on ' || TO_CHAR(rec.EndDate, 'DD-MON-YYYY'));
  END LOOP;
END;
/

--To view OUTPUT
SELECT LoanID, CustomerID, EndDate
FROM Loans
WHERE EndDate BETWEEN SYSDATE AND SYSDATE + 30;








