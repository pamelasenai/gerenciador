![logo.png](logo.png)
# Exercícios da Semana 8
#### _(26/02/2024 a 01/03/2024)_

## ✏️ Descrição
Este projeto foi desenvolvido conforme as especificações passadas pelo professor, abaixo estão os exercícios 
contendo as exigências do projeto.

## 🎯  Missões/Objetivos
- [x] [Spring Initializer e repositório no GitHub](#-m1s08-ex-1---spring-initializer-e-repositório-no-github)
- [x] [Classe Aluno](#-m1s08-ex-2---alunos)
- [x] [Classe Curso](#-m1s08-ex-3---cursos)
- [ ] [Service Alunos](#-m1s08-ex-4---service-alunos)
- [ ] [Service Cursos](#-m1s08-ex-5---service-cursos)
- [ ] [Controller Alunos](#-m1s08-ex-6---controller-alunos)
- [ ] [Controller Cursos](#-m1s08-ex-7---controller-cursos)
- [ ] [Matricular alunos](#-m1s08-ex-8---matricular-alunos)

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