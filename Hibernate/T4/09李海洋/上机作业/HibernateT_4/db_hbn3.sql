create database db_hbn3;
use db_hbn3;
--用户表
create table emp(
eid int primary key identity(1001,1),
ename nvarchar(20) not null,
esex char(2) not null,
ebirth nvarchar(20) not null,
did int
)

--部门表
create table dept(
did int primary key identity(1,1),
dname nvarchar(20) not null,
dadress nvarchar(20) not null
)
--用户信息表
create table empInfo(
id int primary key,
name nvarchar(20) not null,
pwd nvarchar(20) not null
)

select * from emp;


select * from emp;
select * from dept;
insert into dept values('技术部','办公二楼');
insert into dept values('董事会','行政顶层');