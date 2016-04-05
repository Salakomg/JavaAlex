package ejercicios;

import javax.swing.JOptionPane;
import javax.xml.bind.ParseConversionEvent;

public class EJ10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = JOptionPane.showInputDialog("Cuantos km/h paso a m/s");
		
		double b = Double.parseDouble(a); 
		
		double metrosPorHora = b * 1000;  
		
		double metrosPorSegundo =  metrosPorHora / 3600.0;
		
		System.out.println(metrosPorSegundo);
	
        JOptionPane.showMessageDialog(null,"Es igual a: " + metrosPorSegundo); 
		
		
		

	}

}
