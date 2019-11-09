# language: pt

@Desconto
Funcionalidade: Desconto Compra com Dinheiro
  Como comprador
  Eu quero receber descontos
  Quando eu realizar o pagamento das minhas compras com dinheiro

  Cenário: Compra com Dinheiro - Com Desconto
    Dado que eu compre um bolo
    E realizar o pagamento
    Quando realizar o pagamento com dinheiro
    Então recebo 10% de desconto




