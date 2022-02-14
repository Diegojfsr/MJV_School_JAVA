# MJV_School_JAVA_Grupo2-Semana3
<h4>Repositório destinado a documentar todos os trabalhos, exercícios e projetos desenvolvidos em Grupos durante todo o DevSchool-MJV.</h4>
<p> Nesta semana o desafio é criar uma jornada de instruções SQL contemplando comandos DDL + DML + DQL.</p>

<h2>Requisitos</h2>

<p> 1-Criação da tabela tab_ficha_profissional contendo os campos: Id (pk-auto increment), Nome, Email, Telefone, Endereco (Logradouro, Numero, Bairro, Cidade, Estado), Profissão, Salario Minimo Pretendido, Salario Maximo Pretendido, Estrangeiro;</p>
<p> 2-Descrever como o banco de dados escolhido trata os tipos de dados em questão;</p>
<p> 3-Apresentar todo o conteúdo em um arquivo .sql destacando as observações como comentário no script. (ver padrão de comentários no banco de dados selecionado).</p>

<h2>Jornada</h2>

<h5>DDL</h5>
<p> 1-Criar a tabela citada acima contemplando os campos destacados, desconsiderando inicialmente o campo profissao;</p>
<p> 2-Alterar a tabela para a inclusão do campo profissao;</p>
<p> 3-Alterar a coluna email para que ela possa suportar até 100 caracteres;</p>

<h5>DML</h5>
<p> 1-Realizar um insert com 10 registros profissionais;</p>
<p> 2-Definir as profissões via update nos registros inseridos, considerando a alteração individualmente;</p>
<p> 3-Excluir todos os registros que o campo estrangeiro for considerado verdadeiro;</p>
<p> 4-O cadastro de Id=3 deverá residir no endereco: Logradouro='PRACA DA SE', Numero = 'S/N', Bairro = 'CENTRO', Cidade = 'SAO PAULO', Estado = 'SP';</p>

<h5>DQL</h5>
<p> 1-Retornar uma lista contendo os campos: Nome, Email, Profissao e Faixa Salarial ordenado por Profissão, Nome;</p>
<p> 2-Retornar uma lista contendo os campos: Nome, Email, Profissao e Faixa Salarial ordenado por Profissão, Salario Máximo do maior para o menor;<p/>
<p> 3-Retornar uma lista com a seguinte informação concatenada e apelidada de nome_profissao: NOME + ' - ' + PROFISSAO;</p>
<p> 4-Retornar uma lista contendo o nome da profissão e a quantidade de registros da profissão.</p>
<p> 5-Retornar o registro com menor salário mínimo;</p>
<p> 6-Retornar se existir o registro com a seguinte condição: Nome parecido com 'MARCOS PAULO' e Salario Maximo maior que 1200 e Salario Maximo menor ou igual que 2000 e que o Estado esteja entre SP, RJ, SC.<p/>

<h5>Intruções</h5>
<p> 1-Realizem todo o processo em um base de dados, comentando cada etapa de evolução do projeto</p>
<p> 2-Para a apresentação do projeto, re-executem em um nova base de dados o arquivo script.sql por etapas</p>

<h5>Referências</h5>
https://www.devmedia.com.br/sql-max-min-avg-sum-e-count/41218
https://docs.oracle.com/cloud/help/pt_BR/reportingcs_use/BILUG/GUID-4EE8C58D-391B-46A9-B0B3-9FA91B8159D1.htm#BILUG664

