create database db_user;
use db_user;
go
create table t_user(
	uid int primary key identity(1,1),
	name varchar(20) not null,
	password varchar(20) not null,
	birthday varchar(20) not null,
	sex varchar(1) not null,	
	isable int 
)


 