// Marianne Peña Wust

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;

public class Ventana extends JFrame {
	
	// Atributos
	Controlador controlador;
	JTextField txt;
	JButton btnClear;
	JButton[][] digitos;
	JButton btnA;
	JButton btnB;
	JButton btnC;
	JButton btnD;
	JButton btnE;
	JButton btnF;
	JButton btnSuma;
	JButton btnResta;
	JButton btnMult;
	JButton btnDiv;
	JButton btnM;
	JButton btnMR;
	JButton btnMC;
	JButton btnCuad;
	JButton btnPot;
	JButton btnRaízCuad;
	JButton btnRaíz;
	JLabel lblOp;
	JLabel lblRes;
	JList lstOp;
	JList lstRes;
	JLabel lblDeBase;
	JLabel lblABase;
	JTextField txtDeBase;
	JTextField txtABase;
	JTextField txtConvertido;
	DefaultListModel lstmOp;
	DefaultListModel lstmRes;
	JButton btnConvertir;
	String operación;

	public Ventana(Controlador c) {
		controlador = c;
		
		// Ventana
		this.setTitle("Calculadora de Marianne Peña Wust");
		setBounds(100, 100, 500, 600);
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
		
		// Letras
		btnA = new JButton("a");
		btnA.setBounds(10, 280, 50, 50);
		btnA.setActionCommand("a");
		btnA.addActionListener(al);
		add(btnA);
		
		btnB = new JButton("b");
		btnB.setBounds(60, 280, 50, 50);
		btnB.setActionCommand("b");
		btnB.addActionListener(al);
		add(btnB);
		
		btnC = new JButton("c");
		btnC.setBounds(110, 280, 50, 50);
		btnC.setActionCommand("c");
		btnC.addActionListener(al);
		add(btnC);
		
		btnD = new JButton("d");
		btnD.setBounds(10, 330, 50, 50);
		btnD.setActionCommand("d");
		btnD.addActionListener(al);
		add(btnD);
		
		btnE = new JButton("e");
		btnE.setBounds(60, 330, 50, 50);
		btnE.setActionCommand("e");
		btnE.addActionListener(al);
		add(btnE);
		
		btnF = new JButton("f");
		btnF.setBounds(110, 330, 50, 50);
		btnF.setActionCommand("f");
		btnF.addActionListener(al);
		add(btnF);
		
		
		// M, MR, MC
		btnM = new JButton("M");
		btnM.setBounds(10, 390, 60, 50);
		btnM.setActionCommand("M");
		btnM.addActionListener(al);
		add(btnM);
		
		btnMC = new JButton("MR");
		btnMC.setBounds(70, 390, 60, 50);
		btnMC.setActionCommand("MR");
		btnMC.addActionListener(al);
		add(btnMC);
		
		btnMC = new JButton("MC");
		btnMC.setBounds(130, 390, 60, 50);
		btnMC.setActionCommand("MC");
		btnMC.addActionListener(al);
		add(btnMC);
		
		// Potencias
		btnCuad = new JButton("^2");
		btnCuad.setBounds(10, 450, 60, 50);
		btnCuad.setActionCommand("^2");
		btnCuad.addActionListener(al);
		add(btnCuad);
		
		btnPot = new JButton("^n");
		btnPot.setBounds(60, 450, 60, 50);
		btnPot.setActionCommand("^n");
		btnPot.addActionListener(al);
		add(btnPot);
		
		btnRaízCuad = new JButton("^1/2");
		btnRaízCuad.setBounds(120, 450, 70, 50);
		btnRaízCuad.setActionCommand("^1/2");
		btnRaízCuad.addActionListener(al);
		add(btnRaízCuad);
		
		btnRaíz = new JButton("^1/n");
		btnRaíz.setBounds(190, 450, 70, 50);
		btnRaíz.setActionCommand("^1/n");
		btnRaíz.addActionListener(al);
		add(btnRaíz);
		
		// Historial de operaciones y resultados
		lblOp = new JLabel("Historial de operaciones");
		lblOp.setBounds(280, 60, 200, 30);
		add(lblOp);
		
		lstmOp = new DefaultListModel();
		lstOp= new JList(lstmOp);
		lstOp.setBounds(280, 95, 200, 100);
		lstOp.setLayoutOrientation(JList.VERTICAL_WRAP);
		add(lstOp);
		
		lblRes = new JLabel("Historial de resultados");
		lblRes.setBounds(280, 210, 200, 30);
		add(lblRes);
		
		lstmRes = new DefaultListModel();
		lstRes= new JList(lstmRes);
		lstRes.setBounds(280, 250, 200, 100);
		lstRes.setLayoutOrientation(JList.VERTICAL_WRAP);
		add(lstRes);
		
		// Convertidor de bases
		lblDeBase= new JLabel("De base");
		lblDeBase.setBounds(10, 510, 60, 30);
		add(lblDeBase);
		
		txtDeBase = new JTextField();
		txtDeBase.setBounds(75, 510, 30, 30);
		add(txtDeBase);
		
		lblABase = new JLabel("a base");
		lblABase.setBounds(110, 510, 60, 30);
		add(lblABase);
		
		txtABase= new JTextField();
		txtABase.setBounds(170, 510, 30, 30);
		add(txtABase);
		
		btnConvertir = new JButton("Convertir");
		btnConvertir.setBounds(210, 510, 100, 30);
		btnConvertir.setActionCommand("%");
		btnConvertir.addActionListener(al);
		add(btnConvertir);
		
		txtConvertido= new JTextField(" ");
		txtConvertido.setBounds(315, 510, 150, 30);
		add(txtConvertido);
		
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

    // M, MR, MC
	public void guardarDato() {
		controlador.guardarDato(txt.getText());
		
	}
	
	public void mostrarDato() {
        txt.setText(controlador.elDato());
	}
	
	public void vaciarMemoria() {
		controlador.vaciarMemoria(" ");
		
	}

	// Potencias
	public void alCuadrado() {
		controlador.alCuadrado();
		
	}

	public void raízCuadrada() {
		controlador.raízCuadrada();
		
	}

	// Historial operaciones y resultados
	public void histOp(double a, double b, char c) {
		operación = a + "" + c + "" + b;
		lstmOp.addElement(operación);
	}

	public void histRes(double a) {
		lstmRes.addElement(a);
		
	}

	// Entre bases
	public void enviarDeBase() {
		controlador.guardarDeBase(txtDeBase.getText());
		
	}

	public void enviarABase() {
		controlador.guardarABase(txtABase.getText());		
	}

	public void enviarConversión() {
		controlador.enviarConversión(txt.getText());
		
	}

	public void mostrarConvertido(String convertido) {
		txtConvertido.setText(convertido);
		
	}
	


}
