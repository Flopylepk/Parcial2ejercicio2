package ejercicio2;

public class Gerente extends Usuario{
	private Libreria libreria;

	public Gerente(String nombre, int edad, String dni, Libreria libreria) {
		super(nombre, edad, dni);
		this.libreria = libreria;
	}

	public Libreria getLibreria() {
		return libreria;
	}

	public void setLibreria(Libreria libreria) {
		this.libreria = libreria;
	}

	@Override
	public String toString() {
		return "Gerente [libreria=" + libreria + ", toString()=" + super.toString() + "]";
	}

	@Override
	public void Registrarse() {
		super.Registrarse();
	}
	
}
