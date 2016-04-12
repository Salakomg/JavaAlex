package mediads;

import javax.swing.JOptionPane;

public class medm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String pregunta = JOptionPane.showInputDialog("¿Dime una cantidad en kilometros?");
		 		
		 		int a = Integer.parseInt(pregunta);
		 		
		 	    int b = a * 10;
		 	     
		 	    String opcion = JOptionPane.showInputDialog("Ahora te lo pasare en la unidad que tu me digas(km, hm, dam, m, dm, cm, mm) esto es con decimales");
		 	    
		 	    if(opcion.equals("hm")){
		     
		 	    	JOptionPane.showMessageDialog(null, "En hm es: " + b);
		 	    }
		 	  
		 	    if(opcion.equals("dam")){
		 	    	
		 	    	double h = a * 100;
		 	    
		 	    	JOptionPane.showMessageDialog(null, "En dam es: " + h);
		 	    }
		 	    
		 	    if(opcion.equals("m")){
		 	       
		 	    	double j = a * 1000;
		 	    
		 	        JOptionPane.showMessageDialog(null, "En m es: " + j);
		 	    }
		 	    
		 	    if(opcion.equals("dm")){
		 	    	double k = a * 10000;
		 	        JOptionPane.showMessageDialog(null,"En dm es: " + k);
		 	    }
		 	    
		 	    if(opcion.equals("cm")){
		 	    	
		 	    	double q = a * 100000;
		 	    	
		 	    	JOptionPane.showMessageDialog(null, "En cm es: " + q);
		 	    	
		    }
		 
		 	    if(opcion.equals("mm")){
		 	    	double  w = a * 1000000;
		 	        JOptionPane.showMessageDialog(null, "En mm es: " + w);
		 	    }
		 	    
		 	}
		 }	    
		 	    
		 	
		 	
		       

	


