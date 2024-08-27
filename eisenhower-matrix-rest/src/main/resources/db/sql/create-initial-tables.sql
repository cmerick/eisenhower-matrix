-- Extensão para gerar UUIDs
CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

-- Criação da tabela de usuários
CREATE TABLE IF NOT EXISTS tb_users (
    id UUID PRIMARY KEY DEFAULT uuid_generate_v4(),
    username VARCHAR(255) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    role CHAR(3) NOT NULL,
    task_sequence INTEGER
);

-- Criação da tabela de tarefas com UUID e task_number sequencial por usuário
CREATE TABLE IF NOT EXISTS tb_tasks (
    id UUID PRIMARY KEY DEFAULT uuid_generate_v4(),
    user_id UUID NOT NULL,
    title VARCHAR(255) NOT NULL,
    task_number INTEGER NOT NULL,
    description TEXT,
    due_date DATE,
    urgency BOOLEAN NOT NULL,
    importance BOOLEAN NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    status CHAR(1) NOT NULL,
    FOREIGN KEY (user_id) REFERENCES tb_users (id),
    UNIQUE (user_id, task_number)
);