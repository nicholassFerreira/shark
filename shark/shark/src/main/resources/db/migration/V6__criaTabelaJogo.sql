create table Jogo (

	id bigint NOT NULL PRIMARY KEY AUTO_INCREMENT,
	titulo VARCHAR(1000) NOT NULL,
	descricao VARCHAR(20) NOT NULL,
	preco VARCHAR(50) NOT NULL, 
	dt_lancamento VARCHAR(75) NOT NULL, 
	nome_desenvolvedora VARCHAR(20),
	nome_publisher VARCHAR(20)

)