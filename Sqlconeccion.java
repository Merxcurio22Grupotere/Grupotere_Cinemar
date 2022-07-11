package Proyectofinal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Sqlconeccion extends Coneccion{
	
	public boolean registrar (usuario usu){
		
		PreparedStatement pst = null;
		Connection con = getConecction(); 
		
		String sql ="INSERT INTO usuarioS_registro (nombre_usuario, contraseña, correo) VALUES (?,?,?)";
		
		try {
			pst = con.prepareStatement(sql);
			pst.setString(1,usu.getNombre_usuario());//pense que los numeros enlazaban las columnas de BDD
			pst.setString(2, usu.getContraseña());//esel mismo procedimiento que en GesUsuario.
			pst.setString(3, usu.getCorreo());
			//NAMAS AQUI LO MANDAMOS A LA BDD.
			pst.execute();
			
			return true;
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			
			
			e.printStackTrace();
			
			return false;
			
		}
		
		
	}

}
