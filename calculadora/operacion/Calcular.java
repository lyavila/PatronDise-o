package calculadora.operacion;

import command.Command;

public class Calcular {

	Command sumar, restar, multiplicar, dividir; 
	
	public Calcular (Command cSumar, Command cRestar, Command cMultiplicar,Command cDividir ){
		this.sumar = cSumar;
		this.restar = cRestar;
		this.multiplicar = cMultiplicar;
		this.dividir = cDividir;
	}
	
	public int Suma(int numero){
		sumar.execute(numero);
		return numero;
	}
	
	public void Resta(int numero){
		restar.execute(numero);
	}
	public void Multiplicacion(int numero){
		multiplicar.execute(numero);
	}
	public void Division(int numero){
		dividir.execute(numero);
	}
}
