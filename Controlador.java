// Marianne Peña Wust

public class Controlador {
	Ventana ventana;
	Calculadora calculadora;
	private double operandoA;
	private double operandoB;
	private char operación;
	private String s1;
	private double resultado;
	private int DeBase;
	private int ABase;
	private String Conversión;
	private String convertido;
	
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
		resultado = Calculadora.operación(operandoA, operandoB, operación);
		ventana.mostrarResultado(resultado);
		histOp();
		histRes();
	}
	
	// M, MR, MC
	public void guardarDato(String text) {
		s1 = text;
		
	}
	
	public String elDato() {
		return s1;
	}
	
	public void vaciarMemoria(String string) {
		s1 = string;
		
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
	
	// Historial de operaciones y resultados
	public void histOp() {
		ventana.histOp(operandoA, operandoB, operación);
	}
	
	public void histRes() {
		ventana.histRes(resultado);
	}

	// Convertidor de bases
	public void guardarDeBase(String text) {
		DeBase= Integer.parseInt(text);
	}

	public void guardarABase(String text) {
		ABase= Integer.parseInt(text);
		
	}

	public void enviarConversión(String text) {
		Conversión = text;
		if(DeBase<=10 && ABase<=10){
			convertido= Calculadora.cambioBaseMenor(DeBase, ABase, Integer.valueOf(Conversión))+" "; 
		} else if(DeBase<=10 && ABase==16) {
			convertido= Calculadora.aDieciseis(DeBase, Integer.valueOf(Conversión));
		} else if(DeBase==16 && ABase<=10) {
			convertido= Calculadora.deDieciseis(ABase, Conversión);
		}
		ventana.mostrarConvertido(convertido);
	}
		
}


	
			

