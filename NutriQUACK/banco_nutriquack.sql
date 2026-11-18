-- 1. Criação e seleção do Banco de Dados
CREATE DATABASE nutriquack;
GO

USE nutriquack;
GO

-- 2. Tabela de Pessoas (Tabela Pai)
CREATE TABLE pessoas (
    id INT IDENTITY(1,1) PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    cpf VARCHAR(14) NOT NULL UNIQUE,
    data_nascimento DATE NOT NULL,
    sexo CHAR(1) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE,
    telefone VARCHAR(15) NOT NULL,
    senha_hash CHAR(60) NOT NULL,
    CONSTRAINT chk_sexo CHECK (sexo IN ('M', 'F'))
);
GO

SELECT * FROM pessoas;
GO

-- 3. Categorias de Alimentos (Tabela Auxiliar)
CREATE TABLE categoria_alimento (
    id_categoria INT IDENTITY(1,1) PRIMARY KEY,
    nome_categoria VARCHAR(50) NOT NULL
);
GO

SELECT * FROM categoria_alimento;
GO

-- 4. Tipos de Refeição (Tabela Auxiliar)
CREATE TABLE tipo_refeicao (
    id_refeicao INT IDENTITY(1,1) PRIMARY KEY,
    nome_refeicao VARCHAR(50) NOT NULL
);
GO

SELECT * FROM tipo_refeicao;
GO

-- 5. Nutricionista (Especialização de Pessoa)
CREATE TABLE nutricionista (
    id_nutricionista INT PRIMARY KEY REFERENCES pessoas(id),
    crn VARCHAR(20) NOT NULL,
    especialidade VARCHAR(100)
);
GO

SELECT * FROM nutricionista;
GO

-- 6. Paciente (Especialização de Pessoa)
CREATE TABLE paciente (
    id_paciente INT PRIMARY KEY REFERENCES pessoas(id),
    altura DECIMAL(3,2) NOT NULL,
    objetivo VARCHAR(60),
    nivel_atividade_fisica VARCHAR(60),
    historico_medico VARCHAR(MAX),
    restricoes VARCHAR(MAX)
);
GO

SELECT * FROM paciente;
GO

-- 7. Alimento (Referencia Categoria)
CREATE TABLE alimento (
    id_alimento INT IDENTITY(1,1) PRIMARY KEY,
    id_categoria INT NOT NULL REFERENCES categoria_alimento(id_categoria),
    nome_alimento VARCHAR(100) NOT NULL,
    calorias DECIMAL(6,2) NOT NULL DEFAULT 0.00,
    proteinas DECIMAL(5,2) NOT NULL DEFAULT 0.00,
    carboidratos DECIMAL(5,2) NOT NULL DEFAULT 0.00,
    gorduras_totais DECIMAL(5,2) NOT NULL DEFAULT 0.00,
    fibras DECIMAL(5,2) NOT NULL DEFAULT 0.00,
    sodio DECIMAL(7,2) NOT NULL DEFAULT 0.00
);
GO

SELECT * FROM alimento;
GO

-- 8. Avaliações Físicas (Referencia Paciente)
CREATE TABLE avaliacoes_fisicas (
    id_avaliacao INT IDENTITY(1,1) PRIMARY KEY,
    id_paciente INT NOT NULL REFERENCES paciente(id_paciente),
    data_avaliacao DATE NOT NULL DEFAULT GETDATE(),
    
    -- Pesos e Composição Corporal
    peso DECIMAL(5,2) NOT NULL,
    percentual_gordura DECIMAL(4,2),
    kg_gordura DECIMAL(5,2),
    massa_magra DECIMAL(5,2),
    
    -- Circunferências (cm)
    cintura DECIMAL(5,2),
    quadril DECIMAL(5,2),
    braco DECIMAL(5,2),
    torax DECIMAL(5,2),
    coxa DECIMAL(5,2),

    -- Dobras Cutâneas (mm)
    dobra_triceps DECIMAL(4,1),
    dobra_subescapular DECIMAL(4,1),
    dobra_suprailiaca DECIMAL(4,1),

    -- Índices Calculados
    imc DECIMAL(4,2),
    tmb DECIMAL(6,2)
);
GO

SELECT * FROM avaliacoes_fisicas;
GO

-- 9. Planos Alimentares (Referencia Paciente e Nutricionista)
CREATE TABLE planos_alimentares (
    id_plano INT IDENTITY(1,1) PRIMARY KEY,
    id_paciente INT NOT NULL REFERENCES paciente(id_paciente),
    id_nutricionista INT NOT NULL REFERENCES nutricionista(id_nutricionista),
    
    titulo_plano VARCHAR(100) NOT NULL,
    data_inicio DATE NOT NULL DEFAULT GETDATE(),
    data_fim DATE,
    objetivo_calorico DECIMAL(6,2) NOT NULL DEFAULT 0.00,
    observacoes VARCHAR(MAX)
);
GO

