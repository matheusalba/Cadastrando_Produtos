create table categoria(
id int not null auto_increment primary key,
nome varchar(25) not null
)

create table produto(
id int not null auto_increment primary key,
id_categoria int not null,
nome varchar(25) not null,
preco_custo double not null,
preco_venda double not null,
data_estoque date,
pais_origem varchar(25) not null,
fornecedor varchar(25) not null
)

alter table produto add foreign key (id_categoria) references categoria(id)

create table venda(
id_produto int not null,
quantidade int not null,
data_venda date,
id_cliente int not null)

alter table venda add foreign key (id_produto) references produto(id)

alter table venda add foreign key (id_cliente) references cliente(id_cliente)

create table cliente(
id_cliente int not null auto_increment primary key,
nome varchar(25) not null,
cidade varchar(25)
)