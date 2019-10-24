create database hclbank;
use hclbank;
create table user(
id int not null primary key auto_increment,
username varchar(30) unique not null,
password varchar(40) not null);

insert into user values(default,'sai','1'),
(default,'satya','2'),
(default,'janu','3'),
(default,'hema','4');

create table account(
accountnum int not null primary key auto_increment,
amount double ,
accounttype char ,
userid int ,
foreign key (userid) references user(id));
insert into account values(default,'24500','S',1),
(default,'24600','C','2'),
(default,'25500','S','3'),
(default,'24700','S','4');