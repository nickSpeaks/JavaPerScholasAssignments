-- 1. Using MOD() function.

SELECT orderNumber, SUM(quantityOrdered) as Qty,
    IF(MOD(SUM(quantityOrdered),2),'Odd', 'Even') as oddOrEven
    FROM    orderdetails
    GROUP BY    orderNumber
    ORDER BY    orderNumber;
    
-- 2. TRUNCATE() Function

    SELECT TRUNCATE(1.555,1);
    
-- 3. ROUND() function
    
    SELECT productCode, 
         AVG(quantityOrdered * priceEach) as avg_order_value
      FROM orderDetails
      GROUP BY productCode;
      

	SELECT     productCode,
      ROUND(AVG(quantityOrdered * priceEach)) as avg_order_item_value
      FROM     orderDetails
      GROUP BY    productCode;
      
-- SQL TRUNCATE() vs. ROUND()     
      
    SELECT   TRUNCATE(1.999,1),  ROUND(1.999,1);  
      
-- 4. REPLACE() Function
      
--     UPDATE tbl_name SET
--       field_name = REPLACE(
--             field_name, 
--             string_to_find, 
--             string_to_replace)
--       WHERE conditions;  

UPDATE products
      SET productDescription = REPLACE(productDescription,'abuot','about');

-- 5. DATEDIFF() function

	SELECT DATEDIFF('2011-08-17','2011-08-17'); 
    SELECT DATEDIFF('2011-08-17','2011-08-08');
    SELECT DATEDIFF('2011-08-08','2011-08-17');  

-- 5a
      
	SELECT orderNumber, DATEDIFF(requiredDate, shippedDate) as  daysLeft
      FROM     orders
      ORDER BY  daysLeft DESC;
      
-- 5b

	SELECT orderNumber, 
         DATEDIFF(requiredDate, orderDate) as remaining_days
      FROM    orders
      WHERE    status = 'In Process'
      ORDER BY remaining_days;

-- 5c

	SELECT
         orderNumber,
         ROUND(DATEDIFF(requiredDate, orderDate) / 7, 2),
         ROUND(DATEDIFF(requiredDate, orderDate) / 30,2)
      FROM     orders
      WHERE    status = 'In Process';
      
-- 6. DATE_FORMAT() Function

	SELECT
         orderNumber,
         DATE_FORMAT(orderdate, '%Y-%m-%d') orderDate,
         DATE_FORMAT(requireddate, '%a %D %b %Y') requireddate,
         DATE_FORMAT(shippedDate, '%W %D %M %Y') shippedDate
      FROM orders;

-- 6a

	SELECT
		orderNumber,
         DATE_FORMAT(shippeddate, '%W %D %M %Y')  as 'Shipped date'
      FROM    orders
      ORDER BY shippeddate;

-- 7a LPAD(str, len, padstr)

	SELECT LPAD('hi',4,'??');       #Result   -> '??hi'

    SELECT LPAD('hi',1,'??');     # Result -> 'h'

-- 7b

SELECT firstName, 
         LPAD(firstName,10,'kk'), 
         LPAD(firstName,5,'kk'), 
         LPAD(firstName,4,'kk')
      FROM classicmodels.employees;
      
-- 7. SQL TRIM() Function

-- 	TRIM(
--          [{BOTH|LEADING|TRAILING} [removed_str]] 
--       FROM str);

-- YEAR() Function

 SELECT YEAR('2002-01-01');
 
 SELECT 
         YEAR(shippeddate) as year,  
         COUNT(ordernumber) as orderQty
      FROM orders
      GROUP BY YEAR(shippeddate)
      ORDER BY YEAR(shippeddate);
      
-- DAY() Function

SELECT DAY('2022-01-15');

SELECT  DAY(orderdate) as dayofmonth, COUNT(*)
    FROM    orders WHERE    YEAR(orderdate) = 2004
    GROUP BY dayofmonth
    ORDER BY dayofmonth;