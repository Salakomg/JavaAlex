package ejercicios;

import javax.swing.JOptionPane;

public class ej08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String c = JOptionPane.showInputDialog("grados");
		
		double a = Double.parseDouble(c);
		
		double F = 32 + ( 9 * a / 5);
		
		System.out.println(+ F);
	
	
	
	}

}
