package Proyectofinal;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Reserva {
	 // constructor 
	  public double cantidadComprada;
	  public double precioporEntrada;
	  public double porcentDescuento;
	  
	  public Reserva ( double cantidad, 
			  double precio, double descuento)
			  {
			        cantidadComprada = cantidad;
			        precioporEntrada = precio;
			        porcentDescuento = descuento;
    			  }

			    public void setCantidadComprada (double cantidad)
			    {
			     cantidadComprada = cantidad;
			    }
			    public double getCantidadComprada()
			    {
			        return cantidadComprada;
			    }
			  public void setprecioporEntrada (double precio)
			  {
			        precioporEntrada = precio;
			     }
			  public double getprecioporEntrada()
			  {
			      return precioporEntrada;
			  }
			  
			// DESCUENTO
			  public void setporcentDescuento (double descuento)
			  {
			   porcentDescuento = descuento;
			  }
			  public double getporcentDescuento()
			  {
			      return porcentDescuento;
			  }
			  
			  // DETALLES DE FACTURA!!
			  
			  // NETO FACTURA

			  public double getNeto()
			  {
			  	double calculoneto;
			  	calculoneto = ((cantidadComprada * precioporEntrada)/1.21);
			  	return calculoneto;
			  }
			  //IVA FACTURA
			  public double getIva()
			  {
			  	double calculoiva;	
			  	calculoiva =   (((cantidadComprada * precioporEntrada)/1.21))*(0.21);
			  	return calculoiva;
			  }
			  // DESCUENTO 

			  public double getporcentdto()
			  {
			  	double porcentdto;	
			  	porcentdto =   (cantidadComprada * precioporEntrada)*((porcentDescuento/100));
			  	return porcentdto;
			  }
			  // SUBTOTAL AGREGADO
			  public double getsubtotal()
			  {
			  	double subtotal;	
			  	subtotal =   ((cantidadComprada * precioporEntrada)/1.21)+(((cantidadComprada * precioporEntrada)/1.21))*(0.21);
			  	return subtotal;
			  }

			   public double getTotalFactura()
			   {
			    
			  // TOTAL FACTURA	 
			   double calculodelmontoTotal;
			   calculodelmontoTotal = (cantidadComprada * precioporEntrada)*(1-(porcentDescuento/100));
			   return calculodelmontoTotal;
			    }   

			   
			   //METODO FACTURACION Y CONEXION A BASE
			   
 public static void main (String args []) {
					Coneccion conexion = new Coneccion();
					Connection cn = null;
					Statement stm = null;
					ResultSet rs = null;
					
					try {
						cn = conexion.conectar();
						stm = cn.createStatement();
						rs = stm.executeQuery("SELECT * FROM cinemar_schema.peliculas");
						
						
						while (rs.next()) {
							 int Id_pelicula = rs.getInt(1); 
							 String titulo =rs.getString(2);
							 String formato = rs.getString(3);
							 String duracion = rs.getString(4);
							 String sinopsip= rs.getString (5);
							 int precio_pelicula = rs.getInt(6);
							 
							 System.out.println( Id_pelicula+" - Titulo: " +titulo+"\n-"
									 
							 		+ " Formato:"+formato+" \n"
							 		
							 		+ "- Duración:"+duracion+"\n"
							 		
							 		+ " - Sinopsis:"+sinopsip+"\n"
							 		
							 		+ " - Precio:"	+precio_pelicula+" - ");
						}
						
					} catch (SQLException e) {
						e.printStackTrace();
						
					} finally {
						try {
							if (rs!= null) {
								rs.close();
							}
							
							if (stm != null) {
								stm.close();
							}
							
							if (cn != null) {
								cn.close();
							}
						} catch (Exception e2) {
							e2.printStackTrace();
						}
					}
					
		// INICIO SIMULACION!!!!		
			  double cantidad=0;
			  int entrada= 0;
			  int entrada1 = 1000;
			  int entrada2 = 500;
			  int descuento =0;
			  int descuento1 = 15;
			  int descuento2 = 0;
			  
			  // OBJETO RESERVA Y SCANNER 
			  Reserva factura = new Reserva (0,0,0);
			  Scanner input = new Scanner (System.in);
		 	  System.out.println("Ingrese peli n° \n1/Lighyear \n2/Minions ");
			  			    		 
			  entrada = input.nextInt();
			  if(entrada==1) {
			  factura.setprecioporEntrada(entrada1);}
			  else {
			  factura.setprecioporEntrada(entrada2);}
			  
			  System.out.println("Ingrese la cantidad de entradas a comprar: ");
			  cantidad = input.nextDouble();
			  factura.setCantidadComprada(cantidad);

			  //descuento
			  
			  System.out.println("Tengo tarjeta descuento % \n1-SI \n2-NO  ");
			   descuento = input.nextInt();
			  if(descuento==1) {
			  factura.setporcentDescuento(descuento1);}
			  else {
			  factura.setporcentDescuento(descuento2);}
			  

			  System.out.printf("\n Cantidad de entradas: %s", 
			  factura.getCantidadComprada());
			     System.out.println();
			    
			   System.out.printf(" El neto de la factura es: $%.2f\n", 
			   factura.getNeto());
			   System.out.printf(" El iva de la factura es: $%.2f\n", 
			   factura.getIva());
			   System.out.printf(" El subtotal es: $%.2f\n", 
			   factura.getsubtotal());
			   System.out.printf(" El descuento de la factura es: $%.2f\n", 
			   factura.getporcentdto());
			    System.out.printf(" El total de la factura es: $%.2f\n", 
			   factura.getTotalFactura());
 }
}	
//FIN