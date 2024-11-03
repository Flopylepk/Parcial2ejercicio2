package ejercicio2;

import javax.swing.JOptionPane;

public class Usuario {
	private String nombre;
	private int edad;
	private String dni;
	public Usuario(String nombre, int edad, String dni) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
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
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + "]";
	}
	
	public void Registrarse() {
		nombre=validarCaracteres("ingrese su nombre");
		edad=validarNumeros("ingrese su edad");
		dni=validarCaracteres("ingrese su dni");
	}
	
	public static int validarNumeros(String mensaje) {
		boolean flag ;
		String num ="" ;
		do {
			flag =true;
			num = JOptionPane.showInputDialog(mensaje);
			while (num.isEmpty()) {
				num = JOptionPane.showInputDialog(mensaje);
			}
			for (int i = 0; i < num.length(); i++) {
				if (!Character.isDigit(num.charAt(i))) {
					flag = false;
					break;
				}
			}
		} while (!flag);
	
		return Integer.parseInt(num);
	}
	public String validarCaracteres(String mensaeje) {
		String palabra = "";
		while (palabra.equals("")) {
			palabra = JOptionPane.showInputDialog(mensaeje);
		}
		return palabra;
	}
	
}
