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
