import static org.junit.Assert.*;

import org.junit.*;

public class DescontoTest{
    
    
 @Test
 public void SemDesconto () {
     
     Desconto desconto = new Desconto();
     int resultadoAtual = desconto.CalcularDesconto(10);
     int resultadoEsperado = 0; 
    
     assertEquals(resultadoEsperado, resultadoAtual);
     
 }
    
    
}







