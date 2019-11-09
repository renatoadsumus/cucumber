# language: pt

Funcionalidade: Desconto Compra com Dinheiro
  Como vendendor
  Quero conceder descontos nas compras em dinheito
  Para aumentar minhas vendas em 10 porcento no natal


  Cenário: Valor da compra é de 90 reais o desconto é de 0%
    Dado que eu tenha em estoque um produto que custe 90 reais    
    Quando selecionar o produto na barra de pesquisa
    E realizar o pagamento
    Então não recebo nenhum desconto
    
 Esquema do Cenário: Valor da compra maior que 100
    Dado que eu tenha em estoque um produto que custe "<VALOR>" reais    
    Quando selecionar o produto na barra de pesquisa
    E realizar o pagamento
    Então não recebo nenhum desconto    
    
    | VALOR |
    |	120		|
    |	140		|
    