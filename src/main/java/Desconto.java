public class Desconto {

public int CalcularDesconto(int valor){
      
       if( valor>= 300)
        return 25;
        
      if( valor> 200)
        return 20;
        
    if( valor> 100)
        return 10;
      
        
        
        return 0;
    }
    
}