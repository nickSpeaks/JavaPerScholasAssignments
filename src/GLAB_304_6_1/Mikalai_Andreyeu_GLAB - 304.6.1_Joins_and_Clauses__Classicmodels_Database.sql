SET sql_mode=(SELECT REPLACE(@@sql_mode,'ONLY_FULL_GROUP_BY',''));

--  1. Problem Statement One
select c.customerName AS 'Customer Name', 
	CONCAT(e.lastName, ', ', e.firstName) AS 'Sales Rep'
    FROM customers c JOIN employees e
    ON c.salesRepEmployeeNumber = e.employeeNumber  
    ORDER BY c.customerName ASC;
    
-- 2. Problem Statement two

select p.productName as 'Product Name', 
	sum(od.quantityOrdered) as 'Total # Ordered', 
    sum(od.quantityOrdered * od.priceEach) as 'Total Sale'
    from products p LEFT JOIN orderdetails od
    on p.productCode=od.productCode
    group by p.productName, p.buyPrice
    order by 3 desc
    
-- 3. 

select status as 'Order Status', count(status) as 'Total Orders'
    from orders
    group by status
    order by status;
    
-- 4. 

select
    pl.productLine as 'Product Line',
    count(od.productCode) as 'total Sold'
    from productLines pl join products p
    on pl.productLine=p.productLine
    JOIN orderdetails od on p.productCode=od.productCode
    group by pl.productLine
    order by 2 desc;
    
-- 5.

select
    monthname(paymentDate) AS Month,
    year(paymentDate) AS Year,
    format(sum(amount), 2) AS 'Payments Received'
    from payments
    group by year(paymentDate), monthname(paymentDate)
    order by paymentDate;
    
-- 6.

SELECT 
	p.productName Name, 
    p.productLine AS `Product Line`, 
    p.productScale AS `Scale`, 
    p.productVendor AS `Vendor` 
    FROM productlines l NATURAL JOIN products p
    WHERE l.productLine = "Classic Cars" OR l.productLine = "Vintage Cars"
    ORDER BY p.productLine DESC, p.productName ASC;