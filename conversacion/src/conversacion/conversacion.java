package conversacion;

import javax.swing.JOptionPane;

public class Conversacion {

	public static void main(String[] args) {

		//
		//
		
		String q = JOptionPane.showInputDialog("풲e gusta minecraft?");

		if (q.equals("si")){

			String w = JOptionPane.showInputDialog( "Y el grand thef auto");

			if (w.equals("si")){
				String r = JOptionPane.showInputDialog("Y el Scrap mechanic");
				if (r.equals("si")){
					JOptionPane.showMessageDialog(null, "Entonces eres gamer");	
					if (r.equals("no")) {
						String y = JOptionPane.showInputDialog("풲e gusta jugar a video juegos?");
						if (y.equals("")) {

						}
					}

				}
			}
		}




		if (q.equals("no")) {
			String w = JOptionPane.showInputDialog( "Y el grand thef auto");
			String e = JOptionPane.showInputDialog( "퓍e gusta jugar a video juegos?");
			if (e.equals("si")){ 
				JOptionPane.showMessageDialog(null,"A entonces vale :)");
			}
			if (e.equals("no")) {
				JOptionPane.showMessageDialog(null, "Pues me caes mal >:(");

				if (w.equals("no")) {
					String t = JOptionPane.showInputDialog("풲e gusta jugar a video juegos?");
					if (t.equals("si")) {
						JOptionPane.showConfirmDialog(null, "A entonces vale :)");	
						if (t.equals("no")) {
							JOptionPane.showMessageDialog(null, "Pues me caes mal >:)");


						}


					}
				}
			}
		}
	}
}


