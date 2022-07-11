package Proyectofinal;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class Salauno extends JFrame {

	static Salacine sala1;
	private JPanel contentPane;
	private static JTextField textField_1;
	private static JTextField textField_2;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		sala1 = new Salacine(6,7);
		sala1.llenarSalaPorDefecto();
		sala1.imprimirSala();
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Salauno frame = new Salauno();
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
	public Salauno() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 425, 608);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Volvermenu();
				
			}
		});
		
		
		
		JButton btnNewButton_1 = new JButton("Asientos Disponibles");
		btnNewButton_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		btnNewButton_1.setFont(new Font("SansSerif", Font.BOLD, 12));
		btnNewButton_1.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_1.setBackground(SystemColor.textHighlight);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				imprimirSala();
				
			}
		});
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setIcon(new ImageIcon("F:\\usuarios\\alumno\\Descargas\\install\\app worvwnch\\data\\minios.jpg"));
		lblNewLabel_3.setBounds(24, 79, 151, 184);
		contentPane.add(lblNewLabel_3);
		btnNewButton_1.setBounds(24, 286, 164, 42);
		contentPane.add(btnNewButton_1);
		
		
		
		JLabel panel = new JLabel("");
		panel.setVerticalAlignment(SwingConstants.TOP);
		panel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.setIcon(new ImageIcon("F:\\usuarios\\alumno\\Descargas\\install\\app worvwnch\\data\\Captura de pantalla (254).png"));
		panel.setOpaque(true);
		panel.setBounds(200, 79, 199, 249);
		contentPane.add(panel);
		
		
		
		

		
		textField_2 = new JTextField();
		textField_2.setBounds(330, 405, 33, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(330, 355, 33, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("COMPRAR ENTRADA");
		btnNewButton.setBackground(new Color(255, 215, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comprarEntrada();
				
			}
		});
		btnNewButton.setBounds(77, 483, 267, 63);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Elige la coluna de tu butaca");
		lblNewLabel_2.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		lblNewLabel_2.setBackground(new Color(240, 255, 240));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setOpaque(true);
		lblNewLabel_2.setToolTipText("");
		lblNewLabel_2.setBounds(34, 402, 278, 26);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("Elege la fila de tu butaca:");
		lblNewLabel_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		lblNewLabel_1.setBackground(new Color(240, 255, 240));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setAutoscrolls(true);
		lblNewLabel_1.setBounds(34, 352, 278, 26);
		contentPane.add(lblNewLabel_1);
		btnNewButton_5.setBorder(new TitledBorder(null, "", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		btnNewButton_5.setBackground(new Color(0, 51, 102));
		btnNewButton_5.setIcon(new ImageIcon("F:\\usuarios\\alumno\\Descargas\\install\\app worvwnch\\data\\pngwing.com (18).png"));
		btnNewButton_5.setBounds(14, 11, 50, 49);
		contentPane.add(btnNewButton_5);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setOpaque(true);
		lblNewLabel.setIcon(new ImageIcon("F:\\usuarios\\alumno\\Descargas\\install\\app worvwnch\\data\\cine3.png"));
		lblNewLabel.setBounds(0, -28, 450, 623);
		contentPane.add(lblNewLabel);
		
	}
	protected void imprimirSala() {
		// TODO Auto-generated method stub
		sala1.imprimirSala();
	}

	
	
	
	
	public static void comprarBoletos() {
		
		
		
		boolean flag;
		 int comprarfila;
		int comprarcolumna;

	    
		

	 
		
			do {
				comprarfila= Integer.parseInt(textField_1.getText());
				comprarcolumna= Integer.parseInt(textField_2.getText());
				limpiar ();
				
				flag = sala1.verificarAsiento(comprarfila, comprarcolumna);
				
				
			}while (!flag);
			
			
			sala1.comprarBoleto(comprarfila, comprarcolumna);
			
	}private static void limpiar(){
				textField_1.setText("");
				textField_2.setText("");
	}

	


	protected void comprarEntrada() {
		// TODO Auto-generated method stub
		
		comprarBoletos();
			
		}

		




	protected void Volvermenu() {
		this.dispose();
		Cartelera cartelera = new Cartelera();
		cartelera.setVisible(true);
		
		
		
		
	}
	}
