#language:pt

@RealizarCompra
Funcionalidade: Realizar uma compra

@testePositivo
Cenario: Realizar compra com sucesso
     
     Dado Realizando o login
  
     Quando escolher produto 
     E Preencher minhas informaçoes
     
     Entao Validamos a compra com sucesso
     
     