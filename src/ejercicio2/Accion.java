package ejercicio2;

public class Accion extends Genero{

	private int generoA;

	public Accion(String libro1, String auto1, int autor1, String libro2, String auto2, int autor2, String libro3,
			String auto3, int autor3, double precio) {
		super(libro1, auto1, autor1, libro2, auto2, autor2, libro3, auto3, autor3, precio);
		this.generoA = 0;
	}

	public int getGeneroA() {
		return generoA;
	}

	public void setGeneroA(int generoA) {
		this.generoA = generoA;
	}

	@Override
	public String toString() {
		return "Accion [generoA=" + generoA + ", toString()=" + super.toString() + "]";
	}

	@Override
	public void Registrar() {
		// TODO Auto-generated method stub
		super.Registrar();
	}
	
}
