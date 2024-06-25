-- 1.Example: “OR” Operator Examples

SELECT    customername, country
      FROM    customers
      WHERE    country = 'USA' OR country = 'France';
      
-- 2a. Example: “AND” Operator Examples

SELECT    customername, country, creditLimit  
      FROM    customers
      WHERE (country = 'USA' OR country = 'France') AND creditlimit > 100000;

-- 2b. 

	SELECT  customername, country, creditLimit FROM    customers
      WHERE    country = 'USA' OR country = 'France' AND creditlimit > 100000;

-- 3A. Example: BETWEEN and NOT BETWEEN

SELECT     productCode,  productName,  buyPrice
      FROM    products
      WHERE     buyPrice BETWEEN 90 AND 100;
      
-- 3B. 

SELECT productCode, productName, buyPrice
      FROM products
      WHERE  buyPrice >= 90 AND buyPrice <= 100;
      
-- 3C. 

SELECT productCode, productName, buyPrice FROM products
      WHERE buyPrice NOT BETWEEN 20 AND 100;
      
-- 4.1. Example:  “IS NULL” Operator

SELECT customerName, country, salesrepemployeenumber
      FROM customers
      WHERE salesrepemployeenumber IS NULL
      ORDER BY  customerName;

-- 4.2. 

SELECT customerName, country, salesrepemployeenumber
      FROM  customers
      WHERE  salesrepemployeenumber IS NOT NULL
      ORDER BY customerName;
      
-- 4.3.

SELECT  c.customerNumber, c.customerName,  orderNumber, o.STATUS
      FROM customers c
      LEFT JOIN orders o
      ON c.customerNumber = o.customerNumber
      WHERE  orderNumber IS NULL;