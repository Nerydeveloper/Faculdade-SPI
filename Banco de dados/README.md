### Curso de banco de dados com mysql

Um banco de dados é um sistema organizado e estruturado para armazenar, gerenciar e recuperar informações de maneira eficiente. Ele é projetado para coletar e armazenar dados de forma que possam ser facilmente acessados, atualizados e consultados quando necessário. Os bancos de dados desempenham um papel fundamental em diversas aplicações e sistemas, desde simples aplicativos de gerenciamento de contatos até sistemas complexos de processamento de transações em grande escala.

### Definições
* DDL - Definições
* DML - Manipulação
* DQL - Solicitações
* DCL - Controle
* DTL - Transações

As transações devem seguir 4 principios;

* Durabilidadde
* Isolamento
* Consistência
* Atomicidade



### Principios
Atomicidade: 

    O princípio da atomicidade diz que uma transação em um banco de dados deve ser tratada como uma unidade atômica. Isso significa que todas as operações em uma transação devem ser executadas com sucesso ou nenhuma delas deve ser executada. Se uma operação falhar, todas as operações anteriores devem ser revertidas para manter a consistência dos dados.

Consistência: 

    A consistência refere-se à integridade dos dados em um banco de dados. Os dados devem obedecer a regras e restrições definidas, garantindo que apenas dados válidos e corretos sejam armazenados no banco de dados.

Isolamento: 

    O princípio do isolamento lida com a capacidade de várias transações de ocorrerem simultaneamente no banco de dados sem interferir umas nas outras. Cada transação deve ser isolada das outras para evitar conflitos e manter a integridade dos dados.

Durabilidade: 

    A durabilidade garante que, uma vez que uma transação seja confirmada, suas alterações sejam permanentes e sobrevivam a falhas no sistema. Mesmo em caso de queda de energia ou falhas no sistema, as alterações confirmadas devem ser preservadas.

Normalização: 

    A normalização é um processo de design de banco de dados que envolve a organização de dados em tabelas relacionadas para minimizar a redundância e garantir a eficiência do armazenamento. Isso ajuda a reduzir erros de atualização e melhora a consistência dos dados.

Integridade Referencial: 
    
    A integridade referencial envolve a criação de relacionamentos entre tabelas em um banco de dados e a garantia de que esses relacionamentos sejam mantidos. Isso é alcançado por meio de chaves estrangeiras que conectam tabelas e garantem que os dados relacionados sejam consistentes.

Segurança: 
    
    A segurança dos dados é fundamental. Os bancos de dados devem implementar autenticação e autorização para controlar quem pode acessar e modificar os dados. Isso é crucial para proteger informações confidenciais.



## Hora de escrever

* Como criar um banco de dados ?
```sql
create database nomeDoBanco;
```
* Como criar uma tabela ?
```sql
create table nomeDaTabela();
```
* Determinando os tipos de dados para a tabela

```sql
create database pessoa(
    id int not null auto_increment,
    nome varchar(20),
    nascimento date,
    genero enum('M','F'),
    altura decimal(3,2)
);
```
##### Tipos de dados mais comuns em um banco de dados
    
    varchar
        nome varchar(30)
    char
        nome char(30)
    date
        nascimento date - Formato aaaa/mm/dd
    datetime
        update datetime - formato aaaa/mm/dd HH:MM:SS
    int
        usuario_id int
    decimal
        altura decimal(3,2)
    enum
        sexo enum('M','F')

##### Parametros 
    not null - Não nulo
    auto_increment - Auto incremento
    default - Padrão
    null - Aceita valores nulos
    unique - Unico 
    foreign key - Chave estrangeira

* Inserindo valores na tabela
```sql
insert into nomeDaTabela(dado1,dado2...) values(valor1,valor2...);
```
* Alterando uma tabela

    Obs: você pode alterar uma tabela seja para inserir, excluir ou modificar um tipo de dado na coluna.

```sql
-- ADICIONANDO NOVA COLUNA
alter table nomeDaTabela add nomeDaColuna tipoDeDado;
-- EXEMPLO
alter table pessoa 
add sobrenome varchar(30);

-- MODIFICANDO DADO DE UMA COLUNA EXISTENTE 
ALTER TABLE nome_da_tabela
ALTER COLUMN nome_da_coluna novo_tipo_de_dado;
-- EXEMPLO
ALTER TABLE pessoa 
ALTER COLUMN sobrenome char(10);

-- EXCLUINDO COLUNA 
ALTER TABLE nome_da_tabela
DROP COLUMN nome_da_coluna;
-- EXEMPLO
ALTER TABLE pessoa
DROP nome;
```

