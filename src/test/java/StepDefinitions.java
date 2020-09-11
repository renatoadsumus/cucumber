import cucumber.api.PendingException;
import cucumber.api.java.pt.*;

public class StepDefinitions {
    
    @Dado("^que eu seja cliente do app$")
public void que_eu_seja_cliente_do_app() throws Throwable {
   
}

@Dado("^esteja logado no aplicativo$")
public void esteja_logado_no_aplicativo() throws Throwable {
  
}

@Dado("^não possua saldo \"([^\"]*)\" cashback$")
public void não_possua_saldo_cashback(String arg1) throws Throwable {
    
}

@Dado("^possua um único cartão credito cadastrado$")
public void possua_um_único_cartão_credito_cadastrado() throws Throwable {
    
}

@Quando("^seleciono a funcionalidade abastecimento$")
public void seleciono_a_funcionalidade_abastecimento() throws Throwable {
    
}

@Quando("^informo o valor de (\\d+) reais do abastecimento$")
public void informo_o_valor_de_reais_do_abastecimento(int arg1) throws Throwable {
    
   
}

@Quando("^seleciono o cartão cadastrado$")
public void seleciono_o_cartão_cadastrado() throws Throwable {
    
}

@Quando("^digito o CVV$")
public void digito_o_CVV() throws Throwable {

}

@Quando("^clico no botão \"([^\"]*)\"$")
public void clico_no_botão(String arg1) throws Throwable {
    
}

@Então("^vejo o saldo de cashback de (\\d+),(\\d+)$")
public void vejo_o_saldo_de_cashback_de(int arg1, int arg2) throws Throwable {
 
}

@Então("^vejo a mensagem \"([^\"]*)\"$")
public void vejo_a_mensagem(String arg1) throws Throwable {

}

@Dado("^possua saldo \"([^\"]*)\" cashback$")
public void possua_saldo_cashback(String arg1) throws Throwable {
    
}

@Quando("^seleciono a forma de pagamento cashback$")
public void seleciono_a_forma_de_pagamento_cashback() throws Throwable {
  
}

@Então("^vejo o saldo de cashback de (\\d+)$")
public void vejo_o_saldo_de_cashback_de(int arg1) throws Throwable {

}
}