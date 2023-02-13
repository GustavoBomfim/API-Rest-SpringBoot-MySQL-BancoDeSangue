create table doadores(
    id bigint not null auto_increment,
    nome varchar(255) not null,
    cpf varchar(15) not null unique,
    rg varchar(15) not null unique,
    data_nasc date not null ,
    sexo varchar(12) not null,
    mae varchar(50) not null,
    pai varchar(50) not null,
    email varchar(50) not null unique,
    cep varchar(12) not null,
    endereco varchar(50) not null,
    numero int not null,
    bairro varchar(30) not null,
    cidade varchar(30) not null,
    estado char(2) not null,
    telefone_fixo varchar(15),
    celular varchar (15) not null,
    altura double not null,
    peso int not null,
    tipo_sanguineo varchar(4) not null,

    primary key(id)
);