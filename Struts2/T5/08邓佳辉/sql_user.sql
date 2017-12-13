create database db_user;

use db_user

create table tb_user(
	id int primary key not null,
	uname varchar(50) not null,
	upswd varchar(50) not null,
	birth varchar(50) not null,
	sex varchar(1) not null,
	enable tinyint not null
)