import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTable;
import java.awt.Toolkit;

public class FinalDeCursoBueno extends JFrame {

	private JPanel contentPane;
	private JTextField pantalla;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FinalDeCursoBueno frame = new FinalDeCursoBueno();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FinalDeCursoBueno() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Alumno\\Desktop\\images.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCalculadoraPorAlex = new JLabel("Calculadora por Alex villen");
		lblCalculadoraPorAlex.setBounds(10, 11, 138, 22);
		contentPane.add(lblCalculadoraPorAlex);
		
		JButton btn0 = new JButton("0");
		btn0.setForeground(Color.BLUE);
		btn0.setBackground(Color.ORANGE);
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn0.setBounds(42, 202, 39, 22);
		contentPane.add(btn0);
		
		JButton btn1 = new JButton("1");
		btn1.setForeground(Color.BLUE);
		btn1.setBackground(Color.ORANGE);
		btn1.setBounds(42, 168, 39, 23);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setForeground(Color.BLUE);
		btn2.setBackground(Color.ORANGE);
		btn2.setBounds(91, 168, 39, 23);
		contentPane.add(btn2);
		
		JButton btnigual = new JButton("=");
		btnigual.setBounds(91, 202, 88, 22);
		contentPane.add(btnigual);
		
		@Override
		public void actionPerformed (ActionEvent e){
			if (e.getSource()==btnigual) {
				setTitle("HAs pulsado el boton =");
				System.out.println("has pulado el boton =");
			}
		}

		

		
		JButton btn3 = new JButton("3");
		btn3.setForeground(Color.BLUE);
		btn3.setBackground(Color.ORANGE);
		btn3.setBounds(140, 168, 39, 23);
		contentPane.add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.setForeground(Color.BLUE);
		btn4.setBackground(Color.ORANGE);
		btn4.setBounds(41, 130, 39, 23);
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setBackground(Color.ORANGE);
		btn5.setForeground(Color.BLUE);
		btn5.setBounds(91, 130, 39, 23);
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setForeground(Color.BLUE);
		btn6.setBackground(Color.ORANGE);
		btn6.setBounds(140, 130, 39, 23);
		contentPane.add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.setForeground(Color.BLUE);
		btn7.setBackground(Color.ORANGE);
		btn7.setBounds(41, 96, 40, 23);
		contentPane.add(btn7);
		contentPane.add(pantalla);
		
		JButton btn8 = new JButton("8");
		btn8.setForeground(Color.BLUE);
		btn8.setBackground(Color.ORANGE);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn8.setBounds(91, 96, 39, 23);
		contentPane.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setForeground(Color.BLUE);
		btn9.setBackground(Color.ORANGE);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn9.setBounds(140, 96, 39, 23);
		contentPane.add(btn9);
		
		pantalla = new JTextField();
		pantalla.setBounds(42, 44, 278, 41);
		contentPane.add(pantalla);
		pantalla.setColumns(10);
		
		//dibujo boton +
		JButton btnmas = new JButton("+");
		btnmas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnmas.setBounds(189, 96, 89, 23);
		contentPane.add(btnmas);
		
		//dibujo boton -
		JButton btnmenos = new JButton("-");
		btnmenos.setBounds(189, 130, 89, 23);
		contentPane.add(btnmenos);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(189, 168, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(189, 202, 89, 23);
		contentPane.add(btnNewButton_2);
		
		

	}
	
}





