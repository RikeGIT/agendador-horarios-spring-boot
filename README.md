📅 Agendador de Horários API
Esta é uma API REST robusta desenvolvida para gerenciar agendamentos de serviços, permitindo o controle de clientes, profissionais e horários de forma eficiente. O projeto foi construído utilizando as melhores práticas de desenvolvimento backend com o ecossistema Spring.
+1

🚀 Tecnologias Utilizadas

Java 21: Utilização da versão estável mais recente da linguagem para aproveitar novos recursos e performance.


Spring Boot 3.x/4.x: Framework base para construção da aplicação.


Spring Data JPA: Abstração de persistência de dados.
+1


H2 Database: Banco de dados em memória para agilidade no desenvolvimento e testes.


Lombok: Redução de código boilerplate (Getters, Setters, Constructors).


Maven: Gerenciamento de dependências e build do projeto.

🛠️ Funcionalidades

CRUD de Agendamentos: Criação, listagem, atualização e exclusão de horários.


Regras de Negócio: Validação inteligente para impedir o agendamento de múltiplos serviços no mesmo intervalo de tempo.


Filtros Inteligentes: Busca de agendamentos por data específica através de consultas customizadas (Derived Queries).

📂 Estrutura do Projeto
O projeto segue uma arquitetura em camadas para garantir a separação de responsabilidades:

Controller: Exposição dos endpoints REST da aplicação.

Service: Camada onde residem as regras de negócio e lógica de validação.

Infrastructure/Entity: Definição do modelo de dados para persistência.

Infrastructure/Repository: Interface de comunicação com o banco de dados via JPA.

🏁 Como Executar o Projeto
Pré-requisitos: Ter o JDK 21 e Maven instalados.

Clonar o repositório:

Bash
git clone https://github.com/RikeGIT/agendador-horarios-spring-boot.git
Executar a aplicação:

Bash
./mvnw spring-boot:run
Acessar o Banco de Dados (Console H2):

URL: http://localhost:8080/h2-console 

JDBC URL: jdbc:h2:mem:testdb

User: sa / Password:      

🔗 Endpoints Principais
POST /agendamentos: Cria um novo agendamento.

GET /agendamentos?data=YYYY-MM-DD: Lista os agendamentos de um dia específico.

PUT /agendamentos: Atualiza um agendamento existente.

DELETE /agendamentos: Remove um registro do sistema.
