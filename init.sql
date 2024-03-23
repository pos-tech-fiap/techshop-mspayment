-- Criar database
-- CREATE DATABASE techshop;

-- Conectar ao database
\c techshop;

CREATE TABLE tb_payment (
    id BIGINT PRIMARY KEY,
    status VARCHAR(255) not null,
    method VARCHAR(255) not null,
    user_id BIGINT not null,
    value double precision not null
);
