package ejercicio2;

public class Drama extends Genero{
	private int generoD;


	public Drama(String libro1, String libro2, String libro3) {
		super(libro1, libro2, libro3);
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
