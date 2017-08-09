package calculadora.operacion;
import calculadora.Calculadora;
public class Operacion {

	public Operacion(){
		
	}

	public void suma(int n1, int n2){
		Calculadora.resultado = n1 + n2; 
        
	}
	
	public void resta (int n1, int n2){ 
        Calculadora.resultado = n1 - n2; 
         
    }
 
    public void multiplicacion(int n1, int n2){ 
        Calculadora.resultado = n1 * n2; 
    }  
 
    public void division(int n1, int n2){
    	if(n1 >= n2) {
			Calculadora.resultado = n1 / n2;
		}else {
			Calculadora.resultado = n2 / n1;
		} 
        
    }    
}
