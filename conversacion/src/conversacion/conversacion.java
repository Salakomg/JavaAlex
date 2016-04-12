package conversacion;

import javax.swing.JOptionPane;

public class Conversacion {

	public static void main(String[] args) {



		String q = JOptionPane.showInputDialog("¿Te gusta minecraft?");

		if (q.equals("si")){
			
			String w = JOptionPane.showInputDialog( "Y el grand thef auto");

			if (w.equals("si")){
				String r = JOptionPane.showInputDialog("Y el Scrap mechanic");
				if (r.equals("si")){
					JOptionPane.showMessageDialog(null, "Entonces eres gamer");
				}
			}
			
		}
		
		
		if (q.equals("no")) {

			String e = JOptionPane.showInputDialog( "¿te gusta jugar a video juegos?");
			if (e.equals("si")) 
				JOptionPane.showMessageDialog(null,"A entonces vale :)"); 
				if (e.equals("no")) {
					JOptionPane.showMessageDialog(null, "Pues me caes mal >:(");
					
				}
			}

		}	 
		
		
		
	}




