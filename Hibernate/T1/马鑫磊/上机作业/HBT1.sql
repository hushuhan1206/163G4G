create database db_user;
use db_user;
go
create table t_user(
id int primary key identity(1,1),
uname varchar(20) not null,
upwd varchar(20) not null
)