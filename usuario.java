package Proyectofinal;

public class usuario {

	private int idusuarios_registro;
	private String nombre_usuario;
	private String correo;
	private String contrase�a;

	public usuario(int idusuarios_registro, String nombre_usuario, String correo, String contrase�a) {

		this.idusuarios_registro = idusuarios_registro;
		this.nombre_usuario = nombre_usuario;
		this.correo = correo;
		this.contrase�a = contrase�a;
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

	public String getContrase�a() {
		return contrase�a;
	}

	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}

	


}
