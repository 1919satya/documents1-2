show tables

desc emp

/* display all records from emp table */

select *from employ

/* display empno,ename and sal from emp table */
select
empno,
ename,
sal
from emp

select
empno,
ename,
sal,
sal+1000,
sal-1000
from emp

desc dept

select * from dept

select
deptno,
dname,
loc
from dept


/* display all records whose sal >2000 */

select * from emp
where sal > 2000


/* display all records whose jobis clerk */

select * from emp
where job ='clerk'

/* display all records manager */
select * from emp
where job='manager'

/* between */

select * from emp
where sal between 1000 and 2500


select * from emp
where sal not  between 1000 and 2500

select * from emp
where hiredate between '1980-01-01'
and '1982-06-31'

select * from emp
where hiredate  not between '1980-01-01'
and '1982-06-31'

select * from emp
where job in('clerk','salesman','manager')

select * from emp
where job  not in('clerk','salesman','manager')

select * from emp
where sal in(3000,5000)

select * from emp
where sal  not in(3000,5000)

select * from emp
select 
empno,
job,
ename,
sal
from emp
order by job,ename

select * from emp
select 
empno,
job,
ename,
sal
from emp
order by job,ename desc

select distinct job from emp


select 
empno,
ename,
job,
case job
when 'clerk' then 'dharma'
when 'salesman' then 'vishal'
when 'manager' then 'raju'
when 'analyst' then 'vinod'
when 'president' then 'no manager'
end 'manager'
from emp

select 
empno,
ename,
job,
case job
when 'clerk' then sal+500
when 'salesman' then sal+600
when 'manager' then sal+1000
when 'analyst' then sal+500
when 'president' then sal
end 'inc sal'
from emp
