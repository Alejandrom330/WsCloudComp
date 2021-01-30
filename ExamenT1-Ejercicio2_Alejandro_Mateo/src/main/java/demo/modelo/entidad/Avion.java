package demo.modelo.entidad;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Avion {
	
	private int id;
	private String marca;
	@Autowired
	private Motor [] motores;
	private int kilometros;
	
	public Avion(int id, String marca, Motor[] motores, int kilometros) {
		this.id = id;
		this.marca = marca;
		this.motores = motores;
		this.kilometros = kilometros;
	}

	public Avion() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Motor[] getMotores() {
		return motores;
	}

	public void setMotores(Motor[] motores) {
		this.motores = motores;
	}

	public int getKilometros() {
		return kilometros;
	}

	public void setKilometros(int kilometros) {
		this.kilometros = kilometros;
	}

	@Override
	public String toString() {
		return "Avion [id=" + id + ", marca=" + marca + ", motores=" + Arrays.toString(motores) + ", kilometros="
				+ kilometros + "]";
	}
}