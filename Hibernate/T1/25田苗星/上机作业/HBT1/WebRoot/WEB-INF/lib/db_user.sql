create database db_user;

use db_user;

create table User(
id int identity(1,1),
uname char(25),
upwd char(25),
birthday date,
sex char(2),
enable int
);