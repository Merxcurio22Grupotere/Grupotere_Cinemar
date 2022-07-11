package Proyectofinal;

import java.awt.Component;
import java.awt.Panel;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Salacine extends JFrame {
	
	
	

	private int fila;
	private int columna;
	private String[][]sala;
	private int tiket;
	private int ingreso;




	public static String[][] texto;
	
	public Salacine(int fila, int columna) {
		
	
		this.fila = fila;
		this.columna = columna;
		this.sala = new String [fila + 1][columna + 1];
		this.tiket = 0;
	}
	
	public int getFila() {
		return fila;
	}

	public void setFila(int fila) {
		this.fila = fila;
	}

	public int getColumna() {
		return columna;
	}

	public void setColumna(int columna) {
		this.columna = columna;
	}

	public String[][] getSala() {
		return sala;
	}

	public void setSala(String[][] sala) {
		this.sala = sala;
	}

	public int getTiket() {
		return tiket;
	}

	public void setTiket(int tiket) {
		this.tiket = tiket;
	}

	public int getIngreso() {
		return ingreso;
	}

	public void setIngreso(int ingreso) {
		this.ingreso = ingreso;
	}

	public static String[][] getTexto() {
		return texto;
	}

	public static void setTexto(String[][] texto) {
		Salacine.texto = texto;
	}

	public void llenarSalaPorDefecto() {
		
		
		for (int  i = 0; i < sala.length; i++ ) {
			
		for	(int  j = 0; j < sala[0].length; j++ )	{
			
		
				if (i == 0 && j == 0) sala[i][j] = ""; 
				
				else if (i == 0)sala[i][j] = String.valueOf(j);
			    else if (j == 0)sala[i][j] = String.valueOf(i);
				
			    else sala[i][j] =" BL";
				
		}
		}}
	
	
	
	public void imprimirSala() {
		// TODO Auto-generated method stub 
	
	System.out.println("\nBUTACAS: BL(libres)\n "
			+
			           "BO (reservadas):\n");
	
	for (String[] asientos : sala ) {
		for (int j = 0; j < sala[0].length; j++) 
		{
		
			
			
			System.out.print(asientos[j] + "");
		} 
		
		
		
	System.out.println("\n");

	}}
	
  


public boolean verificarAsiento(int comprarfila,int comprarcolumna) {
	
	boolean verificar = comprarfila > fila ||
			            comprarcolumna > columna ||
			            comprarfila == 0 || comprarcolumna == 0;  
			
			if (verificar) {
				
				System.out.print("entrada incorrecta");
				
				JOptionPane.showMessageDialog(getContentPane(), "Entrada incorrecta");
				
			return false;
			
			} else if (sala[comprarfila][comprarcolumna].equals(" O")){
				
				System.out.print("este asiento esta ocupado"); 
				JOptionPane.showMessageDialog(getContentPane(), "Este asiento ha sido ocupado \n" +"por fqvor, vuelve a intentarlo" );
				
			return false;	
			} return true;
			
}



public void comprarBoleto (int comprarfila,int comprarcolumna) {
	int precio=500;
	tiket += 1;
	ingreso += precio;
	sala [comprarfila][comprarcolumna]= " O";
	System.out.println("precio del boleto" +precio);
	JOptionPane.showConfirmDialog(getContentPane(), "El Precio del boleto es;" +precio);
}

	


	

}
	

	
