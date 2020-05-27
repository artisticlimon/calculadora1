// Marianne Peña Wust

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AL implements ActionListener {
	Ventana ventana; 
	
	public AL(Ventana v) {
		ventana = v;
	}

	public void actionPerformed(ActionEvent arg0) {
		String ac = arg0.getActionCommand();
		if(Character.isDigit(ac.charAt(0)) || ac.charAt(0)==46) {
			ventana.agregarDigito(arg0.getActionCommand());
		} else {
			switch (ac) {
			case "C":
				ventana.clear();
				break;
			case "+":
				ventana.enviarOperandoA();
				ventana.agregarDigito("+");
				ventana.clear();
				ventana.enviarOperación("+");
				break;
			case "-":
				ventana.enviarOperandoA();
				ventana.agregarDigito("-");
				ventana.clear();
				ventana.enviarOperación("-");
				break;
			case "*":
				ventana.enviarOperandoA();
				ventana.agregarDigito("*");
				ventana.clear();
				ventana.enviarOperación("*");
				break;
			case "/":
				ventana.enviarOperandoA();
				ventana.agregarDigito("/");
				ventana.clear();
				ventana.enviarOperación("/");
				break;
			case "=":
				ventana.hacerOperación();
				break;	
			case "M":
				ventana.guardarDato();
				ventana.clear();
				break;
			case "MC":
				break;
			case "^2":
				ventana.enviarOperandoA();
				ventana.alCuadrado();
				break;
			case "^n":
				ventana.enviarOperandoA();
				ventana.agregarDigito("^");
				ventana.clear();
				ventana.enviarOperación("^");
				break;
			case "^1/2":
				ventana.enviarOperandoA();
				ventana.raízCuadrada();
				break;
			case "^1/n":
				ventana.enviarOperandoA();
				ventana.agregarDigito("#");
				ventana.clear();
				ventana.enviarOperación("#");
				break;
			}
		}
	
	
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
		
}

