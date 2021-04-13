#language: pt
#Author: mateusefigenio55@gmail.com

@executa
Funcionalidade: Buscar profissional
  Como usuario quero validar a busca do profissional via api


		Contexto: Acessar api
		Dado que eu acesse api get para consulta profissional
 
	  Cenario: Validar status code
	    Entao valido o status code de retorno
   
	   Cenario: Validar body response estrutura lista campo nome
	    Entao valido o nome "Professional"
    


 