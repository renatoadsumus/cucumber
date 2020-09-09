import static org.junit.Assert.*;

import org.junit.*;


public class DescontoTest{
    
 Desconto desconto;
 
 @Before
	public void antesDeCadaTeste(){
	    
		  desconto = new Desconto();
	}
	
 @Test
 public void SemDesconto () {
    
     int resultadoAtual = desconto.CalcularDesconto(10);
     int resultadoEsperado = 0; 
    
     assertEquals(resultadoEsperado, resultadoAtual);
     
 }
   
 @Test
 public void DescontoDez()
 {
    int resultadoAtual = desconto.CalcularDesconto(150);
    int resultadoEsperado = 10; 
    
     assertEquals(resultadoEsperado, resultadoAtual);
     
  
 }
 
 @Test
 public void DescontoVinte()
 {
  
    int resultadoAtual = desconto.CalcularDesconto(250);
    int resultadoEsperado = 20; 
    
     assertEquals(resultadoEsperado, resultadoAtual);
     
  
 }
 @Test
 public void DescontoTrinta()
 {
   Desconto desconto = new Desconto();
  
    int resultadoAtual = desconto.CalcularDesconto(350);
    int resultadoEsperado = 25; 
    
     assertEquals(resultadoEsperado, resultadoAtual);
     
  
 }
 
 @Test
 public void CompraDe300ReaisDescontoDeVintePorcento()
 {
   Desconto desconto = new Desconto();
  
    int resultadoAtual = desconto.CalcularDesconto(300);
    int resultadoEsperado = 25; 
    
     assertEquals(resultadoEsperado, resultadoAtual);
     
  
 }
 
 
 
}
