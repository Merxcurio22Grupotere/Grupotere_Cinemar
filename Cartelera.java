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
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class Cartelera extends JFrame {
static Salacine sala[][];
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cartelera frame = new Cartelera();
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
	public Cartelera() {
	
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 425, 608);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JButton btnNewButton = new JButton("");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					compraentradas();
					
				}
			});
			
			JButton btnNewButton_4 = new JButton("CARTELERA");
			btnNewButton_4.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			btnNewButton_4.setForeground(new Color(245, 245, 220));
			btnNewButton_4.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 16));
			btnNewButton_4.setBackground(new Color(70, 130, 180));
			btnNewButton_4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			
			JButton btnNewButton_5 = new JButton("");
			btnNewButton_5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Volvermenu();
					
				}
			});
			btnNewButton_5.setBorder(new TitledBorder(null, "", TitledBorder.CENTER, TitledBorder.TOP, null, null));
			btnNewButton_5.setBackground(new Color(0, 51, 102));
			btnNewButton_5.setIcon(new ImageIcon("F:\\usuarios\\alumno\\Descargas\\install\\app worvwnch\\data\\pngwing.com (18).png"));
			btnNewButton_5.setBounds(14, 11, 50, 49);
			contentPane.add(btnNewButton_5);
			btnNewButton_4.setBounds(80, 11, 247, 42);
			contentPane.add(btnNewButton_4);
			
			JButton btnNewButton_2 = new JButton("");
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					entrarsalatres();
				}
			});
			btnNewButton_2.setIcon(new ImageIcon("F:\\usuarios\\alumno\\Descargas\\install\\app worvwnch\\data\\Sing2.jpg"));
			btnNewButton_2.setDoubleBuffered(true);
			btnNewButton_2.setBounds(43, 321, 153, 234);
			contentPane.add(btnNewButton_2);
			
			JButton btnNewButton_3 = new JButton("New button");
			btnNewButton_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					entrarsalacuatro();
				}
			});
			btnNewButton_3.setIcon(new ImageIcon("F:\\usuarios\\alumno\\Descargas\\install\\app worvwnch\\data\\juarico.jpg"));
			btnNewButton_3.setBounds(224, 321, 153, 234);
			contentPane.add(btnNewButton_3);
			
			JButton btnNewButton_1 = new JButton("New button");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					entrarsala2();
				}
			});
			btnNewButton_1.setIcon(new ImageIcon("F:\\usuarios\\alumno\\Descargas\\install\\app worvwnch\\data\\liger.jpg"));
			btnNewButton_1.setBounds(224, 76, 153, 234);
			contentPane.add(btnNewButton_1);
			btnNewButton.setIcon(new ImageIcon("F:\\usuarios\\alumno\\Descargas\\install\\minios.jpg"));
			btnNewButton.setBounds(43, 76, 153, 234);
			contentPane.add(btnNewButton);
			
			JLabel lblNewLabel = new JLabel("");
			lblNewLabel.setOpaque(true);
			lblNewLabel.setIcon(new ImageIcon("F:\\usuarios\\alumno\\Descargas\\install\\app worvwnch\\data\\cine3.png"));
			lblNewLabel.setBounds(0, -28, 450, 623);
			contentPane.add(lblNewLabel);
			
		}
	
	protected void entrarsalacuatro() {
		// TODO Auto-generated method stub
		this.dispose();
		Salacuatro compra = new Salacuatro();
		compra.setVisible(true);
	}

	protected void entrarsalatres() {
		// TODO Auto-generated method stub
		this.dispose();
		Salatres compra = new Salatres();
		compra.setVisible(true);
	}

	protected void entrarsala2() {
		// TODO Auto-generated method stub
		this.dispose();
		Salados compra = new Salados();
		compra.setVisible(true);
	}

	protected void compraentradas() {
		// TODO Auto-generated method stub
	
		this.dispose();
		Salauno compra = new Salauno();
		compra.setVisible(true);
	}

	protected void Volvermenu() {
		this.dispose();
		Menugeneral menuprincipal = new Menugeneral();
		menuprincipal.setVisible(true);
	}
}
