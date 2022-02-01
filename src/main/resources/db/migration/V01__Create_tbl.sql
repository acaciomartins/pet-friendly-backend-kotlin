CREATE TABLE categoria (
  id bigint NOT NULL AUTO_INCREMENT,
  nome varchar(100) NOT NULL,
  status bit(1) NOT NULL,
  PRIMARY KEY (id),
  UNIQUE KEY UK_prx5elpv558ah8pk8x18u56yc (nome)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE regra (
  id bigint NOT NULL AUTO_INCREMENT,
  nome varchar(255) NOT NULL,
  status bit(1) NOT NULL,
  PRIMARY KEY (id)
) ENGINE=MyISAM AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE servico (
  id bigint NOT NULL AUTO_INCREMENT,
  nome varchar(255) NOT NULL,
  status bit(1) NOT NULL,
  PRIMARY KEY (id)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE usuario (
  id bigint NOT NULL AUTO_INCREMENT,
  email varchar(255) NOT NULL,
  latitude int NOT NULL,
  longitude int NOT NULL,
  nome varchar(100) NOT NULL,
  status bit(1) NOT NULL,
  taxa decimal(12,2) DEFAULT NULL,
  telefone varchar(25) DEFAULT NULL,
  categoria_id bigint DEFAULT NULL,
  PRIMARY KEY (id),
  KEY FK_usuario_x_categoria (categoria_id)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE usuario_regra (
  usuario_id bigint NOT NULL,
  regra_id bigint NOT NULL,
  KEY FK_usuario_regra_x_regra (regra_id),
  KEY FK_usuario_regra_x_usuario (usuario_id)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE usuario_servico (
  usuario_id bigint NOT NULL,
  servico_id bigint NOT NULL,
  KEY FK_usuario_servico_x_servico (servico_id),
  KEY FK_usuario_servico_x_usuario (usuario_id)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;