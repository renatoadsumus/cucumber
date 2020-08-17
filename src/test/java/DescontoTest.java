
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
		
		assertTrue(true);
	}
	
	@Test
	public void compraDe100Reais10PorcentoDesconto()
	{
		
		assertTrue(true);
	}
	
	@Test
	public void compraDe200Reais20PorcentoDesconto()
	{
		
		assertTrue(true);
	}
}