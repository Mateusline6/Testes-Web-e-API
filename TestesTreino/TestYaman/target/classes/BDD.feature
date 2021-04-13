#Author: mateusefigenio55@gmail.com


Feature: Teste Yaman
  Eu como usuario quero fazer uma pesquisa

 
  Scenario: Realizar pesquisa na loja
    Given realizar pesquisa "https://www.shoestock.com.br"
    When incluir produto 
    Then validar produtos
  
  