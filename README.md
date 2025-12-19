# Ecommerce API 🛒 

## 📝 Sobre o Projeto
Esta é uma API REST desenvolvida em Java e Spring Boot para gerenciar o catálogo de um sistema de E-commerce. O projeto foi construído para fornecer uma base sólida, escalável e segura para a gestão de produtos e suas respectivas categorias.

Atualmente, a API serve como o "coração" (backend) de uma loja virtual, permitindo a organização de itens e garantindo que os dados sejam entregues de forma rápida e estruturada.

## ✨ O que é possível fazer (Funcionalidades)
Atualmente, a API permite as seguintes operações:

### 📦 Gestão de Produtos
- **Listar Catálogo:** Recuperar todos os produtos cadastrados.
- **Consulta por ID:** Buscar detalhes específicos de um único produto.
- **Associação:** Cada produto é vinculado a uma categoria específica (ex: Consoles, Livros).

### 🏷️ Gestão de Categorias
- **Listar Categorias:** Recuperar todas as categorias existentes para organizar o menu da loja.

## 🛠 Tecnologias Utilizadas
- **Java 21** (LTS)
- **Spring Boot 3.4.1**
- **Spring Data JPA** (Persistência e ORM)
- **H2 Database** (Banco de dados em memória para testes e agilidade no dev)
- **JUnit 5 & Mockito** (Suíte completa de testes automatizados)
- **Maven** (Gerenciador de dependências e build)

## 🏗 Arquitetura do Sistema
A aplicação segue o padrão de camadas para facilitar a manutenção e evolução:
1. **Controllers:** Porta de entrada (Endpoints) que recebe as requisições HTTP.
2. **Services:** Onde a "mágica" acontece (Lógica de negócio e regras).
3. **Repositories:** Comunicação direta e segura com o banco de dados.
4. **Handlers:** Captura de erros global para garantir que a API nunca "trave" e sempre responda mensagens claras ao usuário.

## 🧪 Qualidade e Testes
Este projeto diferencia-se pela sua robusta cobertura de testes:
- **Testes de Unidade:** Validam as regras de negócio isoladamente.
- **Testes de Integração:** Validam se os Endpoints estão entregando o JSON correto.
- **Testes de Repositório:** Validam se os dados estão sendo salvos e buscados corretamente no banco de dados.

## 📝 Como Executar
1. Clone o repositório:
   ```bash
   git clone [https://github.com/Gabres96/ecommerce-api.git](https://github.com/Gabres96/ecommerce-api.git)

2. instale as dependências e execute a aplicação:
./mvnw spring-boot:run

3. Para rodar toda a suíte de testes:
./mvnw test
