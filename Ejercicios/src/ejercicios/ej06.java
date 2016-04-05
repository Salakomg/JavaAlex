package ejercicios;

import javax.swing.JOptionPane;

public class ej06 {

	public static void main(String[] args) {
		
		String s = JOptionPane.showInputDialog("¿Cual es tu nombre?");
		
		int n = Integer.parseInt(s);
		
		
		String t = "Buenos dias ";
		
		JOptionPane.showMessageDialog(null, t+  (n*2));
		
		
				
				
				
				

	}

}