SELECT * FROM planos_alimentares;
GO

-- 10. Refeição (Referencia Plano e Tipo de Refeição)
CREATE TABLE refeicao (
    id_refeicao INT IDENTITY(1,1) PRIMARY KEY,
    id_plano INT NOT NULL REFERENCES planos_alimentares(id_plano),
    id_tipo INT NOT NULL REFERENCES tipo_refeicao(id_refeicao),
    horario TIME NOT NULL,
    status VARCHAR(20) NOT NULL DEFAULT 'Ativa',
    observacao VARCHAR(MAX)
);
GO

SELECT * FROM refeicao;
GO

-- 11. Item da Refeição (Tabela Associativa N:M - Referencia Refeicao e Alimento)
CREATE TABLE item_refeicao (
    id_refeicao INT NOT NULL REFERENCES refeicao(id_refeicao),
    id_alimento INT NOT NULL REFERENCES alimento(id_alimento),
    quantidade DECIMAL(6,2) NOT NULL,
    unidade_medida VARCHAR(30) NOT NULL DEFAULT 'gramas',
    calorias_totais DECIMAL(6,2) NOT NULL DEFAULT 0.00,
    CONSTRAINT pk_item_refeicao PRIMARY KEY (id_refeicao, id_alimento)
);
GO

SELECT * FROM item_refeicao;
GO

-- Dados de exemplo: executar uma vez em banco vazio
INSERT INTO pessoas (nome,cpf,data_nascimento,sexo,email,telefone,senha_hash) VALUES ('Mariana Costa','123.456.789-01','1990-04-12','F','mariana@example.com','11999991001',REPLICATE('a',60)),('Rafael Lima','234.567.890-12','1985-09-23','M','rafael@example.com','11999991002',REPLICATE('b',60)),('Camila Souza','345.678.901-23','2001-02-08','F','camila@example.com','21999991003',REPLICATE('c',60)),
('Bruno Almeida','456.789.012-34','1995-06-17','M','bruno@example.com','11999991004',REPLICATE('d',60)),
('Juliana Martins','567.890.123-45','1998-11-03','F','juliana@example.com','11999991005',REPLICATE('e',60)),
('Pedro Oliveira','678.901.234-56','1988-01-25','M','pedro@example.com','11999991006',REPLICATE('f',60)),
('Ana Ribeiro','789.012.345-67','2000-07-14','F','ana@example.com','11999991007',REPLICATE('g',60)),
('Lucas Ferreira','890.123.456-78','1993-03-29','M','lucas@example.com','11999991008',REPLICATE('h',60)),
('Beatriz Santos','901.234.567-89','1997-12-09','F','beatriz@example.com','11999991009',REPLICATE('i',60)),
('Diego Carvalho','012.345.678-90','1991-08-21','M','diego@example.com','11999991010',REPLICATE('j',60));

INSERT INTO categoria_alimento (nome_categoria) VALUES
('Frutas'),('Proteínas'),('Cereais'),('Laticínios'),('Verduras'),('Legumes'),('Oleaginosas'),('Bebidas'),('Óleos e gorduras'),('Doces');

INSERT INTO tipo_refeicao (nome_refeicao) VALUES
('Café da manhã'),('Almoço'),('Lanche'),('Jantar'),('Ceia'),('Pré-treino'),('Pós-treino'),('Colação'),('Lanche da tarde'),('Refeição livre');

INSERT INTO nutricionista (id_nutricionista,crn,especialidade) VALUES
(1,'CRN-3 12345','Nutrição esportiva'),(2,'CRN-3 23456','Nutrição clínica'),
(3,'CRN-3 34567','Nutrição funcional'),(4,'CRN-3 45678','Nutrição pediátrica'),
(5,'CRN-3 56789','Nutrição geriátrica'),(6,'CRN-3 67890','Nutrição hospitalar'),
(7,'CRN-3 78901','Nutrição vegetariana'),(8,'CRN-3 89012','Nutrição materno-infantil'),
(9,'CRN-3 90123','Nutrição esportiva'),(10,'CRN-3 01234','Nutrição comportamental');

INSERT INTO paciente (id_paciente,altura,objetivo,nivel_atividade_fisica,historico_medico,restricoes) VALUES (2,1.78,'Reeducação alimentar','Moderado','Sem condições relatadas','Nenhuma'),(3,1.65,'Composição corporal','Leve','Sem condições relatadas','Intolerância à lactose'),
(1,1.70,'Manutenção de peso','Moderado','Sem condições relatadas','Nenhuma'),
(4,1.82,'Ganho de massa','Intenso','Sem condições relatadas','Nenhuma'),
(5,1.58,'Emagrecimento','Leve','Sem condições relatadas','Nenhuma'),
(6,1.75,'Reeducação alimentar','Moderado','Sem condições relatadas','Nenhuma'),
(7,1.63,'Melhora da saúde','Leve','Sem condições relatadas','Nenhuma'),
(8,1.80,'Ganho de massa','Intenso','Sem condições relatadas','Nenhuma'),
(9,1.68,'Manutenção de peso','Moderado','Sem condições relatadas','Nenhuma'),
(10,1.72,'Reeducação alimentar','Leve','Sem condições relatadas','Nenhuma');

