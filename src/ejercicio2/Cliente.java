package ejercicio2;

import javax.swing.JOptionPane;

public class Cliente extends Usuario{
	private String targeta;
	private int autor1;
	private int autor2;
	private int autor3;

	

	public Cliente(String nombre, int edad, String dni, String targeta, int autor1, int autor2, int autor3) {
		super(nombre, edad, dni);
		this.targeta = targeta;
		this.autor1 = autor1;
		this.autor2 = autor2;
		this.autor3 = autor3;
	}

	public String getTargeta() {
		return targeta;
	}

	public void setTargeta(String targeta) {
		this.targeta = targeta;
	}

	
	public int getAutor1() {
		return autor1;
	}

	public void setAutor1(int autor1) {
		this.autor1 = autor1;
	}

	public int getAutor2() {
		return autor2;
	}

	public void setAutor2(int autor2) {
		this.autor2 = autor2;
	}

	public int getAutor3() {
		return autor3;
	}

	public void setAutor3(int autor3) {
		this.autor3 = autor3;
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
	
	public String ComprarLibros(Drama drama, Accion accion, Comedia comedia, String lista) {
		
		String [] generos={"drama", "accion", "comedia"};
		int genero=JOptionPane.showOptionDialog(null, "¿De qué genero quiete comprar?", null, 0, 0, null, generos, generos[0]);
		switch (genero) {
		case 0:
			//drama
			if (drama.getLibro1().isEmpty()) {
				JOptionPane.showMessageDialog(null, "no puede elegir este genero porque no fue registrado");
			}else {
				drama.setGeneroD(drama.getGeneroD()+1);
				String []librosD= {drama.getLibro1(), drama.getLibro2(), drama.getLibro3()};
				int opcionD=JOptionPane.showOptionDialog(null, "elija que libro quiere", null, 0, 0, null, librosD, librosD[0]);
				switch (opcionD) {
				case 0:
						autor1=autor1+1;
						JOptionPane.showMessageDialog(null, "Felicidades, espero que lo disfrute, vuelva a atras y puede compar mas si quiere");
						lista=lista+drama.getLibro1()+"autor: German \n";
					break;
				case 1:
						autor2=autor2+1;
						JOptionPane.showMessageDialog(null, "Felicidades, espero que lo disfrute, vuelva a atras y puede compar mas si quiere");
						lista=lista+drama.getLibro2()+"autor: Paula \n";
					break;
				case 2:
						autor3=autor3+1;
						JOptionPane.showMessageDialog(null, "Felicidades, espero que lo disfrute, vuelva a atras y puede compar mas si quiere");
						lista=lista+drama.getLibro3()+"autor: Agustin \n";
					break;
				}
			}
			
			break;
		case 1:
			//accion
			if (accion.getLibro1().isEmpty()) {
				JOptionPane.showMessageDialog(null, "no puede elegir este genero porque no fue registrado");
			}else {
				accion.setGeneroA(accion.getGeneroA()+1);
				String []librosA= {accion.getLibro1(), accion.getLibro2(), accion.getLibro3()};
				int opcionA=JOptionPane.showOptionDialog(null, "elija que libro quiere", null, 0, 0, null, librosA, librosA[0]);
				switch (opcionA) {
				case 0:
						autor1=autor1+1;
						JOptionPane.showMessageDialog(null, "Felicidades, espero que lo disfrute, vuelva a atras y puede compar mas si quiere");
						lista=lista+accion.getLibro1()+"autor: German \n";
					break;
				case 1:
						autor2=autor2+1;
						JOptionPane.showMessageDialog(null, "Felicidades, espero que lo disfrute, vuelva a atras y puede compar mas si quiere");
						lista=lista+accion.getLibro2()+"autor: Paula \n";
					break;
				case 2:
						autor3=autor3+1;
						JOptionPane.showMessageDialog(null, "Felicidades, espero que lo disfrute, vuelva a atras y puede compar mas si quiere");
						lista=lista+accion.getLibro3()+"autor: Agustin \n";
					break;
				}
			}
			break;
		case 2:
			//comedia
			if (comedia.getLibro1().isEmpty()) {
				JOptionPane.showMessageDialog(null, "no puede elegir este genero porque no fue registrado");
			}else {
				comedia.setGeneroC(comedia.getGeneroC()+1);
				String []librosC= {comedia.getLibro1(), comedia.getLibro2(), comedia.getLibro3()};
				int opcionA=JOptionPane.showOptionDialog(null, "elija que libro quiere", null, 0, 0, null, librosC, librosC[0]);
				switch (opcionA) {
				case 0:
						autor1=autor1+1;
						JOptionPane.showMessageDialog(null, "Felicidades, espero que lo disfrute, vuelva a atras y puede compar mas si quiere");
						lista=lista+comedia.getLibro1()+"autor: German \n";
					break;
				case 1:
						autor2=autor2+1;
						JOptionPane.showMessageDialog(null, "Felicidades, espero que lo disfrute, vuelva a atras y puede compar mas si quiere");
						lista=lista+comedia.getLibro2()+"autor: Paula \n";
					break;
				case 2:
						autor3=autor3+1;
						JOptionPane.showMessageDialog(null, "Felicidades, espero que lo disfrute, vuelva a atras y puede compar mas si quiere");
						lista=lista+comedia.getLibro3()+"autor: Agustin \n";
					break;
				}
			}
			break;

	
		}
		return lista;
	}
	
	
}
