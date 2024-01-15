/* Each block is a warehouse, which has a Supervisor and a Managment Department */





/* WAREHOUSE 1 */
insert into Warehouse values(700,1,null);
insert into ManagmentDept values(1,500000,256023);
insert into Employee values(2046430,'ibrahim','ayman','Alqurshi', 100000001 , 0549947405 , 'Jeddah' , 10000 , 2046430,1,1);
UPDATE Warehouse set MEmpID = 2046430 where WhID = 1; 
insert into Dependent values(2046430,0549947469, 'Eyad' , 'ayman' , 'alqurshi');
insert into Employee values(2030202,'omer','Hamad','Alzharani', 100000002 , 0521341232 , 'Jeddah' , 9000 , 2046430,1,1);  
insert into Employee values(2030203,'ahmad','mohamad','Alsifier', 100000003 , 0521341864 , 'Jeddah' , 8000 , 2046430,1,1); 
insert into Employee values(2030204,'hani','khalid','alqhatani', 100000004 , 0521341754 , 'Jeddah' , 6000 , 2046430,1,1); 
insert into Employee values(2030205,'abdullah','fwaz','mleeh', 100000005 , 0521341245 , 'Jeddah' , 7000 , 2046430,1,1); 
insert into Employee values(2030206,'anas','twfeg','mansie', 100000006 , 0521341112 , 'Jeddah' , 8500 , 2046430,1,1); 
insert into ManagmentdeptBudgetsWarehouse values(1,1);


/* WAREHOUSE 2 */
insert into Warehouse values(1000,2,null);
insert into ManagmentDept values(2,700000,501700);
insert into Employee values(2030501,'mohamad','abdullah','alharbi', 1000000007 , 0521341123 , 'alkobar' , 10000 , 2030501,2,2); 
insert into Dependent values(2030501,0549945502,'fadi', 'mohamad', 'alharbi');
insert into Employee values(2030502,'abdullaziz','faisal','alJohani', 100000008 , 0521341532 , 'alkobar' , 6600 , 2030501,2,2); 
insert into Dependent values(2030502,0549947412,'fahad', 'faisal', 'alJohani');
UPDATE Warehouse set MEmpID = 2030501 where WhID = 2;
insert into Employee values(2030503,'fahad','ahmad','moglan', 100000009 , 0521234531 , 'alkobar' , 6600 , 2030501,2,2); 
insert into Dependent values(2030503,0549941212,'Ahamd', 'fahad', 'moglan');
insert into Employee values(2030504,'khalid','saud','kutbi', 100000010 , 0521341222 , 'alkobar' , 6600 , 2030501,2,2); 
insert into Dependent values(2030504,0549947412,'fahad', 'khalid', 'kutbi');
insert into Employee values(2030505,'hamad','hussan','melebary', 100000011 , 0521312342 , 'alkobar' , 6600 , 2030501,2,2); 
insert into Dependent values(2030505,0549913312,'hussan', 'hamad', 'melebary');
insert into Employee values(2030506,'ahmad','faisal','alJohani', 100000012 , 0521323532 , 'alkobar' , 6600 , 2030501,2,2);
insert into Dependent values(2030506,0549953212,'fahad', 'faisal', 'alJohani');
insert into ManagmentdeptBudgetsWarehouse values(2, 2);


/* SUPPLIER */


insert into Supplier values(1, 'adidas', 0549342342, '3337 Prince Majid Rd,8799، Jeddah 22245 3337');
insert into Supplier values(2, 'Supply yeezy', 0549343256,'Andalus Mall, Al Fayhaa, Jeddah 22245');
insert into Supplier values(3, 'Nike', 05495837432,'7458 Al-Madinah Al-Munawarah Rd, Al Baghdadiyah Al Gharbiyah District, Jeddah');
insert into Supplier values(4, 'Inditex',05483748134 ,'Mönckebergstraße 11, 20095 Hamburg, Germany');

/* Adding products */
insert into Product values(1001, 'CHECK BLAZER begie', 300, 1);
insert into Product values(1002, 'shirt long sleevs', 250, 1);
insert into Product values(1003, 'Hoodie oversize vintage', 400, 1);
insert into Product values(1004, 'trousers baggy', 150, 1);
insert into Product values(1005, 'Nike shoes Cristiano', 530, 1);
insert into Product values(1006, 'lether Jacket', 410, 1);
insert into Product values(1007, 'Oversize t-shirt', 120, 1);
insert into Product values(1008, 'Tracksuit adidas', 275, 2);
insert into Product values(1009, 'yeezy 500 ', 1100, 2);
insert into Product values(1010, 'yeezy 700', 1200, 2);
insert into Product values(1011, 'yeezy 350 v2', 1500, 2);
insert into Product values(1012, 'adidas underware', 70, 2);
insert into Product values(1013, '2 pairs of sucks', 110, 2);


/* SUPPLIER SUPPLIES PRODUCT */
insert into SupplierSupplies values(1001, 4);
insert into SupplierSupplies values(1002, 4);
insert into SupplierSupplies values(1003, 4);
insert into SupplierSupplies values(1004, 4);
insert into SupplierSupplies values(1005, 3);
insert into SupplierSupplies values(1006, 4);
insert into SupplierSupplies values(1007, 3);
insert into SupplierSupplies  values(1008, 1);
insert into SupplierSupplies  values(1009, 2);
insert into SupplierSupplies  values(1010, 2);
insert into SupplierSupplies  values(1011, 2);
insert into SupplierSupplies  values(1012, 3);
insert into SupplierSupplies  values(1013, 3);

/* CUSTOMER  */
insert into Customer values(0502345552, 'reem', 'ahamd', 'AlQahtani','alkobr');
insert into Customer values(0592737523, 'nasser', 'mohamd', 'subhi','almedina');
insert into Customer values(0573323345, 'saud', 'abdullah', 'aldossry','Riyadh');
insert into Customer values(0527452345, 'saeed', 'naif', 'selimanie','Makkah');
insert into Customer values(0545323456, 'faisal', 'fahad', 'aldail','Jeddah');
insert into Customer values(0512365235, 'mbrook', 'sameer', 'aljohani', 'Jeddah');
insert into Customer values(0524176597, 'Noof', 'hassan', 'Alotibie', 'Dammam');
insert into Customer values(0562112345, 'Eyad', 'saud', 'alrajhi', 'Riyadh');


/* Making order and adding Products to the order */

insert into ORD values(101, '11-3-2022', 0527452345);
insert into ProductinOrder values(101, 1001,1);
insert into ProductinOrder values(101, 1002, 2);
insert into ProductinOrder values(101, 1003, 1);
insert into ProductinOrder values(101, 1012, 1);
insert into ORD values(102, '12-3-2022',0562112345);
insert into ProductinOrder values(102, 1012, 2);
insert into ProductinOrder values(102, 1010, 1);
insert into ProductinOrder values(102, 1011, 1);
insert into ProductinOrder values(102, 1001, 1);
insert into ORD values(103, '20-3-2022',0502345552);
insert into ProductinOrder values(103, 1007, 2);
insert into ProductinOrder values(103, 1009, 1);
insert into ProductinOrder values(103, 1008, 1);



/* PAYMENTS */
insert into Payment values(0527452345, 0, '**THANK YOU FOR PURCHASING**', 'CARD', '11-3-2022');
insert into Payment values(0562112345, 1, '**THANK YOU FOR PURCHASING**', 'CASH ON Delivery', '15-3-2022');
insert into Payment values(0502345552, 2, '**THANK YOU FOR PURCHASING**', 'CARD', '20-3-2022');
