show databases;

create database bankapplication;

use bankapplication;

show tables;

create table bank (id int primary key auto_increment, bankName varchar(30), branch varchar(20));

insert into bank values(200001,'Neema Bank','Bangaluru');

create table address (addressId int primary key auto_increment, street varchar(30), city varchar(20),state varchar(20),zipcode int,id int not null, foreign key(id) references bank(id) on delete cascade on update cascade);


insert into address values(100001,'2nd Street','Bengaluru','Karnataka',560066,200003);



select * from address;

