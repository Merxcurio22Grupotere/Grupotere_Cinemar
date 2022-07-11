package Proyectofinal;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.TitledBorder;

public class Registrolog extends JFrame {



	private JPanel contentPane;
	private JTextField textusuarionombre;
	private JPasswordField txtcontraseña;
	private JPasswordField txtcontraseña2;
	private JTextField textcorreo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registrolog frame = new Registrolog();
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
	public Registrolog() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 430, 613);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Volverlogim();
			}
		});
		btnNewButton.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		btnNewButton.setBackground(new Color(0, 51, 102));
		btnNewButton.setIcon(new ImageIcon("F:\\usuarios\\alumno\\Descargas\\install\\app worvwnch\\data\\pngwing.com (18).png"));
		btnNewButton.setBounds(13, 13, 51, 49);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("!BIENVENIDO\u00A1");
		lblNewLabel.setForeground(new Color(245, 245, 220));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(127, 11, 146, 41);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("!Crea tu Usuario");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(148, 40, 105, 22);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("y empieza a disfrutar de beneficios\u00A1");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(103, 55, 204, 31);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Nombre de usuario:");
		lblNewLabel_3.setForeground(new Color(245, 245, 220));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_3.setBounds(13, 138, 162, 27);
		contentPane.add(lblNewLabel_3);
		
		textusuarionombre = new JTextField();
		textusuarionombre.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textusuarionombre.setBounds(185, 136, 204, 31);
		contentPane.add(textusuarionombre);
		textusuarionombre.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Contrase\u00F1a:");
		lblNewLabel_4.setForeground(new Color(245, 245, 220));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_4.setBounds(70, 193, 105, 31);
		contentPane.add(lblNewLabel_4);
		
		txtcontraseña = new JPasswordField();
		txtcontraseña.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtcontraseña.setBounds(185, 193, 204, 31);
		contentPane.add(txtcontraseña);
		
		JLabel lblNewLabel_5 = new JLabel("Repetir contrase\u00F1a:");
		lblNewLabel_5.setBackground(new Color(0, 0, 0));
		lblNewLabel_5.setForeground(new Color(245, 245, 220));
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(10, 253, 172, 27);
		contentPane.add(lblNewLabel_5);
		
		txtcontraseña2 = new JPasswordField();
		txtcontraseña2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtcontraseña2.setBounds(185, 251, 204, 31);
		contentPane.add(txtcontraseña2);
		
		JLabel lblNewLabel_6 = new JLabel("E-mail:");
		lblNewLabel_6.setForeground(new Color(245, 245, 220));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_6.setBounds(117, 310, 58, 31);
		contentPane.add(lblNewLabel_6);
		
		textcorreo = new JTextField();
		textcorreo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textcorreo.setBounds(185, 310, 204, 31);
		contentPane.add(textcorreo);
		textcorreo.setColumns(10);
		
		JButton Bregistrar = new JButton("Registrarse");
		Bregistrar.setBackground(new Color(70, 130, 180));
		Bregistrar.setForeground(new Color(0, 0, 0));
		Bregistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Sqlconeccion usuario3= new Sqlconeccion();
				usuario modelo = new usuario();
				
				String contraseña1 = new String(txtcontraseña.getPassword());//cambia en relacion al login
				String contraseña2 = new String (txtcontraseña2.getPassword());
				
				 //una condicional para ver si coinciden las contraseñas
				
				if (contraseña1.equals(contraseña2) ) {
					String nuevacontra = (contraseña1);
				modelo.setNombre_usuario(textusuarionombre.getText());
				modelo.setContraseña(nuevacontra);
				modelo.setCorreo(textcorreo.getText());
			
				
				if (usuario3.registrar(modelo)){
					JOptionPane.showConfirmDialog(getContentPane(), "TE REGISTRASTE EXITOSAMENTE");
					limpiar ();
					
					
				}else {
					JOptionPane.showConfirmDialog(getContentPane(), "ERROR, INTENTALO NUEVAMENTE¡");
				}
				}
				else {
					 JOptionPane.showConfirmDialog(getContentPane(), "LAS CONTRASEÑAS NO SON IGUALES");
				}
				
				}
				private void limpiar (){
					textusuarionombre.setText("");
					txtcontraseña.setText("");
					txtcontraseña2.setText("");
					textcorreo.setText("");
					
					
				
			}
		});
		Bregistrar.setFont(new Font("Tahoma", Font.BOLD, 16));
		Bregistrar.setBounds(117, 406, 160, 49);
		contentPane.add(Bregistrar);
		
		JLabel Label1 = new JLabel("");
		Label1.setBounds(0, 0, 414, 574);
		contentPane.add(Label1);
		Label1.setIcon(new ImageIcon("F:\\usuarios\\alumno\\Descargas\\install\\app worvwnch\\data\\cine2.png"));
		contentPane.add(Label1);
	}

	protected void Volverlogim() {
		// TODO Auto-generated method stub
		this.dispose();
		INICIO logim2 = new INICIO();
		logim2.setVisible(true);
		
		
	}
}

