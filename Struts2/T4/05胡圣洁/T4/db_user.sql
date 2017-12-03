create database db_user;
use db_user;
go
create table tb_user(
	id int primary key identity(1,1),	
	uname varchar(20) not null,	
	upwd varchar(20) not null,	
	edu varchar(20) not null,	
	sex int 	
	
)

