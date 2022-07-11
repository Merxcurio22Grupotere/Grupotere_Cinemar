package Proyectofinal;

public class usuario {

	private int idusuarios_registro;
	private String nombre_usuario;
	private String correo;
	private String contraseña;

	public usuario(int idusuarios_registro, String nombre_usuario, String correo, String contraseña) {

		this.idusuarios_registro = idusuarios_registro;
		this.nombre_usuario = nombre_usuario;
		this.correo = correo;
		this.contraseña = contraseña;
	}

	public usuario() {
		// TODO Auto-generated constructor stub// el GesUsuario me hiso crear esta clase vacia

	}

	public int getIdusuarios_registro() {
		return idusuarios_registro;
	}

	public void setIdusuarios_registro(int idusuarios_registro) {
		this.idusuarios_registro = idusuarios_registro;
	}

	public String getNombre_usuario() {
		return nombre_usuario;
	}

	public void setNombre_usuario(String nombre_usuario) {
		this.nombre_usuario = nombre_usuario;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	


}
