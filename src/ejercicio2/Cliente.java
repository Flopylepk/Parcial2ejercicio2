package ejercicio2;

public class Cliente extends Usuario{
	private String targeta;

	public Cliente(String nombre, int edad, String dni, String targeta) {
		super(nombre, edad, dni);
		this.targeta = targeta;
	}

	public String getTargeta() {
		return targeta;
	}

	public void setTargeta(String targeta) {
		this.targeta = targeta;
	}

	@Override
	public String toString() {
		return "Cliente [targeta=" + targeta + ", toString()=" + super.toString() + "]";
	}

	@Override
	public void Registrarse() {
		super.Registrarse();
		targeta=validarCaracteres("ingrese su nomero de targeta");
	}
	
}
