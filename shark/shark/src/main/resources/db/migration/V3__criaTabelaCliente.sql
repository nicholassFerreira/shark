create table Cliente (

	id bigint NOT NULL PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR(1000) NOT NULL,
	cpf VARCHAR(20) NOT NULL,
	email VARCHAR(50) NOT NULL, 
	endereco VARCHAR(75) NOT NULL, 
	dt_nascimento VARCHAR(20)

)