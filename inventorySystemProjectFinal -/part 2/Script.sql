/* Droping all tables before running the script again */

purge recyclebin;
drop table Employee cascade constraints;
drop table Dependent cascade constraints;
drop table ManagmentDept cascade constraints;
drop table Customer cascade constraints;
drop table Ord cascade constraints;
drop table Payment cascade constraints;
drop table Supplier cascade constraints;
drop table Product cascade constraints;
drop table ProductInOrder cascade constraints;
drop table SupplierSupplies cascade constraints;
drop table Warehouse cascade constraints;
drop table ManagmentdeptBudgetsWarehouse cascade constraints;

/* Creating all tables */

CREATE TABLE Warehouse
(
capacity number(38),
WhID number(38),
MEmpID number(38),
CONSTRAINT warehouse_pk PRIMARY KEY (WhID)
);

CREATE TABLE ManagmentDept
(
dept_id number(38),
dept_expense number(38),
dept_income number(38),
CONSTRAINT Managment_pk PRIMARY KEY (dept_id)
);

CREATE TABLE Employee
(
emp_id number(38),
emp_Fname varchar2(38) NOT NULL,
emp_Mname varchar2(38),
emp_Lname varchar2(38) NOT NULL,
emp_ssn number(38) UNIQUE,
emp_phone number(38),
emp_address varchar2(38),
emp_salary number(38),
emp_supervisorID number(38),
emp_ManagDeptID number(38),
emp_WarehouseID number(38),
CONSTRAINT employee_pk PRIMARY KEY(emp_id),
CONSTRAINT emp_supervisor FOREIGN KEY (emp_supervisorID) REFERENCES Employee(emp_id),
CONSTRAINT emp_warehouse FOREIGN KEY (emp_WarehouseID) REFERENCES Warehouse(WhID),
CONSTRAINT emp_ManagDept FOREIGN KEY (emp_ManagDeptID) REFERENCES ManagmentDept(dept_id)
);


CREATE TABLE Dependent
(
emp_id number(38),
dependent_phone number(38),
dependent_Fname varchar2(38),
dependent_Mname varchar2(38),
dependent_Lname varchar2(38),
CONSTRAINT dependenEmp FOREIGN KEY (emp_id) REFERENCES Employee(emp_id)
);


CREATE TABLE ManagmentdeptBudgetsWarehouse
(
warehouseID number(38),
dept_id number(38),
CONSTRAINT ManagWarehouse FOREIGN KEY (warehouseID) REFERENCES Warehouse(WhID),
CONSTRAINT Managdept FOREIGN KEY (dept_id) REFERENCES ManagmentDept(dept_id)
);

CREATE TABLE Customer
(
customer_phone number(38) NOT NULL,
customer_Fname varchar2(38) NOT NULL,
customer_Mname varchar2(38),
customer_Lname varchar2(38) NOT NULL,
customer_address varchar2(38),
CONSTRAINT customer_pk PRIMARY KEY (customer_phone)
);



CREATE TABLE ORD
(
OrderID number(38),
orderDate varchar2(38),
customer_phone number(38),
CONSTRAINT order_pk PRIMARY KEY (OrderID),
CONSTRAINT orderCustomer FOREIGN KEY (customer_phone) REFERENCES Customer(customer_phone)
);

CREATE TABLE Payment
(
customer_phone number(35),
PaymentID number(38),
Recipt varchar2(40),
PaymentType varchar2(20),
PaymentDate varchar2(35),
CONSTRAINT payment_pk PRIMARY KEY (PaymentID),
CONSTRAINT PaymentCustomer FOREIGN KEY (customer_phone) REFERENCES Customer(customer_phone)
);

CREATE TABLE Supplier
(
SID number(38),
SupName varchar2(38),
Sup_phone number(38),
Address varchar2(80),
CONSTRAINT Supplier_pk PRIMARY KEY (SID)
);




CREATE TABLE Product
(
ProductID number(38),
Pname varchar2(38),
Price number(38),
WarehouseID number(38),
CONSTRAINT product_pk PRIMARY KEY (ProductID),
CONSTRAINT productWarehouse FOREIGN KEY (WarehouseID) REFERENCES Warehouse(WhID)
);

CREATE TABLE ProductInOrder
(
OrderID number(38),
ProductID number(38),
Quantity number(38),
CONSTRAINT productInOrder PRIMARY KEY (ProductID, OrderID),
CONSTRAINT productOrderID FOREIGN KEY (OrderID) REFERENCES ORD(OrderID),
CONSTRAINT productOrderNum FOREIGN KEY (ProductID) REFERENCES Product(ProductID)
);

CREATE TABLE SupplierSupplies
(
ProductID number(38),
SupID number(38),
CONSTRAINT SupplierSuppliespProduct_ID FOREIGN KEY (ProductID) REFERENCES Product(ProductID),
CONSTRAINT SupplierSuppliespSupID FOREIGN KEY (SupID) REFERENCES Supplier(SID)
);

ALTER TABLE Warehouse ADD CONSTRAINT WarehouseManager FOREIGN KEY (MEmpID) REFERENCES Employee(emp_id);