package calculadora.operaciones;

import calculadora.Calculadora;
import calculadora.operacion.Operacion;
import command.Command;

public class Dividir implements Command{

Operacion op;
	
	public Dividir (Operacion ope){
		this.op = ope;
	}
	
	@Override
	public void execute(int numero) {
		op.division(Calculadora.resultado,numero);
	}
}
