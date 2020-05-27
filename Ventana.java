// Marianne Peña Wust

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Ventana extends JFrame {
	
	// Atributos
	Controlador controlador;
	JTextField txt;
	JButton btnClear;
	JButton[][] digitos;
	JButton btnSuma;
	JButton btnResta;
	JButton btnMult;
	JButton btnDiv;
	JButton btnM;
	JButton btnMC;
	JButton btnCuad;
	JButton btnPot;
	JButton btnRaízCuad;
	JButton btnRaíz;

	public Ventana(Controlador c) {
		controlador = c;
		
		// Ventana
		setBounds(100, 100, 500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
	
		// Caja de texto
		txt = new JTextField();
		txt.setBounds(10, 10, 150, 40);
		add(txt);
		
		
		// Botón clear
		AL al = new AL(this);
		
		btnClear = new JButton("C");
		btnClear.setBounds(180, 10, 50, 30);
		btnClear.setActionCommand("C");
		btnClear.addActionListener(al);
		add(btnClear);
		
		
		// Matriz de botones
		digitos = new JButton[4][3];
		
		int x= 0;
		for(int i = 0; i<digitos.length; i++) {
			for(int j= 0; j < digitos[0].length; j++) {
				digitos[i][j]= new JButton(x++ + "");
				digitos[i][j].setActionCommand(x-1 +"");
				digitos[i][j].setBounds(j*50+10, i*50+60, 50, 50);
				digitos[i][j].addActionListener(al);
				add(digitos[i][j]);
			}
		}
		
		digitos[3][0].setText("9");
		digitos[3][0].setActionCommand("9");
		
		digitos[3][1].setText(".");
		digitos[3][1].setActionCommand(".");
		
		digitos[3][2].setText("=");
		digitos[3][2].setActionCommand("=");
		
		// Operaciones básicas
		btnSuma = new JButton("+");
		btnSuma.setBounds(180, 60, 50, 50);
		btnSuma.setActionCommand("+");
		btnSuma.addActionListener(al);
		add(btnSuma);
		
		btnResta = new JButton("-");
		btnResta.setBounds(180, 110, 50, 50);
		btnResta.setActionCommand("-");
		btnResta.addActionListener(al);
		add(btnResta);
		
		btnMult = new JButton("*");
		btnMult.setBounds(180, 160, 50, 50);
		btnMult.setActionCommand("*");
		btnMult.addActionListener(al);
		add(btnMult);
		
		btnDiv = new JButton("/");
		btnDiv.setBounds(180, 210, 50, 50);
		btnDiv.setActionCommand("/");
		btnDiv.addActionListener(al);
		add(btnDiv);
		
		// M y MC
		btnM = new JButton("M");
		btnM.setBounds(10, 280, 60, 50);
		btnM.setActionCommand("M");
		btnM.addActionListener(al);
		add(btnM);
		
		btnMC = new JButton("MC");
		btnMC.setBounds(70, 280, 60, 50);
		btnMC.setActionCommand("MC");
		btnMC.addActionListener(al);
		add(btnMC);
		
		// Potencias
		btnCuad = new JButton("^2");
		btnCuad.setBounds(10, 350, 60, 50);
		btnCuad.setActionCommand("^2");
		btnCuad.addActionListener(al);
		add(btnCuad);
		
		btnPot = new JButton("^n");
		btnPot.setBounds(60, 350, 60, 50);
		btnPot.setActionCommand("^n");
		btnPot.addActionListener(al);
		add(btnPot);
		
		btnRaízCuad = new JButton("^1/2");
		btnRaízCuad.setBounds(120, 350, 70, 50);
		btnRaízCuad.setActionCommand("^1/2");
		btnRaízCuad.addActionListener(al);
		add(btnRaízCuad);
		
		btnRaíz = new JButton("^1/n");
		btnRaíz.setBounds(190, 350, 70, 50);
		btnRaíz.setActionCommand("^1/n");
		btnRaíz.addActionListener(al);
		add(btnRaíz);
		
	}
	
	// Método del controlador para mostrar ventana
	public void mostrar(){
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
	}

	// Método para la matriz de botones
	public void agregarDigito(String digito) {
		txt.setText(txt.getText()+digito);
		
	}

	// Guardar operando y clear
	public void enviarOperandoA() {
		controlador.guardarOperandoA(txt.getText());
		
	}
	public void enviarOperación(String string) {
		controlador.guardarOperación(string.charAt(0));
		
	}
	
	public void clear() {
		txt.setText("");
		
	}

	// Operaciones aritméticas
	public void hacerOperación() {
		controlador.guardarOperandoB(txt.getText());
		controlador.hacerOperación();
	}

	public void mostrarResultado(double resultado) {
		txt.setText(resultado+"");
		
	}

	public void guardarDato() {
		controlador.guardarDato(txt.getText());
		
	}

	// Potencias
	public void alCuadrado() {
		controlador.alCuadrado();
		
		
	}

	public void raízCuadrada() {
		controlador.raízCuadrada();
		
	}


}
