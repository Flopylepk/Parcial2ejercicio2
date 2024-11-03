package ejercicio2;

import javax.swing.JOptionPane;

public class Genero {
	private String libro1;
	private String libro2;
	private String libro3;
	private double precio;
	
	public Genero(String libro1, String auto1, int autor1, String libro2, String auto2, int autor2, String libro3,
			String auto3, int autor3, double precio) {
		this.libro1 = libro1;
		this.libro2 = libro2;
		this.libro3 = libro3;
		this.precio = precio;
	}

	public String getLibro1() {
		return libro1;
	}

	public void setLibro1(String libro1) {
		this.libro1 = libro1;
	}


	public String getLibro2() {
		return libro2;
	}

	public void setLibro2(String libro2) {
		this.libro2 = libro2;
	}


	public String getLibro3() {
		return libro3;
	}

	public void setLibro3(String libro3) {
		this.libro3 = libro3;
	}


	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Genero [libro1=" + libro1 +", libro2=" + libro2
				+", libro3=" + libro3 + ", precio=" + precio + "]";
	}
	
	public void Registrar() {
		libro1=validarCaracteres("ingrese el nombre del libro1");
		libro2=validarCaracteres("ingrese el nombre del libro2");
		libro3=validarCaracteres("ingrese el nombre del libro3");
		precio=validarNumeros("ingrese el precio de este genero");
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
