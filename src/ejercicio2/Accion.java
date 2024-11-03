package ejercicio2;

public class Accion extends Genero{

	private int generoA;



	public Accion(String libro1, String libro2, String libro3) {
		super(libro1, libro2, libro3);
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
