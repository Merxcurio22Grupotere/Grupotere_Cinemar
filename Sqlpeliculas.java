package Proyectofinal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Sqlpeliculas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String textopeli = "";
		
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
				 
				 System.out.println( Id_pelicula+" - "
				 +titulo+" -  "
						 
				 +formato+" - "
				 
				 +duracion+" - "
				 
				 +sinopsip);
				 
				 
				 
				 
				
			}
		}
		catch (SQLException e2){
			
			e2.printStackTrace();
			
			
		} finally {
			try {
				if(rs!= null) {
					rs.close();
					
				}
				if (stm!= null) {
					stm.close();
				}
				if (cn!= null) {
					cn.close();
				}
				
			}catch(Exception e2   ) {
				
				e2.printStackTrace();
			}
			
			
		}}}
		

