-- Criando o SCHEMA poo (USER: poo | SENHA: trabalhopoo)
CREATE TABLESPACE tbs_poo DATAFILE 'tbs_poo.dbf' SIZE 20M AUTOEXTEND ON;

CREATE USER poo
  IDENTIFIED BY trabalhopoo
  DEFAULT TABLESPACE tbs_poo
  QUOTA 20M on tbs_poo;

GRANT create session TO poo;
GRANT create table TO poo;
GRANT create view TO poo;
GRANT create any trigger TO poo;
GRANT create any procedure TO poo;
GRANT create sequence TO poo;
GRANT create synonym TO poo;

-- Conectando ao usuário
conn poo/trabalhopoo@XE

-- Criando as tabelas
CREATE TABLE tbaluno (
  cpf          VARCHAR2(11) NOT NULL,
  nome         VARCHAR2(50) NOT NULL,
  datanasc     VARCHAR2(10) NOT NULL,
  rg           VARCHAR2( 9) NOT NULL,
  sexo         VARCHAR2( 1) NOT NULL,
  estadocivil  VARCHAR2(10) NOT NULL,
  telefone     VARCHAR2(10),
  celular      VARCHAR2(11),
  endereco     VARCHAR2(50) NOT NULL,
  numero       NUMBER,
  bairro       VARCHAR2(30) NOT NULL,
  cidade       VARCHAR2(30) NOT NULL,
  estado       VARCHAR2(30) NOT NULL,
  cep          VARCHAR2( 9) NOT NULL,
  email        VARCHAR2(50) NOT NULL,
  escolaridade VARCHAR2(30) NOT NULL,
  CONSTRAINT pk_tbaluno PRIMARY KEY (cpf)
);

CREATE TABLE tbinstrutor (
  cpf          VARCHAR2(11) NOT NULL,
  nome         VARCHAR2(50) NOT NULL,
  datanasc     VARCHAR2(10) NOT NULL,
  rg           VARCHAR2( 9) NOT NULL,
  sexo         VARCHAR2( 1) NOT NULL,
  estadocivil  VARCHAR2(10) NOT NULL,
  telefone     VARCHAR2(10),
  celular      VARCHAR2(11),
  endereco     VARCHAR2(50) NOT NULL,
  numero       NUMBER,
  bairro       VARCHAR2(30) NOT NULL,
  cidade       VARCHAR2(30) NOT NULL,
  estado       VARCHAR2(30) NOT NULL,
  cep          VARCHAR2( 9) NOT NULL,
  email        VARCHAR2(50) NOT NULL,
  formacao     VARCHAR2(30) NOT NULL,
  areaatuacao  VARCHAR2(30) NOT NULL,
  CONSTRAINT pk_tbinstrutor PRIMARY KEY (cpf)
);

CREATE TABLE tbcurso (
  sigla         VARCHAR2(   5) NOT NULL,
  nome          VARCHAR2(  50) NOT NULL,
  cargahoraria  NUMBER         NOT NULL,
  valor         NUMBER  (14,2) NOT NULL,
  datavigencia  VARCHAR2(  10) NOT NULL,
  valorhorainst NUMBER  (14,2) NOT NULL,
  programa      VARCHAR2(  50) NOT NULL,
  CONSTRAINT pk_curso PRIMARY KEY (sigla)
);

CREATE TABLE tbturma (
  siglaturma    VARCHAR2( 15) NOT NULL,
  siglacurso    VARCHAR2(  5) NOT NULL,
  descricao     VARCHAR2(100) NOT NULL,
  datainicio    VARCHAR2( 10) NOT NULL,
  datatermino   VARCHAR2( 10) NOT NULL,
  periodo       VARCHAR2( 10) NOT NULL,
  qtdvagas      NUMBER        NOT NULL,
  observacoes   VARCHAR2(500),
  CONSTRAINT pk_turma PRIMARY KEY (siglaturma),
  CONSTRAINT fk_siglacurso FOREIGN KEY (siglacurso) REFERENCES tbcurso (sigla)
);
