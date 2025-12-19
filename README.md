# Ecommerce API 🛒

## 📝 Sobre o Projeto
Esta é uma API REST completa desenvolvida em Java e Spring Boot para o gerenciamento de um ecossistema de E-commerce. A aplicação foi projetada para ser o motor de uma loja virtual, permitindo o controle total sobre o catálogo de produtos e suas categorias, garantindo integridade de dados e respostas padronizadas.

O projeto demonstra o uso de tecnologias modernas e padrões de arquitetura de software exigidos pelo mercado, com foco em **testes automatizados** e **manutenibilidade**.

## ✨ Funcionalidades (CRUD Completo)
A API expõe todos os recursos necessários para uma gestão eficiente:

### 📦 Gestão de Produtos
- **Listar Catálogo:** Recuperação de todos os produtos com seus respectivos dados e categorias.
- **Consulta por ID:** Busca detalhada de um produto específico.
- **Inserir Novo Produto:** Cadastro de itens com validação de campos.
- **Atualizar Produto:** Edição de informações de produtos existentes.
- **Remover Produto:** Exclusão segura de itens do catálogo.

### 🏷️ Gestão de Categorias
- **Listar Categorias:** Visualização de todas as categorias disponíveis para organização do estoque.

## 🛠 Tecnologias Utilizadas
- **Java 21** (LTS)
- **Spring Boot 3.4.1**
- **Spring Data JPA** (Persistência e ORM)
- **H2 Database** (Banco de dados em memória para agilidade em desenvolvimento)
- **JUnit 5 & Mockito** (Suíte robusta de testes unitários e integração)
- **Maven** (Gerenciador de dependências)

## 🏗 Arquitetura e Boas Práticas
A aplicação foi construída sobre pilares sólidos:
- **Padrão Camadas:** Separação clara entre `Controller`, `Service` e `Repository`.
- **Tratamento de Exceções Global:** Sistema de captura de erros que garante respostas JSON amigáveis e códigos HTTP corretos (ex: 404 para Não Encontrado, 400 para Erro de Sintaxe).
- **DTO (Data Transfer Object):** Utilização de objetos de transferência para segurança e performance no tráfego de dados.

## 🧪 Qualidade Garantida (Testes)
A confiabilidade do sistema é assegurada por:
- **Testes de Unidade:** Validação de regras de negócio em isolamento.
- **Testes de Integração:** Testes de ponta a ponta nos endpoints da API.
- **Testes de Repositório:** Garantia de que a persistência no banco de dados está operando conforme o esperado.



## 📝 Como Executar o Projeto
1. Clone o repositório:
   ```bash
   git clone [https://github.com/Gabres96/ecommerce-api.git](https://github.com/Gabres96/ecommerce-api.git)
