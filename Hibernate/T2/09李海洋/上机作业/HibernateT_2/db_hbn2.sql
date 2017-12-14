create database db_hbn2;
use db_hbn2;
--用户表
create table emp(
eid int primary key identity(1001,1),
ename nvarchar(20) not null,
esex char(2) not null,
ebirth date not null
)
--用户信息表
create table empInfo(
id int primary key,
name nvarchar(20) not null,
pwd nvarchar(20) not null
)

select * from emp;
select * from empInfo;