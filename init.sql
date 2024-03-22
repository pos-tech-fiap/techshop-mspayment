-- Criar database
-- CREATE DATABASE techshop;

-- Conectar ao database
\c techshop;

CREATE TABLE tb_usuario (
    id BIGINT PRIMARY KEY,
    status VARCHAR(255) not null,
    method VARCHAR(255) not null,
    userId BIGINT not null,
    value double precision not null
);
