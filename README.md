# Ecommerce API - Projeto de Estudo 🚀

Este projeto é uma API REST desenvolvida para fins de aprendizagem e prática, focada em boas práticas de desenvolvimento backend com Java e Spring Boot. O foco principal desta etapa foi a implementação de uma arquitetura robusta com tratamento de exceções e uma suíte completa de testes automatizados.

## 🛠 Tecnologias Utilizadas
- **Java 21**
- **Spring Boot 3.4.1**
- **Spring Data JPA**
- **H2 Database** (Banco de dados em memória para ambiente de testes)
- **JUnit 5 & Mockito** (Testes unitários e de integração)
- **Maven** (Gestão de dependências)

## 🏗 Arquitetura e Padrões
O projeto segue o padrão de camadas para garantir a separação de responsabilidades:
- **Entities & DTOs:** Estrutura de dados e transferência de objetos.
- **Repositories:** Camada de acesso a dados com Spring Data JPA.
- **Services:** Camada de lógica de negócio e regras da aplicação.
- **Controllers:** Camada de recursos REST (Endpoints).
- **Handlers:** Tratamento global de exceções para respostas HTTP padronizadas.

## 🧪 Suíte de Testes (TDD Mindset)
A aplicação conta com uma cobertura abrangente de testes:
- **Testes de Unidade (Service):** Validação da lógica com mocks (Mockito).
- **Testes de Integração (Controller):** Validação de endpoints e payloads JSON via MockMvc.
- **Testes de Persistência (Repository):** Validação de operações de banco de dados no H2.

## 📝 Como Executar
1. Clone o repositório:
   ```bash
   git clone [https://github.com/Gabres96/ecommerce-api.git](https://github.com/Gabres96/ecommerce-api.git)
   Instale as dependências e execute a aplicação:

2. instale as dependências e execute a aplicação:
./mvnw spring-boot:run

3. Para rodar toda a suíte de testes:
./mvnw test
