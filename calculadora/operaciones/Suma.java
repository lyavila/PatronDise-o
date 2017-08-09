package calculadora.operaciones;

import calculadora.Calculadora;
import calculadora.operacion.Operacion;
import command.Command;

public class Suma implements Command {

	Operacion op;
	
	public Suma (Operacion ope){
		this.op = ope;
	}
	
	@Override
	public void execute(int numero) {
		op.suma(Calculadora.resultado,numero);
	}

}
