create database db_hbn6;
use db_hbn6;
--角色表
create table roles(
roleId int primary key identity(1001,1),
roleName varchar(20) not null,
memo varchar(50)
)
--用户信息表
create table userInfo(
userId int primary key,
userName varchar(20) not null,
password varchar(20) not null
)
--角色表-用户信息表
create table roles_userInfo(
roleId int not null,
userId int not null
)

select * from roles
select * from userInfo
select * from roles_userInfo