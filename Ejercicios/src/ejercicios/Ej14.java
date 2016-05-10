package ejercicios;

import javax.swing.JOptionPane;

public class Ej14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = JOptionPane.showInputDialog("dime un numero de cinco cifras");
		
		int n = Integer.parseInt(a);
		
		int unidades = n % 10;
		int decenas = (n % 100 - unidades)/10;
		int centenas = (n % 1000 - decenas)/100;
		int unidadesdemillar = (n % 10000 - centenas)/1000;
		int decenasdemillar = n/10000;
		
		JOptionPane.showMessageDialog(null, "Las unidades son: " +unidades);
		JOptionPane.showMessageDialog(null, "Las decenas son: " +decenas);
		JOptionPane.showMessageDialog(null, "Las centenas son: " +centenas);
		JOptionPane.showMessageDialog(null, "Las unidades de millar son: " +unidadesdemillar);
		JOptionPane.showMessageDialog(null, "Las decenas de millae son: " +decenasdemillar);
		
	}

}
