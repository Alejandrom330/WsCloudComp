package ejercicioCasa;

import java.util.ArrayList;

public class Casa {

	private Persona propietario;
	private double precio;
	private Direccion direccion;
	private ArrayList<Habitaciones> listaHabitaciones;
	private ArrayList<Persona> listaInquilinos;
	
	public Casa() {
		super();
	}

	public Casa(Persona propietario, double precio, Direccion direccion, ArrayList<Habitaciones> listaHabitaciones,
			ArrayList<Persona> listaInquilinos) {
		this.propietario = propietario;
		this.precio = precio;
		this.direccion = direccion;
		this.listaHabitaciones = listaHabitaciones;
		this.listaInquilinos = listaInquilinos;
	}

	public Persona getPropietario() {
		return propietario;
	}

	public void setPropietario(Persona propietario) {
		this.propietario = propietario;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public ArrayList<Habitaciones> getListaHabitaciones() {
		return listaHabitaciones;
	}

	public void setListaHabitaciones(ArrayList<Habitaciones> listaHabitaciones) {
		this.listaHabitaciones = listaHabitaciones;
	}

	public ArrayList<Persona> getListaInquilinos() {
		return listaInquilinos;
	}

	public void setListaInquilinos(ArrayList<Persona> listaInquilinos) {
		this.listaInquilinos = listaInquilinos;
	}
	
	@Override
	public String toString() {
		return "El propietario de la casa es: " + propietario + ", tiene un precio de " + precio + "€ y se encuentra en: " 
	+ direccion + ".\nLas habitaciones son: " + listaHabitaciones + ", y los inquilinos son: " + listaInquilinos;
	}

	public double calcularM2() {
		
		double suma = 0;
		
		for (int i = 0; i <listaHabitaciones.size(); i++) {
			suma = suma + listaHabitaciones.get(i).getM2();
		}
		
		return suma;
	}

}
