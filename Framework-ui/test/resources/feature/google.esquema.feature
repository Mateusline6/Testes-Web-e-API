#Author: e2etreinamentos@e2etreinamentos.com.br




Feature: pesquisa com esquema
   Eu como usuario quero realizar pesquisa para validar informacoes

  
  Scenario Outline: pesquisando no google
    Given que eu esteja no "https://www.google.com.br"
    When eu busco  <palavra>
    Then  valido o <retorno>
  

     Examples: 
      | Palavra            | retorno            |	
      | "E2E Treinamentos" | "E2E Treinamentos" | 
      | "Inovação"         |   "Inovação"       |
      | "Informação"       |   "Informação"     |
      | "Educação"         |   "Bicicleta" | 