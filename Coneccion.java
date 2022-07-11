package Proyectofinal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Coneccion {
	private static final String CONTROLADOR = "com.mysql.cj.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/cinemar_schema";//guarda con la direccion de la BDD.
	private static final String USUARIO = "root";
	private static final String CONTRASEÑA = "c245602014";
	
	
	static {//ENCERRARLO EN UN STATIC PARA INSTANCIALO EN OTRA CLASE
		
		
		try {Class.forName(CONTROLADOR);
		
	}
		catch (ClassNotFoundException e) {
	System.out.println("error al cagar");
	e.printStackTrace();
	}
		}
	
	
	public Connection  conectar() {	
		
		Connection conexion =null;
		try {
		
		
		System.out.println("Conectando a la bdd...");
		conexion = DriverManager.getConnection(URL,USUARIO,CONTRASEÑA);
		System.out.println("conexion ok");
		
		
	
		}catch (SQLException e) {
	System.out.println("error de conexion");
	e.printStackTrace();
}
		
		return conexion;
		
	//hasta aqui esta el ccodigo fuente de la coneccion a la BD...luego continua el codigo de coneccion 
		//a la clase GesUsuario
	//Se requirio crear una clase public para getConecction ...era el procedimiento para cargar las tablas.
		//existen otros metodo pero este me fu mas efectivo/
		//al final peque el try and cacht de arriba y conecto. luego me pidio un retur el get conection y funciono//
	
	}


	public Connection getConecction() {
		
		
		
		// TODO Auto-generated method stub
	    Connection conexion =null;
		try {
		
		
	    System.out.println("Conectando a la bdd...");
		conexion = DriverManager.getConnection(URL,USUARIO,CONTRASEÑA);
		System.out.println("conexion ok");
		
		
	
		}catch (SQLException e) {
	System.out.println("error de conexion");
	e.printStackTrace();
		
		
	
	}
		return conexion;
	}}


