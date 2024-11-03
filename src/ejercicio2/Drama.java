package ejercicio2;

public class Drama extends Genero{
	private int generoD;

	public Drama(String libro1, String auto1, int autor1, String libro2, String auto2, int autor2, String libro3,
			String auto3, int autor3, double precio) {
		super(libro1, auto1, autor1, libro2, auto2, autor2, libro3, auto3, autor3, precio);
		this.generoD = 0;
		
		
	}

	public int getGeneroD() {
		return generoD;
	}

	public void setGeneroD(int generoD) {
		this.generoD = generoD;
	}

	@Override
	public String toString() {
		return "Drama [generoD=" + generoD + ", toString()=" + super.toString() + "]";
	}

	@Override
	public void Registrar() {
		super.Registrar();
	}
	
	
}
