create database db_user;
use db_user
go
create table t_user(
uid int primary key identity(1,1),
name varchar(20),
password varchar(20),
birthday datetime,
sex varchar(2),
love varchar(20),
active varchar(20)
)