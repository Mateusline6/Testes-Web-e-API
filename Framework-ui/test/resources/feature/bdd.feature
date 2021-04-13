#Author: e2etreinamentos@e2etreinamentos.com.br


Feature: Validar pesquisa do google
eu como usuario quero acessar o google para realizar pesquisas

  
  Scenario: Pesquisa E2E treinamentos
    Given que eu esteja no google
    When pesquisar o nome da escola  
    Then Valido as informacoes
    

 