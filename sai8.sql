use sqlpractice;
show tables
describe employ
select * from employ
select empno,name,basic from employ;
select * from employ where basic >5000
select * from employ where dept='dotnet'
select * from employ where dept  not in('dotnet','java')
select * from employ where name like 'k%'
select * from employ order by dept desc

select * from employ where basic between 10000 and 70000
union all
select * from employ where basic between 50000 and 80000