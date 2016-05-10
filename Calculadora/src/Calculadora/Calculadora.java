package Calculadora;

import javax.swing.JOptionPane;
import javax.xml.bind.ParseConversionEvent;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String operacion = JOptionPane.showInputDialog("Tienes cuatro opciones sumar,restar,multiplicar y dividir");

		String numero = JOptionPane.showInputDialog("Dime un número para operar");

		String numero1 = JOptionPane.showInputDialog("Dime otro número por el que hacer la operacion");

		int numero2 = Integer.parseInt(numero);
		int numero3 = Integer.parseInt(numero1);

		if (operacion.equals("sumar")) {
			JOptionPane.showMessageDialog(null, "El resultado es: " + (numero2 + numero3));
		}
		if (operacion.equals("restar")) {

			JOptionPane.showMessageDialog(null, "El resultado es: " + (numero2 - numero3));
		}
		if (operacion.equals("multiplicar")) {
			JOptionPane.showMessageDialog(null, "El resultado es: " + (numero2 * numero3));		
		}
		if (operacion.equals("dividir")) {	
			if (numero3==0) {
				JOptionPane.showMessageDialog(null, "Esa operacion no se puede hacer:(");
			}else{
				JOptionPane.showMessageDialog(null, "El resultado es: " + (numero2 / numero3));	
			}


		}
	}
}