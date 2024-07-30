-- Extensão para gerar UUIDs
CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

-- Criação da tabela de usuários
CREATE TABLE IF NOT EXISTS tb_users (
    user_id UUID PRIMARY KEY DEFAULT uuid_generate_v4(),
    username VARCHAR(255) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    task_Sequence INTEGER
);

-- Criação da tabela de tarefas com UUID e task_number sequencial por usuário
CREATE TABLE IF NOT EXISTS tb_tasks (
    task_id UUID PRIMARY KEY DEFAULT uuid_generate_v4(),
    user_id UUID NOT NULL,
    title VARCHAR(255) NOT NULL,
    task_number INTEGER NOT NULL,
    description TEXT,
    due_date DATE,
    urgency INTEGER NOT NULL CHECK (urgency BETWEEN 1 AND 2),
    importance INTEGER NOT NULL CHECK (importance BETWEEN 1 AND 2),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (user_id) REFERENCES tb_users (user_id),
    UNIQUE (user_id, task_number)
);