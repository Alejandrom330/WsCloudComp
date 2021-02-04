package ejercicioCasa;

public class Habitaciones {

	private TipoHabitacion tipoHabitacion;
	private double m2;
	
	public Habitaciones() {
		super();
	}

	public Habitaciones(TipoHabitacion tipoHabitacion, double m2) {
		this.tipoHabitacion = tipoHabitacion;
		this.m2 = m2;
	}

	public TipoHabitacion getTipoHabitacion() {
		return tipoHabitacion;
	}

	public void setTipoHabitacion(TipoHabitacion tipoHabitacion) {
		this.tipoHabitacion = tipoHabitacion;
	}

	public double getM2() {
		return m2;
	}

	public void setM2(double m2) {
		this.m2 = m2;
	}

	@Override
	public String toString() {
		return tipoHabitacion + ", tiene " + m2 + " m2";
	}
	
}
