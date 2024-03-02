![logo.png](logo.png)
# Exercícios da Semana 8
#### _(26/02/2024 a 01/03/2024)_

## ✏️ Descrição
Este projeto foi desenvolvido conforme as especificações passadas pelo professor, abaixo estão os exercícios 
contendo as exigências do projeto.

## 👾 Endpoints
### Endpoints de alunos
- Buscar todos os alunos: ``api/alunos``
  - Descrição: Retorna um array vazio caso não haja alunos cadastrados ou array com todos os alunos.
- Buscar aluno por id: ``api/alunos/:id``
  - PathVariable: Integer id
  - Descrição: Retorna o aluno específico com o ID informado. 
- Criar novo aluno: ``api/alunos``
  - RequestBody
    ```json
      {
        "nome" : "Jane Doe",
        "dataNascimento" : "20/05/1988"
      }
    ```
  - Descrição: Cria um novo aluno com id, nome e data de nascimento, sendo o nome e data de nascimento fornecidos e id gerado automaticamente.
- Editar aluno: ``api/alunos/:id``
  - PathVariable: Integer id
  - RequestBody
    ```json
      {
        "nome" : "Jane Doe",
        "dataNascimento" : "20/05/1988"
      }
    ```
  - Descrição: Atualiza as informações de um aluno existente com o ID informado para as informações fornecidas.
- Excluir aluno: ``api/alunos/:id``
  - PathVariable: Integer id
  - Descrição: Exclui um aluno específico com o ID fornecido.

### Endpoints de cursos
- Buscar todos os cursos: ``api/cursos``
  - Descrição: Retorna um array vazio caso não haja cursos cadastrados ou array com todos os cursos.
- Buscar curso por id: ``api/cursos/:id``
  - PathVariable: Integer id
  - Descrição: Retorna o curso específico com o ID informado.
- Criar novo curso: ``api/cursos``
  - RequestBody
    ```json
      {
        "nome" : "FullStack[Education]",
        "descricao" : "curso de front e back end",
        "cargaHoraria": 400
      }
    ```
  - Descrição: Cria um novo curso com id, descrição e carga horária, sendo a descrição e carga horária fornecidos e id gerado automaticamente.
- Editar aluno: ``api/cursos/:id``
  - PathVariable: Integer id
  - RequestBody
    ```json
      {
        "nome" : "FullStack[Education]",
        "descricao" : "curso de front e back end",
        "cargaHoraria": 400
      }
    ```
  - Descrição: Atualiza as informações de um curso existente com o ID informado para as informações fornecidas.
- Excluir curso: ``api/cursos/:id``
  - PathVariable: Integer id
  - Descrição: Exclui um curso específico com o ID fornecido.
- Matricular aluno: ``api/cursos/:id/add-aluno``
  - PathVariable: Integer id
  - RequestBody
    ```json
      {
        "id" : 1
      }
    ```
  - Descrição: Adiciona ao curso específico com o ID informado o aluno com o ID informado, retorna o curso já contendo o aluno.
- Cancelar matricula do aluno: ``api/cursos/:id/remove-aluno``
  - PathVariable: Integer id
  - RequestBody
    ```json
      {
        "id" : 1
      }
    ```
  - Descrição: Remove do curso específico com o ID informado o aluno com o ID informado, retorna o curso já sem o aluno.

---

