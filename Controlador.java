// Marianne Peña Wust

public class Controlador {
	Ventana ventana;
	Calculadora calculadora;
	private double operandoA;
	private double operandoB;
	private char operación;
	private String s1;
	
	public Controlador() {
		ventana = new Ventana(this);
		calculadora= new Calculadora();
		ventana.mostrar();
	}
	
	public static void main(String[] args) {
		Controlador controlador = new Controlador();
			
	}

	// Operaciones aritméticas
	public void guardarOperandoA(String operando) {
		operandoA= Double.parseDouble(operando);
		
	}
	
	public void guardarOperación(char text) {
		operación = text;
		
	}
	public void guardarOperandoB(String operando) {
		operandoB= Double.parseDouble(operando);
	}
	
	public void hacerOperación() {
		double resultado = Calculadora.operación(operandoA, operandoB, operación);
		ventana.mostrarResultado(resultado);
	}

	
	// M y MC
	public void guardarDato(String text) {
		s1 = text;
		
	}

	
	// Potencias
	public void alCuadrado() {
		double alCuadrado = Calculadora.alCuadrado(operandoA);
		ventana.mostrarResultado(alCuadrado);
		
	}

	public void raízCuadrada() {
		double raízCuadrada = Calculadora.raízCuadrada(operandoA);
		ventana.mostrarResultado(raízCuadrada);
		
	}
	
	
	
		
}


	
			

