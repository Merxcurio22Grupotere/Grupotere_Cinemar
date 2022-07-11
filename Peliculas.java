package Proyectofinal;

public class Peliculas {
	private int  Id_pelicula;
	private String titulo;
	private String formato;
	private String duracion;
	private String sinopsip;
	public Peliculas(int id_pelicula, String titulo, String formato, String duracion, String sinopsip) {

		Id_pelicula = id_pelicula;
		this.titulo = titulo;
		this.formato = formato;
		this.duracion = duracion;
		this.sinopsip = sinopsip;
	}
	public Peliculas() {
		// TODO Auto-generated constructor stub
	}
	public int getId_pelicula() {
		return Id_pelicula;
	}
	public void setId_pelicula(int id_pelicula) {
		Id_pelicula = id_pelicula;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getFormato() {
		return formato;
	}
	public void setFormato(String formato) {
		this.formato = formato;
	}
	public String getDuracion() {
		return duracion;
	}
	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}
	public String getSinopsip() {
		return sinopsip;
	}
	public void setSinopsip(String sinopsip) {
		this.sinopsip = sinopsip;
	}
	
	

}
