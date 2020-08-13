import cucumber.api.PendingException;
import cucumber.api.java.pt.*;

public class StepDefinitions {
	
	@Dado("^que tenha um produto em estoque no valor de (\\d+) reais$")
	public void que_tenha_um_produto_em_estoque_no_valor_de_reais(int arg1) throws Throwable {
	    
		// INSERT INTO TABLE
	}

	@Quando("^o comprados seleciona o produto$")
	public void o_comprados_seleciona_o_produto() throws Throwable {


	}

	@Quando("^realiza o pagamento$")
	public void realiza_o_pagamento() throws Throwable {
	    
	}

	@Então("^o produto sai de estoque$")
	public void o_produto_sai_de_estoque() throws Throwable {
	    
	}

	@Então("^não recebo o desconto$")
	public void não_recebo_o_desconto() throws Throwable {
	   
	}

	@Então("^recebo desconto$")
	public void recebo_desconto() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

}


