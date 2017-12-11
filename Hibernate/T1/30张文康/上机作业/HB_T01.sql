use db_users
create table t_user(
uid int primary key identity(1,1),
uname varchar(20) not null,
upwd varchar(20) not null,
sex varchar(1) not null,
birthday varchar(20) not null,
enable int 
)
select * from t_user