package demo.modelo.entidad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Pelicula {
	
	private String titulo;
	private int anioSalida;
	@Autowired
	private Director director;
	
	public Pelicula(String titulo, int anioSalida, Director director) {
		this.titulo = titulo;
		this.anioSalida = anioSalida;
		this.director = director;
	}

	public Pelicula() {}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAnioSalida() {
		return anioSalida;
	}

	public void setAnioSalida(int anioSalida) {
		this.anioSalida = anioSalida;
	}

	public Director getDirector() {
		return director;
	}

	public void setDirector(Director director) {
		this.director = director;
	}

	@Override
	public String toString() {
		return "Pelicula [titulo=" + titulo + ", anioSalida=" + anioSalida + ", director=" + director + "]";
	}
}