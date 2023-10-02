
create table paciente (

id int primary key auto_increment,
cpf varchar(20),
nome varchar(20),

)

create table quarto (

id int primary key auto_increment,
numero int, 
andar int,
paciente_id int,
foreign key (paciente_id) references paciente(id)


);