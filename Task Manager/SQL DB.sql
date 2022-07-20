create database taskmanager;
show databases;

use taskmanager;

create table tuser(
id int primary key auto_increment,
tipo int not null,
nome varchar(50) not null,
cpf varchar(11) not null,
senha varchar(8) not null
);

insert into tuser (tipo,nome, cpf, senha) values(1,"João Paulo Carolina de Morais","04276602114","Jopacamo");

select * from tuser;
