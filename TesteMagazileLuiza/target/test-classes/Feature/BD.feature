#Author: mateusefigenio55@gmail.com

@alltests
Feature: Solicitar novo cartao de credito
  Eu como usuario quero acessar o formulario de cartoes para solicitar um novo cartao de credito


Background: access the site
   Given that I am on the site "https://www.magazineluiza.com.br"
   
@test1
  Scenario Outline: Acessando formulario de cartoes
    
    And access the card form
    When fill the form <Nome> <Email> <CPF> <Renda> in step
    Then I verify the <status> in step

    Examples: 
      | Nome             | Email                        |CPF             | Renda     | status  |
      | "Miguel Barbosa" |"miguelbarbosa37298@gmail.com"|"433.686.200-10"  | "1.000,00"  |   ok    |
      | "Migu"           |"miguelbarbosa37298.com"      |"433.686.200"     | "700,00"      | invalid |
