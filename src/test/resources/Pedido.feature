# language: pt

Funcionalidade: Pedido de Abastecimento
  Como usuário
  Quero realizar um pedido de abastecimento
  Para adquirir cashback
  

#Possuir cadastro no aplicativo de vantagens
#Possuir opções de abastecimento/combustível para realizar pedido
#Possuir formas de pagamento cartão/dinheiro
#Possuir opção de valor de compra para seleção/preenchimento
#Exibir valor de cashback a ser recebido (de acordo com valor de compra)
#O valor de cashback deve corresponder a 5% do valor da compra
#Exibir mensagem de transação concluída



Cenário: Cliente abastece realizando pagamento com cartão no valor 30 Reais e ganha 5% do valor, revertido em cashback
Dado que eu seja cliente do app
E esteja logado no aplicativo
E não possua saldo "0" cashback
E possua um único cartão credito cadastrado
Quando seleciono a funcionalidade abastecimento
E informo o valor de 30 reais do abastecimento
E seleciono o cartão cadastrado
E digito o CVV
E clico no botão "Confirmar"
Então vejo o saldo de cashback de 1,50
E vejo a mensagem "Seu saldo é de R$ 1,50"

@validação
Cenário: Cliente abastece 30 reais, realizando pagamento com cashback que possui saldo de 40
Dado que eu seja cliente do app
E esteja logado no aplicativo
E possua saldo "40" cashback
E possua um único cartão credito cadastrado
Quando seleciono a funcionalidade abastecimento
E informo o valor de 30 reais do abastecimento
E seleciono a forma de pagamento cashback
E clico no botão "Confirmar"
Então vejo o saldo de cashback de 10
E vejo a mensagem "Seu saldo é de R$ 10"


@validação @regressão
Esquema do Cenário: Cliente do abastece e recebe cashcback com pagamento de cartão a partir de 30 reais
Dado que o cliente esteja no app abastece logado
E possua cartão cadastrado
E possua saldo "0" cashback
Quando efetuar um abastecimento no valor de <"VALOR_ABASTECIMENTO"> reias no cartão de crédito
E seleciono o cartão cadastrado
E clicar no botão "Confirmar e Continuar"
Então o cliente recebe 5% do valor do abastecimento revertido como cashback no pedido efetuado, ficando com saldo <"SALDO">

Exemplos:

|VALOR_ABASTECIMENTO| SALDO |
| 100               |   5   |
| 200               |  10   |
| 300               |  15   |
| 400               |  20   |

#Cenário: Cliente abastece realizando pagamento com cartão no 40 Reais e ganha 5% do valor, revertido em cashback
#Cenário: Cliente abastece realizando com cartão no 29 Reais não recebe cashback