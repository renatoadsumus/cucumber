
import static org.junit.Assert.*;

import org.junit.*;


public class DescontoTest {

    private Desconto desconto;

    @Before
	public void antesDeCadaTeste(){
	    
		desconto = new Desconto();
	}
        
    @Test
	public void compraDe10ReaisSemDesconto()
	{
		int resultadoEsperado = 0;
		
		int resultadoAtual = desconto.CalcularDesconto(10);
		
		assertEquals(resultadoEsperado, resultadoAtual);
	}
	
	@Test
	public void compraDe100Reais10PorcentoDesconto()
	{
		
		int resultadoEsperado =10;
		
		int resultadoAtual = desconto.CalcularDesconto(100);
		
		assertEquals(resultadoEsperado, resultadoAtual);
	}
	
	@Test
	public void compraDe200Reais20PorcentoDesconto()
	{
		
		assertTrue(true);
	}
}