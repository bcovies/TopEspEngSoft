CREATE TABLE "usuario" (
  "id" serial NOT NULL,
  "nome" character varying(50) NOT NULL,
  "sobrenome" character varying(50) NOT NULL,
  "cpf" character varying(11) NOT NULL,
  "email" character varying(50) NOT NULL,
  "senha" character varying(16) NOT NULL,
  "endereco" character varying(70),
  "nascimento" character varying(8) NOT NULL,
  "cartao" character varying(16) NOT NULL
);
