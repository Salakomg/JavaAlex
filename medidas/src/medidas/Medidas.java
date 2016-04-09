package medidas;

import javax.swing.JOptionPane;

public class Medidas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombre = JOptionPane.showInputDialog("Tu nombre porfa?");
		
		String a = JOptionPane.showInputDialog( "Dime un numero y los pasare a todas la unidades.El numero que pongas se lee como km.Te parace bien " +nombre);
		
		JOptionPane.showMessageDialog(null,"Loading :) dale a aceptar");
		
		double b = Double.parseDouble(a);
		
		JOptionPane.showMessageDialog(null,"En hectometros es: " +b *10);
		
		double c = Double.parseDouble(a);
		
		JOptionPane.showMessageDialog(null,"En decametros es: " +c * 100);
		
		double d = Double.parseDouble(a);
		
		JOptionPane.showMessageDialog(null,"En metros es: " +d * 1000);
		
		double e = Double.parseDouble(a);
		
		JOptionPane.showMessageDialog(null,"En decimetros es: " +e *10000);
		
		double f = Double.parseDouble(a);
		
		JOptionPane.showMessageDialog(null,"En centimetros es: " +f *100000);
		
		double g = Double.parseDouble(a);
		
		JOptionPane.showMessageDialog(null,"En minimetros es: " +g * 1000000);
		
		JOptionPane.showMessageDialog(null,"Estas son tadas las medidas en distancia :):):):)");
		
		
	}

}
