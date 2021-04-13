#Author: e2etreinamento@e2etreinamentos.com


Feature: Cartao luiza
  Eu como usuario quero acessar formulario de cartoes para solicitar outro cartao de credito
  
  
  
  Scenario: Acessar formulario
    Given acessar Site "https://www.magazineluiza.com.br"
    When preencher Formulario
    Then validar

