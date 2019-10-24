create table student
(
sno int primary key,
name varchar(30) not null,
sub1 int,
sub2 int,
sub3 int,
total1 numeric(9,2),
aveg numeric(9,2)
)

insert into student(sno,name,sub1,sub2,sub3)
values(1,'pream',67,65,74),
       (2,'laksh',77,68,53),
       (3,'vishali',78,43,78),
       (4,'deepa',88,56,75)
       
       select * from student
       
       
       update student 
       set
       total1=sub1+sub2+sub3,
       aveg=(sub1+sub2+sub3)/3
       
       select * from student
       
       delete  from student where sno=1 
       