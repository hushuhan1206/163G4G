create database db_emp;
use db_emp;
go
create table t_emp(
  eid int primary key identity(1,1),
  empName varchar(20) not null,
  empSex varchar(5) not null,
  birthday varchar(20) not null,
  deptId int
)
create table t_userInfo(
   userId int primary key not null,
   userName  varchar(20) not null,
   password varchar(20) not null
)
create table t_dept(
   deptId int primary key identity(1,1),
   deptName  varchar(20) not null,
   deptAdress varchar(20)
)
select * from t_emp;
select * from t_userInfo;
--drop table t_dept;
select * from t_dept;