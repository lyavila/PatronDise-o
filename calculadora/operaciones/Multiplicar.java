package calculadora.operaciones;

import calculadora.Calculadora;
import calculadora.operacion.Operacion;
import command.Command;

public class Multiplicar implements Command{

Operacion op;
	
	public Multiplicar (Operacion ope){
		this.op = ope;
	}
	
	@Override
	public void execute(int numero) {
		op.multiplicacion(Calculadora.resultado,numero);
	}
}
