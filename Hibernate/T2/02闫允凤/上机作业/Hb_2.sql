create database db_emp;
use db_emp;


create table t_emp(
eid int primary key identity(1,1),
ename varchar(20) not null,
esex varchar(4) not null,
ebirthday varchar(20) not null,
edid varchar(20) not null
)

create table t_userinfo(
uid int primary key,
uname varchar(20) not null,
upwd varchar(20) not null
)


select * from t_emp;
select * from t_userinfo;