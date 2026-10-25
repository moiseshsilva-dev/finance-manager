# Finance Manager
O **Finance Manager** é um sistema de gestão financeira pessoal em desenvolvimento, projetado para auxiliar usuários no controle e planejamento de suas finanças.

A aplicação, que será desenvolvida de forma incremental, começando pelas funcionalidades essenciais de gestão financeira pessoal e evoluindo posteriormente para recursos de planejamento e projeção financeira, permitirá registrar receitas, despesas e lançamentos futuros, acompanhar saldos e gerar relatórios financeiros por categoria e período, proporcionando uma visão clara e abrangente da situação financeira do usuário.

O projeto tem como objetivo oferecer uma solução simples, segura e intuitiva, reunindo ferramentas essenciais para facilitar a organização financeira e apoiar a tomada de decisões.

## Funcionalidades

### MVP - Versão inicial

- [ ] Cadastro de contas financeiras com saldo inicial
- [ ] Cadastro de receitas
- [ ] Cadastro de despesas
- [ ] Categorização de receitas e despesas
- [ ] Consulta de saldos por conta
- [ ] Consulta do saldo total consolidado
- [ ] Filtros de despesas por categoria
- [ ] Filtros de movimentações por período
- [ ] Relatórios financeiros por período

### Funcionalidades futuras

- [ ] Cadastro de receitas e despesas recorrentes
- [ ] Agendamento de movimentações futuras
- [ ] Projeção de saldos futuros
- [ ] Transferências entre contas financeiras
- [ ] Planejamento de orçamento por categoria
- [ ] Metas financeiras
- [ ] Integração bancária via Open Finance
- [ ] Consulta de movimentações canceladas
- [ ] Histórico detalhado de alterações
- [ ] Auditoria de operações financeiras


## Tecnologias

### Atualmente utilizadas

-   **Java 25:** linguagem principal de desenvolvimento

-   **Maven:** gerenciamento de dependências e automação do build

-   **Git e GitHub:** versionamento de código e organização do desenvolvimento


### Planejadas

-   **JUnit e Mockito:** testes automatizados

-   **Spring Boot:** desenvolvimento da aplicação backend

-   **Banco de dados relacional:** persistência dos dados financeiros

-   **API REST:** comunicação entre o backend e diferentes interfaces

-   **Frontend Web:** interface de interação com o usuário

-   **Docker:** conteinerização da aplicação

-   **GitHub Actions:** automação de build e testes por meio de CI/CD


As tecnologias serão incorporadas progressivamente, conforme as necessidades e a evolução do projeto.

## Arquitetura e estrutura do projeto

O Finance Manager está sendo desenvolvido com foco na separação de responsabilidades, organização das regras de negócio e facilidade de manutenção.

Nesta etapa inicial, o projeto utiliza uma estrutura Maven e concentra sua implementação na modelagem do domínio financeiro.

```
finance-manager/
├── docs/
│   ├── sprints/
│   └── product-vision.md
├── src/
│   └── main/
│       └── java/
│           └── br/com/moises/finance/
│               ├── model/
│               │   ├── Account.java
│               │   ├── Category.java
│               │   ├── Transaction.java
│               │   └── User.java
│               └── Main.java
├── pom.xml
└── README.md
```

### Modelagem de domínio

As principais entidades inicialmente definidas são:

-   **User:** representa o usuário responsável pelas informações financeiras.

-   **Account:** representa uma conta financeira, incluindo identificação, nome e saldo inicial.

-   **Category:** representa a categorização das movimentações financeiras.

-   **Transaction:** representa uma movimentação financeira associada a uma conta e categoria.


As regras de negócio estão sendo implementadas progressivamente, com atenção à validação de dados e à consistência dos objetos de domínio.

A arquitetura será expandida conforme a implementação das funcionalidades, incluindo camadas de serviços, persistência e disponibilização de uma API REST.

## Progresso do desenvolvimento

### Etapas concluídas

-   Definição da visão inicial do produto

-   Documentação das funcionalidades do MVP

-   Organização da estrutura de diretórios com Maven

-   Configuração e validação do build

-   Modelagem inicial das entidades do domínio financeiro

-   Organização do desenvolvimento em Sprints e Issues no GitHub


### Em desenvolvimento

-   Implementação das regras de negócio das entidades

-   Validação e consistência dos dados financeiros

-   Implementação das operações essenciais de gestão financeira

-   Criação de testes automatizados


O desenvolvimento é organizado em entregas incrementais, utilizando práticas adaptadas do framework Scrum.

## Como executar

### Pré-requisitos

-   Java JDK 25

-   Apache Maven

-   Git

-   IntelliJ IDEA (opcional)


### Executando o projeto

1.  Clone o repositório:

    ```
    git clone https://github.com/moiseshsilva-dev/finance-manager.git
    ```

2.  Acesse o diretório do projeto:

    ```
    cd finance-manager
    ```

3.  Compile o projeto:

    ```
    mvn clean package
    ```

4.  Para executar a classe principal, utilize uma IDE configurada com o JDK 25 ou execute pelo terminal:

    ```
    java -cp target/classes br.com.moises.finance.Main
    ```


> **Nota:** O projeto ainda está em fase inicial de desenvolvimento. A classe `Main` é utilizada para verificações durante a implementação, e a aplicação ainda não possui uma interface funcional para o usuário final.

## Status do desenvolvimento

**Em desenvolvimento**

O Finance Manager está na fase de implementação do domínio financeiro e das primeiras regras de negócio.

O desenvolvimento segue uma abordagem incremental, priorizando a consistência das regras de negócio e a organização do código antes da implementação das camadas de persistência, API e interface.

As próximas etapas incluem a evolução das entidades, implementação das operações financeiras e introdução de testes automatizados.

O objetivo é evoluir o projeto gradualmente até a entrega de um MVP funcional, mantendo uma base técnica preparada para futuras expansões.