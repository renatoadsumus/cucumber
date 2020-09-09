<<<<<<< HEAD
=======

>>>>>>> 0312bc00d6d9fb019842f1ceeaf764640121e727
import static org.junit.Assert.*;

import org.junit.*;

<<<<<<< HEAD
public class DescontoTest{
    
    
 @Test
 public void SemDesconto () {
     
     Desconto desconto = new Desconto();
     int resultadoAtual = desconto.CalcularDesconto(10);
     int resultadoEsperado = 0; 
    
     assertEquals(resultadoEsperado, resultadoAtual);
     
 }
    
    
}







=======

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
>>>>>>> 0312bc00d6d9fb019842f1ceeaf764640121e727
