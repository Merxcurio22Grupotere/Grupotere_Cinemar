package Proyectofinal;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.ScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JToolBar;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import java.awt.Font;

public class Bienvenidos extends JFrame {

	private JPanel contentPane;
	String usuario="";
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bienvenidos frame = new Bienvenidos();
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
	public Bienvenidos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 421, 596);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		INICIO usuariobien = new INICIO();
		usuario = usuariobien.texto; 
		
		JButton btnNewButton_1 = new JButton("!BIENVENIDO¡");
		btnNewButton_1.setForeground(new Color(51, 102, 153));
		btnNewButton_1.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 16));
		btnNewButton_1.setBackground(new Color(51, 153, 255));
		btnNewButton_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
	
		
		
		JLabel lblNewLabel_2 = new JLabel(""+usuario );
		lblNewLabel_2.setForeground(new Color(51, 153, 204));
		lblNewLabel_2.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 18));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(127, 73, 137, 34);
		contentPane.add(lblNewLabel_2);
		btnNewButton_1.setBounds(80, 35, 237, 40);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Entrarmenu();
				
			}
		});
		btnNewButton.setSelectedIcon(new ImageIcon("F:\\usuarios\\alumno\\Descargas\\pngwing.com (15).png"));
		btnNewButton.setBorder(new TitledBorder(null, "", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		btnNewButton.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton.setIcon(new ImageIcon("F:\\usuarios\\alumno\\Descargas\\pngwing.com (12).png"));
		btnNewButton.setBounds(163, 246, 74, 74);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon("F:\\usuarios\\alumno\\Descargas\\pngwing.com (20).png"));
		lblNewLabel_1.setBounds(10, 411, 297, 143);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("F:\\usuarios\\alumno\\Descargas\\pngwing.com (19).png"));
		lblNewLabel.setBounds(-194, -75, 791, 710);
		contentPane.add(lblNewLabel);
	
	}

	protected void Entrarmenu() {
		
		this.dispose();
		 Menugeneral inicio1 = new Menugeneral();
		 inicio1.setVisible(true);;
		// TODO Auto-generated method stub
		
	}
}
