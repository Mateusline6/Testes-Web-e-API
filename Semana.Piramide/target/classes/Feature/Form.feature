#language: pt
#Author: mateusefigenio55@gmail.com

@Executa
Funcionalidade: Validar formulario
  Eu como aluno quero enviar o formulario para enviar uma mensagem

  @Executa1
  Cenario: Enviar formulario
    Dado que eu esteja no formulario
    Quando eu preecher e enviar o formulario
    Entao sou direcionado para o site da escola

 