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

- Java (JDK 25)
- Git e GitHub

### Planejadas

- Maven
- JUnit
- Spring Boot
- Banco de dados relacional
- API REST
- Frontend Web
- Docker

## Estrutura do projeto

O Finance Manager está organizado inicialmente em pacotes com responsabilidades distintas, buscando facilitar a manutenção, os testes e a evolução da aplicação.

- `model`: representa as entidades e os conceitos
  do domínio financeiro.
- `repository`: responsável pelo acesso e pela
  persistência dos dados.
- `service`: concentra serviços e operações
  relacionadas às regras de negócio.
- `ui`: responsável pela interação com o usuário,
  inicialmente por meio do console.
- `Main.java`: ponto de entrada da aplicação.

## Como executar

### Pré-requisitos

- Java JDK 25
- IntelliJ IDEA
- Git

### Executando o projeto

1. Clone o repositório:

   ```bash
   git clone https://github.com/moiseshsilva-dev/finance-manager.git
   ```

2. Abra o diretório `finance-manager` no IntelliJ IDEA.

3. Configure o Project SDK para Java 25.

4. Localize a classe `Main.java`.

5. Execute o método `main()` utilizando a opção Run do IntelliJ.

> **Nota:** O projeto está em fase inicial de desenvolvimento.
> A aplicação ainda não possui funcionalidades executáveis
> ou interface de interação com o usuário.

## Status do desenvolvimento

**Em desenvolvimento**

O Finance Manager está em sua fase inicial, com foco na
organização da estrutura do projeto, documentação e
definição dos requisitos funcionais.

As funcionalidades do MVP serão implementadas
progressivamente, seguindo uma abordagem incremental
de desenvolvimento e utilizando práticas adaptadas
do framework Scrum.