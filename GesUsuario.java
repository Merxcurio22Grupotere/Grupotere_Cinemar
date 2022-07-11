package Proyectofinal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class GesUsuario {
	
	public usuario obtenerNombre_usuario(usuario usu) {
	//nota :creo una clase usuario luego pongo el atributo de la clase usuario constructor en este caso: "Nombre_usuario",
		//luego hago especie de instaciacion de la clase usuario constructo. ahi se conecta con la clase usuario...creo
		
		Coneccion conexion = new Coneccion();
		usuario usuario1 = null;//creo el usuario recien
		Connection cn = null;
		Statement stm = null;
		ResultSet rs = null;
		PreparedStatement pst = null;
		
		//nota : no se si sea necesario instanciar la clase "Coneccion", en otro codigo se instancia dentro del try and cacht
		//funciona de esta menera asi que no me complicare y lo dejare asi.
		//nose si sea necesario importar la libreria de "Statement", lo puse por las dudas porque necesitaba el 
		//PreparedStatement
		
		
		try {
			cn = conexion.getConecction ();
			stm = cn.createStatement();
			
			String sql ="SELECT * FROM cinemar_schema.usuarios_registro where nombre_usuario=? and contraseña=?";
			//atencion con la direccion de DDB
			pst = cn.prepareStatement(sql);
			
			pst.setString(1,usu.getNombre_usuario());//pense que los numeros enlazaban las columnas de BDD
			pst.setString(2,usu.getContraseña());//al parecer no  y aun no me lo explico
			rs = pst.executeQuery();
			
			
			
			
			  while (rs.next())//recorremos las tablas de BDD con este while
			    {
			    usuario1 = new usuario(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4));
			    	}		//curiosamente es necesario poner todo los atributosde usuario aqui	
			}catch(Exception e) {
				System.out.println("error al obteber usuario");
				
			}
		return usuario1;}
	
	

}
