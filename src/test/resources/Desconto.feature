# language: pt

Funcionalidade: Desconto Compra com Dinheiro
  Como vendendor
  Quero conceder descontos nas compras em dinheito
  Para aumentar minhas vendas em 10 porcento no natal


  @validação
  Cenário: Venda de 100 reais em dinheiro não possui desconto 
  Dado que tenha um produto em estoque no valor de 100 reais
  Quando o comprados seleciona o produto 
  E realiza o pagamento 
  Então o produto sai de estoque 
  E não recebo o desconto
  
  @regressão
  Cenário: Venda de 101 reais em dinheiro recebo 10 porcento de desconto
  Dado que tenha um produto em estoque no valor de 101 reais
  Quando o comprados seleciona o produto 
  E realiza o pagamento 
  Então o produto sai de estoque
  E recebo desconto
  
  @regressão
  Esquema do Cenário: Valor da compra maior que 100
    Dado que eu tenha em estoque um produto que custe "<VALOR>" reais    
    Quando selecionar o produto na barra de pesquisa
    E realizar o pagamento
    Então não recebo nenhum desconto    
    
    | VALOR |
    |	120		|
    |	140		|
  
  
  
    
 
    