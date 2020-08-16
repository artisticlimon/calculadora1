// Marianne Peña Wust

public class Calculadora {
	
	public static double operación(double a, double b, char c) {
		switch(c){
			case('+'):
				return a+b;
			case('-'):
				return a-b;
			case('*'):
				return a*b;
			case('/'):
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
	
	public static int cambioBaseMenor(int a, int b,  int c){
		int dec = 0;
		String s1= c+ " ";
		for(int i = 0; i < s1.length()-1; i++) {
			dec+=((c%10)*Math.pow(a, i));
			c= c/10;
		}
		int toB = 0;
		String s2= dec + " ";
		for (int i = 0; i < s2.length()-1; i++) {
			toB+=((dec%b)*Math.pow(10, i));
			dec= dec/b;
		}
		return toB;
	}

	public static String aDieciseis(int a, int c) {
		int dec = 0;
		String s1= c+ " ";
		for(int i = 0; i < s1.length()+1; i++) {
			dec+=((c%10)*Math.pow(a, i));
			c= c/10;
		}
		return Integer.toHexString(dec);
	}

	public static String deDieciseis(int b, String c) {
		int dec= Integer.parseInt(c,16);
		int toB = 0;
		String s2= dec + " ";
		for (int i = 0; i < s2.length()+1; i++) {
			toB+=((dec%b)*Math.pow(10, i));
			dec= dec/b;
		}
		return toB +" ";
	}

}
