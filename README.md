# 📅 Agendador de Horários API

Esta é uma API REST desenvolvida para gerenciar agendamentos de serviços, permitindo o controle de clientes, profissionais e horários de forma eficiente.

## 🚀 Tecnologias Utilizadas

**Java 21**: Utilização da versão estável mais recente da linguagem para aproveitar novos recursos e performance.
Spring Boot 4.0.3**: Framework base para construção da aplicação.
**Spring Data JPA**: Abstração de persistência de dados.
**H2 Database**: Banco de dados em memória para agilidade no desenvolvimento e testes.
**Lombok**: Redução de código boilerplate como Getters, Setters e Construtores.
**Maven**: Gerenciamento de dependências e build do projeto.

## 🛠️ Funcionalidades

**CRUD de Agendamentos**: Criação, listagem, atualização e exclusão de horários.
**Regras de Negócio**: Validação inteligente para impedir o agendamento de múltiplos serviços no mesmo intervalo de tempo, garantindo a integridade dos dados.
**Filtros Inteligentes**: Busca de agendamentos de um dia específico através de consultas customizadas (Derived Queries).

## 📂 Estrutura do Projeto

O projeto segue uma arquitetura em camadas para garantir a separação de responsabilidades:

**Controller**: Exposição dos endpoints REST da aplicação.
**Service**: Camada onde residem as regras de negócio e lógica de validação.
**Infrastructure/Entity**: Definição do modelo de dados para persistência.
**Infrastructure/Repository**: Interface de comunicação com o banco de dados via JPA.

## 🏁 Como Executar o Projeto

1.  **Pré-requisitos**: Ter o JDK 21 e Maven instalados.
2.  **Clonar o repositório**:
    ```bash
    git clone [https://github.com/RikeGIT/agendador-horarios-spring-boot.git](https://github.com/RikeGIT/agendador-horarios-spring-boot.git)
    ```
3.  **Executar a aplicação**:
    ```bash
    ./mvnw spring-boot:run
    ```
4.  **Acessar o Banco de Dados (Console H2)**:
    **URL**: `http://localhost:8080/h2-console`
    * **JDBC URL**: `jdbc:h2:mem:testdb`
    * **User**: `sa`
    * **Password**: (vazio)

## 🔗 Endpoints Principais

* `POST /agendamentos`: Cria um novo agendamento.
* `GET /agendamentos?data=YYYY-MM-DD`: Lista os agendamentos de um dia específico.
* `PUT /agendamentos`: Atualiza um agendamento existente.
* `DELETE /agendamentos`: Remove um registro do sistema.

---
Desenvolvido por **Rikelmy de Sousa**.
