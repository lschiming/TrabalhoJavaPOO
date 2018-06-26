-- Conectando ao usuário
conn poo/trabalhopoo@XE

-- Alterando tabelas

ALTER TABLE tbturma ADD cpfinstrutor VARCHAR2(11);
ALTER TABLE tbturma ADD CONSTRAINT fk_cpfinstrutor FOREIGN KEY (cpfinstrutor) REFERENCES tbinstrutor (cpf);

-- (Ou recriando)

DROP TABLE tbturma;

CREATE TABLE tbturma (
  siglaturma    VARCHAR2( 15) NOT NULL,
  siglacurso    VARCHAR2(  5) NOT NULL,
  descricao     VARCHAR2(100) NOT NULL,
  datainicio    VARCHAR2( 10) NOT NULL,
  datatermino   VARCHAR2( 10) NOT NULL,
  periodo       VARCHAR2( 10) NOT NULL,
  qtdvagas      NUMBER        NOT NULL,
  observacoes   VARCHAR2(500),
  cpfinstrutor  VARCHAR2(11),
  CONSTRAINT pk_turma PRIMARY KEY (siglaturma),
  CONSTRAINT fk_siglacurso FOREIGN KEY (siglacurso) REFERENCES tbcurso (sigla),
  CONSTRAINT fk_cpfinstrutor FOREIGN KEY (cpfinstrutor) REFERENCES tbinstrutor (cpf)
);

-- Criando novas tabelas

CREATE TABLE tbmatricula (
  cpfaluno       VARCHAR2( 15) NOT NULL,
  siglacturma    VARCHAR2(  5) NOT NULL,
  datamatricula  VARCHAR2( 10) NOT NULL,
  qtdefaltas     NUMBER,
  nota           NUMBER,
  CONSTRAINT pk_matricula PRIMARY KEY (cpfaluno, siglacturma)
);

CREATE TABLE tbavista (
  cpfaluno       VARCHAR2( 15) NOT NULL,
  siglacturma    VARCHAR2(  5) NOT NULL,
  datamatricula  VARCHAR2( 10) NOT NULL,
  valor          NUMBER        NOT NULL,
  agencia        NUMBER        NOT NULL,
  ncheque        NUMBER,
  predata        VARCHAR2( 10),
  CONSTRAINT pk_avista PRIMARY KEY (cpfaluno, siglacturma, datamatricula)
);

CREATE TABLE tbaprazo (
  cpfaluno         VARCHAR2( 15) NOT NULL,
  siglacturma      VARCHAR2(  5) NOT NULL,
  datamatricula    VARCHAR2( 10) NOT NULL,
  valor            NUMBER        NOT NULL,
  dtvencimento     VARCHAR2( 10) NOT NULL,
  taxajuros        NUMBER        NOT NULL,
  qtdemensalidade  NUMBER        NOT NULL,
  CONSTRAINT pk_aprazo PRIMARY KEY (cpfaluno, siglacturma, datamatricula)
);
