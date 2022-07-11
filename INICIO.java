package Proyectofinal;

import java.awt.BorderLayout;
import java.awt.Color;
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
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.border.TitledBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.JToggleButton;
import javax.swing.JCheckBox;

public class INICIO extends JFrame {

    static Salacine sala;
	private JPanel contentPane;
	private JTextField textusuario;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JButton btnNewButton_1;
	private JLabel lblNewLabel_3;
	private JButton btnNewButton_2;
	private JPasswordField textcontraseña;
	public static String texto = "";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					INICIO frame = new INICIO();
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
	public INICIO() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 428, 613);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnNewButton_1 = new JButton("Entrar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			Entrar();
			
			}
		});
		
		textcontraseña = new JPasswordField();
		textcontraseña.setFont(new Font("Tiresias", Font.BOLD, 20));
		textcontraseña.setBackground(new Color(176, 224, 230));
		textcontraseña.setBounds(68, 379, 279, 31);
		contentPane.add(textcontraseña);
		
		btnNewButton_2 = new JButton("Registrarse");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Registrarse();
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_2.setForeground(new Color(240, 248, 255));
		btnNewButton_2.setBackground(new Color(70, 130, 180));
		btnNewButton_2.setBounds(143, 468, 128, 21);
		contentPane.add(btnNewButton_2);
		btnNewButton_1.setForeground(new Color(245, 245, 220));
		btnNewButton_1.setFont(new Font("Tiresias", Font.BOLD, 22));
		btnNewButton_1.setBackground(new Color(0, 139, 139));
		btnNewButton_1.setBounds(143, 416, 128, 41);
		contentPane.add(btnNewButton_1);
		
		lblNewLabel_2 = new JLabel("Contrase\u00F1a:");
		lblNewLabel_2.setBackground(Color.BLACK);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(new Color(245, 245, 220));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_2.setBounds(70, 341, 277, 41);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_1 = new JLabel("Usuario:");
		lblNewLabel_1.setBackground(Color.BLACK);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_1.setForeground(new Color(245, 245, 220));
		lblNewLabel_1.setBounds(89, 278, 231, 31);
		contentPane.add(lblNewLabel_1);
		
		
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				x();
				
			}
		});
		btnNewButton.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		btnNewButton.setHorizontalAlignment(SwingConstants.CENTER);
		btnNewButton.setIcon(new ImageIcon("F:\\usuarios\\alumno\\Descargas\\pngwing.com (18).png"));
		btnNewButton.setFont(new Font("Tiresias", Font.PLAIN, 11));
		btnNewButton.setBackground(new Color(0, 51, 102));
		btnNewButton.setForeground(new Color(0, 51, 102));
		btnNewButton.setBounds(353, 11, 53, 53);
		contentPane.add(btnNewButton);
		
		textusuario = new JTextField();
		textusuario.setFont(new Font("Tiresias", Font.BOLD, 20));
		textusuario.setBackground(new Color(176, 224, 230));
		textusuario.setBounds(70, 311, 277, 31);
		contentPane.add(textusuario);
		textusuario.setColumns(10);
		
		lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setIcon(new ImageIcon("F:\\usuarios\\alumno\\Descargas\\pngwing.com (3).png"));
		lblNewLabel_3.setBounds(0, 76, 408, 177);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBounds(0, -11, 418, 599);
		lblNewLabel.setIcon(new ImageIcon("F:\\usuarios\\alumno\\Descargas\\install\\app worvwnch\\data\\Captura de pantalla (223).png"));
		contentPane.add(lblNewLabel);
	}

	protected void Registrarse() {
		// TODO Auto-generated method stub
		this.dispose();
		 Registrolog alregistro = new Registrolog();
		 alregistro.setVisible(true); 
		
	}

	protected void Entrar() {
		
		// TODO Auto-generated method stub
		
		String usuario = textusuario.getText();//agregados necesarios
		String contraseña = String.valueOf(textcontraseña.getPassword());
		
		texto = textusuario.getText().trim();//esto es para pasar el nombre al carte de bienvenida
		
		
		GesUsuario gestionUsuario = new GesUsuario ();
		
		usuario usuario2 = new usuario ();
		
		
		usuario2.setNombre_usuario(usuario);
		usuario2.setContraseña(contraseña);
		
		usuario usu = gestionUsuario.obtenerNombre_usuario(usuario2);
		
		 if (usu!= null) {
			 
			 this.dispose();
			 Bienvenidos bienvenida1 = new Bienvenidos();
			 bienvenida1.setVisible(true);
			 
			 
			 
		 } else {
			 JOptionPane.showConfirmDialog(getContentPane(), "DATOS INVALIDOS", "ERROR", JOptionPane.ERROR_MESSAGE);
			 
		 }
		
	}

	protected void x() {
		// TODO Auto-generated method stub
		System.exit(0);
	}
}
