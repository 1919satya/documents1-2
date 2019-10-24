create database sqlpractice1;
use sqlpractice1;
CREATE TABLE EMPLOYEE 
 ( EMP_ID int NOT NULL auto_increment , 
 NAME VARCHAR(50), 
 PRIMARY KEY (EMP_ID)
 );
 
 CREATE TABLE EMPLOYEE_ADDRESS
 ( 
 ADDR_ID int NOT NULL auto_increment , 
 EMP_ID int NOT NULL , 
 STREET VARCHAR(60), 
 CITY VARCHAR(40), 
 STATE VARCHAR(60), 
 COUNTRY VARCHAR(50), 
 PRIMARY KEY (ADDR_ID));
 
insert into EMPLOYEE values(default,'sai'),
(default,'satya'),
(default,'sakshi'),
(default,'nag'),
(default,'rakesh'),
(default,'pavan'),
(default,'ram');

insert into EMPLOYEE_ADDRESS values(default,1,'rk street','kakinada','AP','India'),
(default,2,'sk street','kakinada','AP','India'),
(default,3,'mr street','vizag','AP','India'),
(default,4,'rakesh street','vijawada','AP','India'),
(default,5,'kaja street','chennai','TN','India'),
(default,6,'naga street','hyderabad','TS','India'),
(default,7,'hotel street','agra','UP','India');