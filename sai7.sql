desc dept
desc emp

select  deptno from dept;
select distinct  deptno from emp;


select d.deptno,dname,empno,ename,sal from dept d left join emp e on d.deptno=e.deptno

select max(basic) from employ
select name from employ where basic=(select max(basic) from employ)
select * from employ where empno between 1 and 3 