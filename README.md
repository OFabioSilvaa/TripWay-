# 🚀 Projeto TripWay Backend API

![Java](https://img.shields.io/badge/Java-17-blue?logo=java&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.x-green?logo=spring&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-8.x-orange?logo=mysql&logoColor=white)
![Gradle](https://img.shields.io/badge/Gradle-7.x-02303A?logo=gradle&logoColor=white)
![REST API](https://img.shields.io/badge/API-REST-informational?style=flat)
![Status](https://img.shields.io/badge/Status-Finalizado-brightgreen)

## ✨ Sobre o Projeto

Este projeto consiste na API de backend para a aplicação TripWay, desenvolvida com o objetivo de gerenciar dados de **clientes**, **pacotes de viagem** e **destinos**. A API foi construída seguindo os princípios RESTful, oferecendo operações completas de CRUD (Create, Read, Update, Delete) para cada uma dessas entidades, conectando-se a um banco de dados relacional MySQL.

O foco principal foi demonstrar a integração robusta entre Java (utilizando o framework Spring Boot) e SQL (MySQL), criando uma base de dados eficiente e segura para as operações do aplicativo.

## 🛠️ Tecnologias Utilizadas

* **Linguagem:** Java 24
* **Framework:** Spring Boot 3.x
* **Persistência:** Spring Data JPA e Hibernate
* **Banco de Dados:** MySQL 8.x
* **Gerenciador de Dependências:** Gradle
* **Servidor Web Embarcado:** Apache Tomcat
* **Ferramentas de Teste:** Postman / Insomnia

## 🚀 Como Executar o Projeto Localmente

Siga estes passos para configurar e rodar a API do TripWay em sua máquina local:

### Pré-requisitos

Certifique-se de ter as seguintes ferramentas instaladas:

* **Java Development Kit (JDK) 17:** 
* **MySQL Server 8.x:** 
* **MySQL Workbench (ou similar):** Para gerenciar o banco de dados.
* **Postman ou Insomnia:** Para testar os endpoints da API.
* **IntelliJ IDEA (ou outra IDE Java):** Para abrir e rodar o projeto.

### Configuração do Banco de Dados

1.  **Inicie o Servidor MySQL:** Certifique-se de que sua instância do MySQL Server esteja ativa e rodando (via XAMPP, MySQL Installer, ou como um serviço).
2.  **Crie o Banco de Dados:** Usando o MySQL Workbench ou seu cliente SQL preferido, execute o comando para criar o schema:
    ```sql
    CREATE DATABASE tripway_db;
    ```
3.  **Configurações de Conexão:** As credenciais e detalhes de conexão com o banco de dados estão configuradas no arquivo `src/main/resources/application.properties`. Por padrão, ele usa:
    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/tripway_db
    spring.datasource.username=root
    spring.datasource.password=
    spring.jpa.hibernate.ddl-auto=update
    spring.jpa.show-sql=true
    spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
    ```
    * **Importante:** Se você usa uma senha diferente para o `root` do MySQL, ou outro usuário, ajuste `spring.datasource.username` e `spring.datasource.password` de acordo.

### Rodando a Aplicação

1.  **Clone o Repositório:** (Se você ainda não clonou e está começando do zero)
    ```bash
    git clone [https://github.com/OFabioSilvaa/TripWay-.git](https://github.com/OFabioSilvaa/TripWay-.git)
    cd TripWay-
    ```
2.  **Abra no IntelliJ IDEA:**
    * No IntelliJ, selecione `File` > `Open...` e navegue até a pasta raiz do projeto `TripWay-`.
    * Aguarde o IntelliJ sincronizar as dependências do Gradle.
3.  **Execute a Aplicação:**
    * Navegue até a classe principal: `src/main/java/com/tripway.tripway/TripwayApplication.java`.
    * Clique no botão verde de "play" (Run) ao lado do método `main()` ou use `Run > Run 'TripwayApplication'`.
    * A aplicação será iniciada e estará disponível na porta `8080` por padrão.

## 🔗 Endpoints da API

A API expõe os seguintes endpoints RESTful para gerenciar as entidades:

* **Base URL:** `http://localhost:8080`

### Destinos (`/destinos`)

| Método | Endpoint                  | Descrição                                         |
| :----- | :------------------------ | :------------------------------------------------ |
| `GET`  | `/destinos`               | Lista todos os destinos cadastrados.              |
| `GET`  | `/destinos/{id}`          | Busca um destino específico pelo seu ID.          |
| `POST` | `/destinos`               | Cria um novo destino.                             |
| `PUT`  | `/destinos/{id}`          | Atualiza um destino existente pelo seu ID.        |
| `DELETE` | `/destinos/{id}`          | Exclui um destino pelo seu ID.                    |

**Exemplo de JSON para `POST /destinos` ou `PUT /destinos/{id}`:**

```json
{
    "nomeCidade": "Rio de Janeiro",
    "nomePais": "Brasil",
    "descricao": "Cidade maravilhosa, praias incríveis e Cristo Redentor."
}
