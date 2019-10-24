create database inventory;

use inventory;
desc stock
create table stock
(
	stockid varchar(30) primary key,
	ItemName varchar(30),
	Price numeric(9,2),
	QuantityAvail INT
);

Create table Orders
(
   OrderId INT,
   StockID varchar(30),
   QtyOrd INT,
   billAmt numeric(9,2)
);

Create Table Amount
(
  Gamt numeric(9,2)
);

insert into amount values(0);

commit;
select * from inventory