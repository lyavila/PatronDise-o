package calculadora.operaciones;

import calculadora.Calculadora;
import calculadora.operacion.Operacion;
import command.Command;

public class Resta implements Command {

Operacion op;
	
	public Resta (Operacion ope){
		this.op = ope;
	}
	

	@Override
	public void execute(int numero) {
		op.resta(Calculadora.resultado,numero);
		
	}
}
