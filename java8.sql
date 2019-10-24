create database java8streams;

use java8streams;

create table Employee(
empNo int not null auto_increment,
empName varchar(40),
salary float,
band char,
dateOfJoin datetime,
primary key(empNo)
);

select  * from Employee;

insert into Employee values(default, 'Nag', 8000, 'E', '2000-09-01');
insert into Employee values(default, 'Sobha', 5000, 'E', '2000-08-12');
insert into Employee values(default, 'Vardan', 9000, 'E', '2007-05-14');
insert into Employee values(default, 'Sai', 2500, 'E', '2016-04-01');
insert into Employee values(default, 'Prem', 6800, 'E', '2016-07-30');
insert into Employee values(default, 'Kumar', 3300, 'E', '2019-06-01');
insert into Employee values(default, 'Vinod', 4900, 'E', '2007-03-27');
insert into Employee values(default, 'Yash', 8800, 'E', '2000-01-29');
insert into Employee values(default, 'Yashwanth', 1500, 'E', '2007-09-01');
insert into Employee values(default, 'SaiKumar', 4300, 'E', '2012-02-21');

insert into Employee values(default, 'Ram', 8700, 'C', '2001-09-01');
insert into Employee values(default, 'Ramesh', 3400, 'C', '2004-05-21');
insert into Employee values(default, 'Rajesh', 9000, 'C', '2007-05-14');
insert into Employee values(default, 'Sreenu', 2590, 'C', '2016-04-01');
insert into Employee values(default, 'Ravi', 6800, 'C', '2016-07-30');
insert into Employee values(default, 'Priyanka', 3390, 'C', '2017-06-01');
insert into Employee values(default, 'Gopi', 4900, 'C', '2005-03-27');
insert into Employee values(default, 'Sandeep', 6800, 'C', '2000-01-29');
insert into Employee values(default, 'Uma', 1900, 'C', '2017-09-01');
insert into Employee values(default, 'Suvarna', 3300, 'C', '2013-02-21');

insert into Employee values(default, 'Maha', 18700, 'M', '2001-09-01');
insert into Employee values(default, 'Rishab', 13400, 'M', '2004-05-21');
insert into Employee values(default, 'Tushar', 20000, 'M', '2019-05-24');
insert into Employee values(default, 'Uttam', 18090, 'M', '2015-04-01');
insert into Employee values(default, 'Laksh', 16800, 'M', '2001-07-30');
