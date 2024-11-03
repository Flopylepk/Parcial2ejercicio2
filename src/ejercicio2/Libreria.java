package ejercicio2;

public class Libreria {
	private String nombre;

	public Libreria(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Libreria [nombre=" + nombre + "]";
	}
	
}
