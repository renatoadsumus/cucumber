import cucumber.api.java.pt.*;

public class AluguelCarrosSteps {

	AlugarPage page = new AlugarPage();

	@Dado("^que eu tenha em estoque um produto que custe \"([^\"]*)\" reais$")
	public void que_eu_tenha_em_estoque_um_produto_que_custe_reais(String arg1) throws Throwable {

		page.abrirPagina();

	}

	@Quando("^selecionar o produto na barra de pesquisa$")
	public void selecionar_o_produto_na_barra_de_pesquisa() throws Throwable {

	}

	@Quando("^realizar o pagamento$")
	public void realizar_o_pagamento() throws Throwable {

	}

	@Então("^não recebo nenhum desconto$")
	public void não_recebo_nenhum_desconto() throws Throwable {
	
	}

	
}
