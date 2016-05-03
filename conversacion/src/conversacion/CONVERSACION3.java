package conversacion;

import javax.swing.JOptionPane;

public class CONVERSACION3 {

	public static void main(String[] args) {

		String gustapc = JOptionPane.showInputDialog("Te gustan los ordenadores");
		if (gustapc.equals("no")) {
			String gustaxbox = JOptionPane.showInputDialog("Te gusta la xbox 360");
			if (gustaxbox.equals("si")) {
				String gustajuegosxbox = JOptionPane.showInputDialog("Te gustan los juegos de la xbox 360");
				if (gustajuegosxbox.equals("si")) {
					JOptionPane.showMessageDialog(null, "Algunos estan guays");

				}
			}
			String gustaps4 = JOptionPane.showInputDialog("Te gusta la play station 4");
			if (gustaps4.equals("si")) {
				JOptionPane.showMessageDialog(null, "Te gusta la play eh");
				
			}
			if (gustaps4.equals("no")) {
				JOptionPane.showMessageDialog(null, "Pues me caes mal >:(");
				
			}
		}
         if (gustapc.equals("si")) {
		String gustaMinecraft = JOptionPane.showInputDialog("¿Te gusta Minecraft");

		if (gustaMinecraft.equals("si")){
			//Si le gusta minecraft
			String gustaGTA = JOptionPane.showInputDialog("¿Te gusta el gta v?");

			if (gustaGTA.equals("si")) {
				JOptionPane.showMessageDialog(null, "Te gustan todos eh,que guay :) ");
			}
			if (gustaGTA.equals("no")) {
				JOptionPane.showMessageDialog(null, "Solo uno eh :/");	
			}
		}
		if (gustaMinecraft.equals("no")) {
			String gustacall = JOptionPane.showInputDialog("Te gusta Call of duty");					
			if (gustacall.equals("si")) {
				JOptionPane.showMessageDialog(null, "Bueno no esta mal");

			}  
			if (gustacall.equals("no")) {
				JOptionPane.showMessageDialog(null, "No te gusta ninguno");
			}
			}	

		}

	}
}