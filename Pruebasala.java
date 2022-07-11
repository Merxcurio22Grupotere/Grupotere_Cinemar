package Proyectofinal;

import java.util.Scanner;

public class Pruebasala {
	final static Scanner teclado = new Scanner (System.in);
	static Salacine sala;
	
	
	
	
	private static void comprarBoleto () {
		boolean flag;
		int comprarfila;
		int comprarcolumna;
		do {
			
			System.out.println("\ningresa numero de fila\n");
			comprarfila= teclado.nextInt();
			
			System.out.println("\ningresa numero de columna\n");
			comprarcolumna= teclado.nextInt();
			
			flag = sala.verificarAsiento(comprarfila, comprarcolumna);
			
		}while(!flag);
		
		
		 sala.comprarBoleto(comprarfila, comprarcolumna);
	
		
	}
	
	
	
	
	
	
	
	
	//menu por consola

	public static void main(String args[]) {
		
	
		
		
		String menu = "\n1. ver asientos\n"+
			              "2.Comprar boletos\n"+
					     "3.Estadisticas\n"+
			              "4.Salir";
		


	    sala = new Salacine(5,7);
		sala.llenarSalaPorDefecto();
		sala.imprimirSala();
		
		int opcion;
		
			
			do {
				System.out.println(menu);
				opcion = teclado.nextInt();
				
			switch (opcion){
				case 1: 
				sala.imprimirSala();
				break;
				case 2: 
					
					comprarBoleto();
				break;
				case 3: break;
		
				default:
				System.out.println("opcion no valida");
				break;
			}
				
			}while (opcion != 4 );
		

		
	}
	}
		
	

		
		
		
		
		
		
		
		
		
		
		
		
				
	


