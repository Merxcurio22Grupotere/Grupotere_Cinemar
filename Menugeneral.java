package Proyectofinal;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JRadioButton;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import java.awt.Font;
import java.awt.ComponentOrientation;
import javax.swing.JButton;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JCheckBoxMenuItem;
import java.awt.SystemColor;

public class Menugeneral extends JFrame {

	private JPanel contentPane;
	static Salacine sala;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menugeneral frame = new Menugeneral();
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
	public Menugeneral() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 421, 589);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_2 = new JButton("PROXIMOS EXTRENOS");
		btnNewButton_2.setForeground(new Color(51, 102, 153));
		btnNewButton_2.setBorderPainted(false);
		btnNewButton_2.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		btnNewButton_2.setBackground(new Color(51, 153, 255));
		btnNewButton_2.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 14));
		btnNewButton_2.setBounds(80, 53, 242, 40);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				entrarsalacuaro();
			}
		});
		btnNewButton.setFont(new Font("SansSerif", Font.BOLD, 11));
		btnNewButton.setBackground(new Color(51, 153, 255));
		btnNewButton.setIcon(new ImageIcon("F:\\usuarios\\alumno\\Descargas\\install\\liger.jpg"));
		btnNewButton.setBounds(53, 115, 180, 246);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon("F:\\usuarios\\alumno\\Descargas\\install\\juarico.jpg"));
		btnNewButton_1.setBounds(174, 270, 180, 246);
		contentPane.add(btnNewButton_1);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setAutoscrolls(true);
		menuBar.setBackground(new Color(0, 102, 153));
		menuBar.setBounds(0, 0, 405, 24);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("    INICIO   ");
		mnNewMenu.setFont(new Font("SansSerif", Font.BOLD, 11));
		mnNewMenu.setBorderPainted(true);
		mnNewMenu.setBackground(new Color(51, 102, 153));
		mnNewMenu.setHorizontalAlignment(SwingConstants.CENTER);
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("CARTELERA");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Incartelera();
				
			}
		});
		mntmNewMenuItem.setBackground(new Color(0, 102, 153));
		mntmNewMenuItem.setFont(new Font("SansSerif", Font.BOLD, 11));
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("BUFET");
		mntmNewMenuItem_1.setBackground(new Color(0, 102, 153));
		mntmNewMenuItem_1.setFont(new Font("SansSerif", Font.BOLD, 11));
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenu mnNewMenu_5 = new JMenu("SALAS");
		mnNewMenu_5.setFont(new Font("Segoe UI", Font.BOLD, 11));
		menuBar.add(mnNewMenu_5);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("2D");
		mntmNewMenuItem_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				irmenusalas();
				
			}
		});
		mntmNewMenuItem_6.setBackground(new Color(0, 102, 153));
		mntmNewMenuItem_6.setFont(new Font("SansSerif", Font.BOLD, 11));
		mnNewMenu_5.add(mntmNewMenuItem_6);
		
		JMenuItem mntmNewMenuItem_10 = new JMenuItem("3D");
		mntmNewMenuItem_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				entrarmenusalas();
				
				
			}
		});
		mntmNewMenuItem_10.setBackground(SystemColor.textHighlight);
		mntmNewMenuItem_10.setFont(new Font("SansSerif", Font.BOLD, 11));
		mnNewMenu_5.add(mntmNewMenuItem_10);
		
		JMenuItem mntmNewMenuItem_9 = new JMenuItem("4D (proximamente)");
		mntmNewMenuItem_9.setBackground(SystemColor.textHighlight);
		mntmNewMenuItem_9.setFont(new Font("SansSerif", Font.BOLD, 11));
		mnNewMenu_5.add(mntmNewMenuItem_9);
		
		JMenu mnNewMenu_1 = new JMenu("RESERVAS");
		mnNewMenu_1.setBackground(new Color(0, 102, 153));
		mnNewMenu_1.setFont(new Font("SansSerif", Font.BOLD, 11));
		mnNewMenu_1.setBorderPainted(true);
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("TIKETS");
		mntmNewMenuItem_2.setFont(new Font("SansSerif", Font.BOLD, 11));
		mntmNewMenuItem_2.setBackground(new Color(0, 102, 153));
		mnNewMenu_1.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_11 = new JMenuItem("RESERVAR ENTRADA");
		mntmNewMenuItem_11.setBackground(SystemColor.textHighlight);
		mntmNewMenuItem_11.setFont(new Font("SansSerif", Font.BOLD, 11));
		mnNewMenu_1.add(mntmNewMenuItem_11);
		
		JMenu mnNewMenu_2 = new JMenu("CONTACTO");
		mnNewMenu_2.setBackground(SystemColor.textHighlight);
		mnNewMenu_2.setFont(new Font("SansSerif", Font.BOLD, 11));
		mnNewMenu_2.setBorderPainted(true);
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("FACEBOOK");
		mntmNewMenuItem_4.setBackground(new Color(0, 102, 153));
		mntmNewMenuItem_4.setFont(new Font("SansSerif", Font.BOLD, 11));
		mnNewMenu_2.add(mntmNewMenuItem_4);
		
		JMenuItem mntmWatssapp = new JMenuItem("WHATSAPP");
		mntmWatssapp.setBackground(SystemColor.textHighlight);
		mntmWatssapp.setFont(new Font("SansSerif", Font.BOLD, 11));
		mnNewMenu_2.add(mntmWatssapp);
		
		JMenu mnNewMenu_4 = new JMenu("ACERCA DE ");
		mnNewMenu_4.setFont(new Font("SansSerif", Font.BOLD, 11));
		mnNewMenu_4.setBorderPainted(true);
		menuBar.add(mnNewMenu_4);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("@Grupotere");
		mntmNewMenuItem_5.setSelected(true);
		mntmNewMenuItem_5.setBackground(new Color(0, 102, 153));
		mntmNewMenuItem_5.setFont(new Font("SansSerif", Font.BOLD, 11));
		mnNewMenu_4.add(mntmNewMenuItem_5);
		
		JMenu mnNewMenu_3 = new JMenu("OPCIONES");
		mnNewMenu_3.setBackground(new Color(0, 102, 153));
		mnNewMenu_3.setFont(new Font("SansSerif", Font.BOLD, 11));
		mnNewMenu_3.setBorderPainted(true);
		menuBar.add(mnNewMenu_3);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("COLOR DE FONDO");
		mntmNewMenuItem_3.setBackground(new Color(0, 102, 153));
		mntmNewMenuItem_3.setFont(new Font("SansSerif", Font.BOLD, 11));
		mnNewMenu_3.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_7 = new JMenuItem("RESOLUCI\u00D3N DE PANTALLA");
		mntmNewMenuItem_7.setBackground(SystemColor.textHighlight);
		mntmNewMenuItem_7.setFont(new Font("SansSerif", Font.BOLD, 11));
		mnNewMenu_3.add(mntmNewMenuItem_7);
		
		JMenuItem mntmNewMenuItem_8 = new JMenuItem("CERRAR SESI\u00D3N");
		mntmNewMenuItem_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				salirallogim();
			}
		});
		mntmNewMenuItem_8.setBackground(SystemColor.textHighlight);
		mntmNewMenuItem_8.setFont(new Font("SansSerif", Font.BOLD, 11));
		mnNewMenu_3.add(mntmNewMenuItem_8);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("F:\\usuarios\\alumno\\Descargas\\pngwing.com (19).png"));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, -22, 684, 605);
		contentPane.add(lblNewLabel);
	}

	protected void entrarsalacuaro() {
		// TODO Auto-generated method stub
		this.dispose();
		Salacuatro compra = new Salacuatro();
		compra.setVisible(true);
	}

	protected void salirallogim() {
		// TODO Auto-generated method stub
this.dispose();
		
		INICIO voveralogim =new INICIO ();
		 voveralogim .setVisible(true);
	}

	protected void entrarmenusalas() {
		// TODO Auto-generated method stub
this.dispose();
		Cartelera cartelera1=new Cartelera ();
		cartelera1.setVisible(true);
	}

	protected void irmenusalas() {
		// TODO Auto-generated method stub
this.dispose();
		
		Cartelera cartelera1=new Cartelera ();
		cartelera1.setVisible(true);

	}

	protected void Incartelera() {
		// TODO Auto-generated method stub
		this.dispose();
		
		Cartelera cartelera1=new Cartelera ();
		cartelera1.setVisible(true);

		
	}
}
