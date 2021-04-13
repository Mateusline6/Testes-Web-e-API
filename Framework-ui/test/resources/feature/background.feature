#Author: e2etreinamentos@e2etreinamentos.com.br


Feature: Validar pesquisa no google
		Eu como usuario quero acessar o google para realizar pesquisas

	Background: Acessar o google
	 Given: que eu esteja no "https://www.google.com.br"

  Scenario: Pesquisar E2E Treinamentos
    When pesquisar "E2E treinamentos"
    Then Valido a pesquisa e2etreinamentos


Scenario: Pesquisar Inovacao
    When pesquisar "Inovacao"
    Then Valido a pesquisa inovacao
    
Scenario: Pesquisar Felicidade
    When pesquisar "Felicidade"
    Then Valido a pesquisa felicidade