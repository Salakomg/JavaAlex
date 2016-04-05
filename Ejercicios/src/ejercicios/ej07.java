package ejercicios;

import java.nio.channels.ShutdownChannelGroupException;

import javax.swing.JOptionPane;

public class ej07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = JOptionPane.showInputDialog("numero");
				
				int b = Integer.parseInt(a);
				
				String c = "El doble es: ";
			    JOptionPane.showMessageDialog(null, c+  (b*2));
			    
			    String d = "El doble es: ";
			    JOptionPane.showMessageDialog(null, d+ ( b*3) );
	}

}
