package ejercicios;

import javax.swing.JOptionPane;

public class Ej13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String pregunta = JOptionPane.showInputDialog("dime un numero de tres cifras");
		
		int a = Integer.parseInt(pregunta);
		
		int unidades = a % 10;
		int decenas = (a % 100-unidades)/10;
		int centenas = (a % 1000-decenas)/100;
		
		JOptionPane.showMessageDialog(null, "Las unidades son: "+ unidades);
		JOptionPane.showMessageDialog(null, "Las decenas son: " +decenas);
		JOptionPane.showMessageDialog(null, "Las centenas son: " +centenas);
		
		
	}

}
