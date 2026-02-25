# 📅 Agendador de Horários API

[cite_start]Esta é uma API REST desenvolvida para gerenciar agendamentos de serviços, permitindo o controle de clientes, profissionais e horários de forma eficiente[cite: 105, 106].

## 🚀 Tecnologias Utilizadas

* [cite_start]**Java 21**: Utilização da versão estável mais recente da linguagem para aproveitar novos recursos e performance[cite: 113].
* [cite_start]**Spring Boot 4.0.3**: Framework base para construção da aplicação[cite: 113].
* [cite_start]**Spring Data JPA**: Abstração de persistência de dados[cite: 113].
* [cite_start]**H2 Database**: Banco de dados em memória para agilidade no desenvolvimento e testes[cite: 112, 113].
* [cite_start]**Lombok**: Redução de código boilerplate como Getters, Setters e Construtores[cite: 113].
* [cite_start]**Maven**: Gerenciamento de dependências e build do projeto[cite: 113].

## 🛠️ Funcionalidades

* [cite_start]**CRUD de Agendamentos**: Criação, listagem, atualização e exclusão de horários[cite: 106].
* [cite_start]**Regras de Negócio**: Validação inteligente para impedir o agendamento de múltiplos serviços no mesmo intervalo de tempo, garantindo a integridade dos dados[cite: 109].
* [cite_start]**Filtros Inteligentes**: Busca de agendamentos de um dia específico através de consultas customizadas (Derived Queries)[cite: 110, 111].

## 📂 Estrutura do Projeto

O projeto segue uma arquitetura em camadas para garantir a separação de responsabilidades:

* [cite_start]**Controller**: Exposição dos endpoints REST da aplicação[cite: 113].
* [cite_start]**Service**: Camada onde residem as regras de negócio e lógica de validação[cite: 109].
* [cite_start]**Infrastructure/Entity**: Definição do modelo de dados para persistência[cite: 113].
* [cite_start]**Infrastructure/Repository**: Interface de comunicação com o banco de dados via JPA[cite: 110].

## 🏁 Como Executar o Projeto

1.  [cite_start]**Pré-requisitos**: Ter o JDK 21 e Maven instalados[cite: 113].
2.  **Clonar o repositório**:
    ```bash
    git clone [https://github.com/RikeGIT/agendador-horarios-spring-boot.git](https://github.com/RikeGIT/agendador-horarios-spring-boot.git)
    ```
3.  **Executar a aplicação**:
    ```bash
    ./mvnw spring-boot:run
    ```
4.  **Acessar o Banco de Dados (Console H2)**:
    * [cite_start]**URL**: `http://localhost:8080/h2-console` [cite: 112]
    * **JDBC URL**: `jdbc:h2:mem:testdb`
    * **User**: `sa`
    * **Password**: (vazio)

## 🔗 Endpoints Principais

* `POST /agendamentos`: Cria um novo agendamento.
* `GET /agendamentos?data=YYYY-MM-DD`: Lista os agendamentos de um dia específico.
* `PUT /agendamentos`: Atualiza um agendamento existente.
* `DELETE /agendamentos`: Remove um registro do sistema.

---
[cite_start]Desenvolvido por **Rikelmy de Sousa**[cite: 89].