## 🎯  Missões/Objetivos
- [x] [Spring Initializer e repositório no GitHub](#-m1s08-ex-1---spring-initializer-e-repositório-no-github)
- [x] [Classe Aluno](#-m1s08-ex-2---alunos)
- [x] [Classe Curso](#-m1s08-ex-3---cursos)
- [x] [Service Alunos](#-m1s08-ex-4---service-alunos)
- [x] [Service Cursos](#-m1s08-ex-5---service-cursos)
- [x] [Controller Alunos](#-m1s08-ex-6---controller-alunos)
- [x] [Controller Cursos](#-m1s08-ex-7---controller-cursos)
- [x] [Matricular alunos](#-m1s08-ex-8---matricular-alunos)

## 📚 [M1S08] Ex 1 - Spring Initializer e repositório no GitHub
Crie um projeto Spring para gerenciamento de uma instituição de ensino. <br/>
Obs: Fique à vontade para dar nome o projeto.

Atenção!
Não esqueça de utilizar seus commits após o desenvolvimento.

## 📚 [M1S08] Ex 2 - Alunos
A primeira implementação do projeto: crie uma classe Aluno. <br/>
A classe deve conter ao menos os atributos:
- ID (sequencial)
- Nome
- Data de nascimento

**!!! IMPORTANTE !!!** <br/>
A classe deve conter um método estático para controlar a sequência dos IDs. <br/>
A classe deve estar devidamente encapsulada. <br/>
O atributo ID não deve possuir um método ```"set"```.

## 📚 [M1S08] Ex 3 - Cursos
O próximo passo: crie uma classe Cursos.
A classe deve conter ao menos os atributos: <br/>
- ID (sequencial)
- Nome
- Descrição
- Carga Horária

**!!! IMPORTANTE !!!**
A classe deve conter um método estático para controlar a sequência dos IDs. <br/>
A classe deve estar devidamente encapsulada. <br/>
O atributo ID não deve possuir um método ```"set"```. <br/>

## 📚 [M1S08] Ex 4 - Service: Alunos
Com todas as nossas classes modelo criadas: crie uma classe Service para manter as regras de negócio dos alunos.
- Cadastro de alunos
- Consulta de todos os alunos

**!!! Atenção !!!** <br/>
Para concluir o exercício será necessário realizar adequações na classe Aluno.
- Utilize um atributo estático e privado para o armazenamento dos alunos cadastrados
- Crie um método ```"get"```
- Crie um método responsável pela inclusão

## 📚 [M1S08] Ex 5 - Service: Cursos
Segundo com as classes Service: crie uma classe Service para manter a regra de negócio dos cursos.
- Cadastro de cursos
- Consulta de todos os cursos

**!!! Atenção !!!** <br/>
Para concluir o exercício será necessário realizar adequações na classe Curso.
- Utilize um atributo estático e privado para o armazenamento dos cursos cadastrados
- Crie um método ```"get"```
- Crie um método responsável pela inclusão

## 📚 [M1S08] Ex 6 - Controller: Alunos
Com todas os services criados: crie uma classe Controller para os alunos. <br/>
O controlador deve conter métodos para:
- Cadastro de novos alunos (POST)
- Consulta de todos os alunos (GET)

**!!! Atenção !!!** <br/>
Utilize a injeção de dependências para usar a classe Service de alunos

## 📚 [M1S08] Ex 7 - Controller: Cursos
Assim como foi criado para os Alunos, faça o mesmo com os Cursos. <br/>
Crie uma classe Controller para os cursos. <br/>
O controlador deve conter métodos para: <br/>
- Cadastro de novos cursos (POST)
- Consulta de todos os cursos (GET)

**!!! Atenção !!!** <br/>
Utilize a injeção de dependências para usar a classe Service de cursos

## 📚 [M1S08] Ex 8 - Matricular alunos
No Controller de cursos crie um novo método para matricular alunos no curso.  <br/>
O método deve receber: <br/>
- ID do curso no Path Param;
- ID do aluno no RequestBody.

Para concluir o exercício será necessário realizar adequações no projeto: <br/>
- Na classe Curso:
    - crie um atributo para representar uma lista de alunos matriculados;
    - utilize encapsulamento.
- No Service de alunos:
  - crie um método para encontrar um aluno usando seu ID.
- No Service de cursos:
  - crie um método para encontrar um curso usando seu ID;
  - crie um método realizar a matrícula (inclusão de um aluno na lista de alunos).

Obs: A regra de negócios deverá sempre ser utilizada no Service, 
não utilize o controlador para realizar buscas ou inserções.