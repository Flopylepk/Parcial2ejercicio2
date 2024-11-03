package ejercicio2;

public class Comedia extends Genero{
	
	private int generoC;

	public Comedia(String libro1, String auto1, int autor1, String libro2, String auto2, int autor2, String libro3,
			String auto3, int autor3, double precio) {
		super(libro1, auto1, autor1, libro2, auto2, autor2, libro3, auto3, autor3, precio);
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
