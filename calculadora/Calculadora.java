package calculadora;

import java.util.ArrayList;
import java.util.Scanner;

import calculadora.operacion.Calcular;
import calculadora.operacion.Operacion;
import calculadora.operaciones.Dividir;
import calculadora.operaciones.Multiplicar;
import calculadora.operaciones.Resta;
import calculadora.operaciones.Suma;
import command.Command;

public class Calculadora {
 
	public static int resultado;
	public static void cadena (String operacion){
		

		Operacion ope = new Operacion();
		
		Command suma = new Suma(ope);
		Command resta = new Resta(ope);
		Command multiplicacion = new Multiplicar(ope);
		Command division = new Dividir(ope);

		
		Calcular cal = new Calcular(suma, resta, multiplicacion, division);
		//Test Prueba GitHub
		String[] numero = operacion.split("[-*/+]");
		String[] operador = operacion.split("[0-9]");
		int n = 0;
		int cont = 1;
		
		
		ArrayList<Integer> totalN = new ArrayList<Integer>();
		for (int i = 0; i < numero.length; i++) {
			n = Integer.parseInt(numero[i]);
			totalN.add(i, n);
		}

		resultado = totalN.get(0);
		
		for (int a = 0, i = 0; a < operador.length; a++, i++) {
			if (operador[a].equals("+")) {
				 cal.Suma( totalN.get(i));
				
			} else if (operador[a].equals("-")) {
				cal.Resta(totalN.get(i));
				
			} else if (operador[a].equals("*")) {
				cal.Multiplicacion(totalN.get(i));
				
			} else if (operador[a].equals("/")) {
				cal.Division(totalN.get(i));
				
			} 
		}
		System.out.println(resultado);

	}
	
	public static void main(String[] args) {
	
	Scanner teclado = new Scanner(System.in);
	String terminar = "1";
	System.out.print("Escriba s para terminar");
	while (terminar.equals("1")) {

		System.out.print("\n\nDigite su operación ");
		String operacion = teclado.nextLine();

		if (operacion.equals("s") || operacion.equals("exit")) {
			terminar = "no";
		} else {
			if (operacion.isEmpty()) {

			} else {
				cadena(operacion);
			}
		}
	}

	teclado.close();
}

	
}
