create database safitness;
use safitness;
create table cliente(
id_cliente int auto_increment primary key, 
nome_cliente varchar(100) not null,
cpf_cliente varchar(100) not null,
rg_cliente varchar(100) not null,
sexo_cliente varchar(100) not null,
estadocivil_cliente varchar(100) not null,
datanascimento_cliente varchar(100) not null,
telefonecelular_cliente varchar(100) not null,
email_cliente varchar(100) not null,
endereco_cliente varchar(100) not null,  
numrua_cliente varchar(100) not null,
bairro_cliente varchar(100) not null,
cidade_cliente varchar(100) not null,
estado_cliente varchar(100) not null,
cep_cliente varchar(100)
);

create table funcionario(
id_funcionario int auto_increment primary key,
nome_funcionario varchar(100) not null,
cpf_funcionario varchar(100) not null,
rg_funcionario varchar(100) not null,
sexo_funcionario varchar(100) not null,
estadocivil_funcionario varchar(100) not null,
datanascimento_funcionario varchar(100) not null,
telefonecelular_funcionario varchar(100) not null,
email_funcionario varchar(100) not null,
especializacao_funcionario varchar(100),
endereco_funcionario varchar(100) not null,  
numrua_funcionario varchar(100) not null,
bairro_funcionario varchar(100) not null,
cidade_funcionario varchar(100) not null,
estado_funcionario varchar(100) not null,
cep_funcionario varchar(100)
);

select * from cliente;
select * from funcionario;