INSERT INTO alimento (id_categoria,nome_alimento,calorias,proteinas,carboidratos,gorduras_totais,fibras,sodio) VALUES (1,'Banana',89,1.1,22.8,.3,2.6,1),(2,'Frango grelhado',165,31,0,3.6,0,74),(3,'Arroz integral',124,2.6,25.8,1,2.7,5),(4,'Iogurte natural',61,3.5,4.7,3.3,0,46),
(5,'Espinafre',23,2.9,3.6,0.4,2.2,79),
(6,'Batata-doce',86,1.6,20.1,0.1,3,3),
(7,'Amêndoas',579,21.2,21.6,49.9,12.5,1),
(8,'Água de coco',19,0.7,3.7,0.2,1.1,105),
(9,'Azeite de oliva',884,0,0,100,0,2),
(10,'Aveia',389,16.9,66.3,6.9,10.6,2);

INSERT INTO avaliacoes_fisicas (id_paciente,data_avaliacao,peso,percentual_gordura,kg_gordura,massa_magra,imc,tmb) VALUES (2,'2026-10-15',82.5,22,18.15,64.35,26.04,1780),(3,'2026-10-20',61.2,27,16.52,44.68,22.48,1380),
(1,'2026-10-22',70.0,20,14.0,56.0,24.22,1650),
(4,'2026-10-23',86.0,18,15.48,70.52,25.96,1900),
(5,'2026-10-24',58.0,29,16.82,41.18,23.23,1320),
(6,'2026-10-25',76.0,24,18.24,57.76,24.82,1700),
(7,'2026-10-26',63.0,26,16.38,46.62,23.71,1400),
(8,'2026-10-27',84.0,17,14.28,69.72,25.93,1850),
(9,'2026-10-28',68.0,22,14.96,53.04,24.09,1550),
(10,'2026-10-29',72.0,25,18.0,54.0,24.22,1600);

INSERT INTO planos_alimentares (id_paciente,id_nutricionista,titulo_plano,data_inicio,data_fim,objetivo_calorico,observacoes) VALUES (2,1,'Plano inicial','2026-11-01','2026-12-01',2200,'Exemplo'),(3,1,'Plano sem lactose','2026-11-01','2026-12-01',1800,'Exemplo'),
(1,2,'Plano manutenção','2026-11-02','2026-12-02',2000,'Plano demonstrativo'),
(4,3,'Plano ganho de massa','2026-11-03','2026-12-03',2600,'Plano demonstrativo'),
(5,4,'Plano emagrecimento','2026-11-04','2026-12-04',1700,'Plano demonstrativo'),
(6,5,'Plano equilibrado','2026-11-05','2026-12-05',2100,'Plano demonstrativo'),
(7,6,'Plano saúde geral','2026-11-06','2026-12-06',1900,'Plano demonstrativo'),
(8,7,'Plano hipertrofia','2026-11-07','2026-12-07',2500,'Plano demonstrativo'),
(9,8,'Plano manutenção','2026-11-08','2026-12-08',2050,'Plano demonstrativo'),
(10,9,'Plano reeducação','2026-11-09','2026-12-09',1950,'Plano demonstrativo');

INSERT INTO refeicao (id_plano,id_tipo,horario,status,observacao) VALUES (1,1,'07:30','Ativa','Café da manhã'),(1,2,'12:30','Ativa','Almoço'),(2,3,'16:00','Ativa','Lanche'),
(3,4,'19:00','Ativa','Jantar do plano 2'),
(4,5,'21:00','Ativa','Ceia'),
(5,6,'06:30','Ativa','Pré-treino'),
(6,7,'08:30','Ativa','Pós-treino'),
(7,8,'10:00','Ativa','Colação'),
(8,9,'15:30','Ativa','Lanche da tarde'),
(9,10,'12:00','Ativa','Refeição livre');

INSERT INTO item_refeicao (id_refeicao,id_alimento,quantidade,unidade_medida,calorias_totais) VALUES (1,1,1,'unidade',89),(2,2,150,'gramas',247.5),(2,3,120,'gramas',148.8),(3,1,1,'unidade',89),
(4,4,100,'gramas',61),
(5,5,80,'gramas',18.4),
(6,6,150,'gramas',129),
(7,7,30,'gramas',173.7),
(8,8,200,'ml',38),
(9,9,10,'ml',88.4);
GO
