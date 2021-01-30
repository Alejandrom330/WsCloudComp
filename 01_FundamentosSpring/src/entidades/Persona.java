package entidades;

/*
	muy importante, spring es un contenedor de pojos, por lo tanto tienen que tener esa estructura.
	Ademas tiene que seguir el convenio de javabean
*/
public class Persona {
	private String nombre;
	private int edad;
	private double peso;
	private Direccion direcion;
	
	public Persona() {
		super();
	}
	public Direccion getDirecion() {
		return direcion;
	}
	public void setDirecion(Direccion direcion) {
		this.direcion = direcion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + ", direcion=" + direcion + "]";
	}
	
	
	
}
