Create Table Users
(
   username varchar(30) primary key,
   password varchar(30)
);

Insert into users values('Laksh','Laksh'),
   ('Kiruba','Laxmi'),
   ('Anubhav','Anand'),
   ('Venkat','Sai'),
   ('Darshini','Priya');
   
   select * from users
   SELECT * FROM STUDENT
   select * from exam
   drop table exam
   
   
   create table Exam(
mi int auto_increment primary key,
subName varchar(30),
marks  double,
sid int);

select count(*) from exam where sid=3