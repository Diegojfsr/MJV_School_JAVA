-- Requisitos-------------------------------------------------------------------------------------------------------------------------------
-- Criação da tabela tab_ficha_profissional contendo os campos: 
-- Id (pk-auto increment), Nome, Email, Telefone, Endereco (Logradouro, Numero, Bairro, Cidade, Estado), Profissão, Salario Minimo Pretendido, Salario Maximo Pretendido, Estrangeiro;

-- ----------------------------------------------------------------------------Jornada--------------------------------------------------------------------------------------------------------------
CREATE DATABASE -- { 
	mjv_school_java; -- Criei um database, para manter os registros de B.D. Organizado
-- }
USE -- {
	mjv_school_java; -- Comando para selecionar um banco e trabalhar com os proximos comando em cima dele
-- }
SET -- { 
	SQL_SAFE_UPDATES = 0;  -- Comando para corrigir o erro 1175. Desabilita o "safe mode" o modo de segurança do Mysql Workbench
-- }

 -- ----------------------------------------------------------------------------DDL---------------------------------------------------------------------------------------------------------------
 -- {
-- Criar a tabela citada acima contemplando os campos destacados, desconsiderando inicialmente o campo profissao;
-- Alterar a tabela para a inclusão do campo profissao;
-- Alterar a coluna email para que ela possa suportar até 100 caracteres;
-- }
 -- -------------------------------------------------------------------------COMANDOS-----------------------------------------------------------------------------------------------------

CREATE TABLE tab_ficha_profissional (
	tfp_id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,	-- Valor Interiro - Auto Inclement, o numero e gerado automaticamente, evitando erros no preenchimento - não e nulo -  E chave primeria, não se repetindo nos registros.
	tfp_nome VARCHAR(50) NOT NULL,	-- NOT NULL- Esse campo não pode ser nulo
    tfp_email VARCHAR(50),
    tfp_telefone CHAR (15), 	-- CHAR para tamanho fixo, seja ele preenchido ou nao sempre vai ocupar 15 caracteres (Geralmente esse valor vem de uma segunda tabela. "Contatos")
    tfp_numero CHAR (5),		-- CHAR para tamanho fixo, seja ele preenchido ou nao sempre vai ocupar 5 caracteres (Geralmente esse valor vem de uma segunda tabela. "Enderecos")
    tfp_logradouro VARCHAR (50),
    tfp_bairro VARCHAR (50),
    tfp_cidade VARCHAR (50),
    tfp_estado VARCHAR (50),
    -- tfp_profissao VARCHAR (50), // Será acrescentado com ALTER TABLE
    tfp_salario_min DOUBLE,
    tfp_salario_max DOUBLE,
    tfp_estrangeiro CHAR (3)	-- CHAR para tamanho fixo, seja ele preenchido ou nao sempre vai ocupar 3 caracteres (Geralmente esse valor vem de uma segunda tabela. "Nacimento")
); -- CTRL + ENTER


ALTER TABLE -- {
	tab_ficha_profissional ADD tfp_profissao VARCHAR(50); -- // Comando para adicionar a coluna profissao
-- }
ALTER TABLE -- {
	tab_ficha_profissional CHANGE tfp_email tfp_email VARCHAR(100); -- 	// Comando para alterar o  tamanho dos dados da coluna email de 50 para 100  
-- 																	// Altera a tabela Ficha Profissional, troca a coluna Email para Email(ou outro nome qualquer), com tipo VARCHAR(100) 
-- }

-- -------------------------------------------------------------------------------DML-------------------------------------------------------------------------
-- {
-- Realizar um insert com 10 registros profissionais - SEM INFORMAR O VALOR DA COLUNA PROFISSÃO;
-- Definir as profissões via update nos registros inseridos, considerando a alteração individualmente;
-- Excluir todos os registros que o campo estrangeiro for considerado verdadeiro;
-- O cadastro de Id=3 deverá residir no endereco: Logradouro='PRACA DA SE', Numero = 'S/N', Bairro = 'CENTRO', Cidade = 'SAO PAULO', Estado = 'SP';
-- }
-- -------------------------------------------------------------------------------COMANDOS----------------------------------------------------------------------
INSERT INTO -- {
	tab_ficha_profissional ( tfp_nome, tfp_email, tfp_telefone, tfp_numero, tfp_logradouro, tfp_bairro, tfp_cidade, tfp_estado, tfp_salario_min, tfp_salario_max, tfp_estrangeiro)
-- }
VALUES -- {
	("Diego Jefferson", "diegojfsr@gmail.com", "21967208702", "535", "Rua Almirante Frontim", "Ramos", "Rio de Janeiro", "RJ", 1500.00, 2000.00, "Nao"),
	("Matheus Alencar Silva", "malencar292@gmail.com", "979706131","92", "Rua Eugenio Kusnet","Vila Santa Teresa", "São Paulo","SP", 1800.50, 3800.00, "Não" ),
	("Luiz Magnun", "magnunluiz2@gmail.com", "31984069033","S/N", "PRACA DA SE","CENTRO", "São Paulo","SP", 2500.00, 3500.00, "Não" ), -- Perfil informado pela descrição do EX.
	("Camila Souza", "camifstack@gmail.com", "91993800039","152", "Rua Qualquer","Marambaia", "Belém","PA", 1500.00, 2500.00, "Não" );
-- }
UPDATE -- {
	tab_ficha_profissional SET tfp_profissao = 'UX/UI Design' WHERE tfp_nome = 'Diego Jefferson';
-- }
SELECT * FROM -- {
	tab_ficha_profissional;  -- Comado para Exibir todos os dados de uma tabela
-- }
DELETE FROM -- { 
	tab_ficha_profissional WHERE tfp_estrangeiro = "Sim";  -- Comado para Excluir todos os dados onde a Coluna Estrangeiro = SIM
-- }

-- -------------------------------------------------------------------------------DQL-------------------------------------------------------------------------
-- {
-- Retornar uma lista contendo os campos: Nome, Email, Profissao e Faixa Salarial ordenado por Profissão, Nome;
-- Retornar uma lista contendo os campos: Nome, Email, Profissao e Faixa Salarial ordenado por Profissão, Salario Máximo do maior para o menor;
-- Retornar uma lista com a seguinte informação concatenada e apelidada de nome_profissao: NOME + ' - ' + PROFISSAO;
-- Retornar uma lista contendo o nome da profissão e a quantidade de registros da profissão.
-- Retornar o registro com menor salário mínimo;
-- Retornar se existir o registro com a seguinte condição: Nome parecido com 'MARCOS PAULO' e Salario Maximo maior que 1200 e Salario Maximo menor ou igual que 2000 e que o Estado esteja entre SP, RJ, SC.
-- }
-- -------------------------------------------------------------------------------COMANDOS----------------------------------------------------------------------

SELECT -- {
	tfp_nome, tfp_email, tfp_profissao, tfp_salario_min, tfp_salario_max
FROM 
	tab_ficha_profissional 
ORDER BY 
	tfp_nome;
-- }

SELECT -- {
	tfp_nome, tfp_email, tfp_profissao, tfp_salario_min, tfp_salario_max
FROM 
	tab_ficha_profissional 
ORDER BY 
	tfp_salario_max DESC;
-- }

SELECT  -- {
	CONCAT( tfp_nome ), CONCAT(tfp_profissao ) 
AS 
	Nome_Profissao 
FROM  
	tab_ficha_profissional;
-- }



