#language:pt

Funcionalidade: Aluguel de Carro
Para aumentar a receita
Como locadora
Quero permitir que o cliente possa alugar o carro através do nosso site

@Smoke @Regression
  Esquema do Cenário: Comprar Passagem Area
  Dado que eu esteja na pagina principal
  Quando informo local de retirada "<LOCAL_RETIRADA>"
  E clico devolver em outro local
  E informo local de devolução "<LOCAL_DEVOLUCAO>"
  Então sou direcionando para home
 
  Exemplos:
 
  | LOCAL_RETIRADA | LOCAL_DEVOLUCAO |
  |SAO PAULO - GUARULHOS AEROPORTO  |RIO DE JANEIRO - GALEAO AEROPORTO|
  |RIO DE JANEIRO - GALEAO AEROPORTO|SAO PAULO - GUARULHOS AEROPORTO|