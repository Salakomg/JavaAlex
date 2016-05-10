package ejercicios;

import javax.swing.JOptionPane;

public class Ej11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//calcular el volumen de una esfera
		//1preguntar el radio al usuario
		String pregunta = JOptionPane.showInputDialog("Dime el redio de una esfera");


		//2 guardarlo en una variable tipo: string 
		//3 pasarlo a double
		double pregunta1 = Double.parseDouble(pregunta);
		//4 aplicar la formula :4/3*3,14 radio al cubo
		//5 mostrarlo al usuario
		JOptionPane.showMessageDialog(null, "El volumen es: " + (pregunta1 *pregunta1 * pregunta1 *(4/3.0)*3.14));

	}

}
