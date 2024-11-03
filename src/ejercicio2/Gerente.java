package ejercicio2;

import javax.swing.JOptionPane;

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
	
	public void Registrarlibros(Drama drama, Comedia comedia, Accion accion) {
		String []genero= {"Drama", "Comedia", "Accion"};
		int opcion=JOptionPane.showOptionDialog(null, "elija que genero quiere registrar", null, 0, 0, null, genero, genero[0]);
		switch (opcion) {
		case 0:
			if (drama.getLibro1().isEmpty()) {
				drama.Registrar();
			}else {
				JOptionPane.showMessageDialog(null, "usted ya regostro drama");
			}
			break;
		case 1:
			if (comedia.getLibro1().isEmpty()) {
				comedia.Registrar();
			}else {
				JOptionPane.showMessageDialog(null, "usted ya regostro comedia");
			}
			break;
		case 2:
			if (accion.getLibro1().isEmpty()) {
				accion.Registrar();
			}else {
				JOptionPane.showMessageDialog(null, "usted ya regostro accion");
			}
			break;
		}
	}
	
	public String CalcularResultados(Drama drama, Comedia comedia, Accion accion, String lista, int autor1, int autor2, int autor3, String compra) {
		
		if (compra.isEmpty()) {
			JOptionPane.showMessageDialog(null, "el cliente no compro nada");
		}else {
			if (drama.getGeneroD()>comedia.getGeneroC()&&comedia.getGeneroC()>accion.getGeneroA()) {
				JOptionPane.showMessageDialog(null, "el genero mas elejido es el drama");
				lista=lista+"el genero mas elejido es el drama \n";
			}else if (comedia.getGeneroC()>drama.getGeneroD()&&comedia.getGeneroC()>accion.getGeneroA()) {
				JOptionPane.showMessageDialog(null, "el genro mas elegido es la comedia");
				lista=lista+"el genro mas elegido es la comedia \n";
			}else if (accion.getGeneroA()>comedia.getGeneroC()&& accion.getGeneroA()>drama.getGeneroD()) {
				JOptionPane.showMessageDialog(null, "el genro mas elegido es la accion");
				lista=lista+ "el genro mas elegido es la accion \n";
			}else {
				JOptionPane.showMessageDialog(null, "algunos empataron en resultado");
			}
			
			if (autor1>autor2&&autor1>autor3) {
				JOptionPane.showMessageDialog(null, "Germán fue el autor mas vendido");
				lista=lista+"Germán fue el autor mas vendido";
			} else if (autor2>autor1&&autor2>autor3) {
				JOptionPane.showMessageDialog(null, "Paula fue el autor mas vendido");
				lista=lista+"Paula fue el autor mas vendido";
			}else if (autor3>autor1&&autor3>autor2) {
				JOptionPane.showMessageDialog(null, "Agustin fue el autor mas vendido");
				lista=lista+"Agustin fue el autor mas vendido";
			}else {
				JOptionPane.showMessageDialog(null, "algunos autores empataron");
			}
		}
		
		
		return lista;
	}
	
}
