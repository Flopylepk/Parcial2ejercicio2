package ejercicio2;

public class Comedia extends Genero{
	
	private int generoC;

	

	public Comedia(String libro1, String libro2, String libro3) {
		super(libro1, libro2, libro3);
		this.generoC = 0;
	}

	public int getGeneroC() {
		return generoC;
	}

	public void setGeneroC(int generoC) {
		this.generoC = generoC;
	}

	@Override
	public String toString() {
		return "Comedia [generoC=" + generoC + ", toString()=" + super.toString() + "]";
	}

	@Override
	public void Registrar() {
		super.Registrar();
	}
	
}
