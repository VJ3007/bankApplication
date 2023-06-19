show databases;

create database bankapplication;

use bankapplication;

show tables;

create table bank (id int primary key auto_increment, bankName varchar(30), branch varchar(20));

insert into bank values(200001,'Neema Bank','Bangaluru');

create table address (addressId int primary key auto_increment, street varchar(30), city varchar(20),state varchar(20),zipcode int, bankId int,customerId int, foreign key(bankId) references bank(id) on delete cascade on update cascade,foreign key(customerId) references customer(customerId) on delete cascade on update cascade);


insert into address values(100001,'2nd Street','Bengaluru','Karnataka',560066,200003,null);

create table customer (customerId int primary key auto_increment, customerName varchar(30),phoneNo varchar(15),gender varchar(10),email varchar(50));

insert into customer values(300001,'Neema','1234567890','Female','neema@gmail.com');


select * from address;

