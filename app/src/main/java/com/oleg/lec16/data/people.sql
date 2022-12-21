SELECT * FROM Customers;

SELECT CustomerID,CustomerName FROM Customers;


SELECT * FROM [OrderDetails]
Where ProductID == 1








SELECT * FROM [Products]
JOIN Categories ON Products.CategoryID = Categories.CategoryID
JOIN Suppliers ON Suppliers.SupplierID = Products.SupplierID

INSERT INTO Customers (CustomerName, ContactName, Address, City, PostalCode, Country)
VALUES ('Cardinal', 'Tom B. Erichsen', 'Skagen 21', 'Stavanger', '4006', 'Norway');
