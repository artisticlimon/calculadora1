// Marianne Peña Wust

public class Calculadora {
	
	public static double operación(double a, double b, char c) {
		switch(c){
			case(43):
				return a+b;
			case(45):
				return a-b;
			case(42):
				return a*b;
			case(47):
				return a/b;
			case(94):
				return Math.pow(a, b);
			case(35):
				return Math.pow(a, 1.0/b);
			default: 
				return 0;
		}
	}

	public static double alCuadrado(double a) {
		return Math.pow(a, 2);
	}

	public static double raízCuadrada(double a) {
		return Math.pow(a, 1.0/2.0);
	}

}
