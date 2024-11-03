package ejercicio2;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Libreria libreria=new Libreria("Federico");
		Gerente gerente=new Gerente("",0,"",libreria);
		Cliente cliente= new Cliente("",0,"","",0,0,0);
		Drama drama=new Drama("","","");
		Accion accion=new Accion("","","");
		Comedia comedia=new Comedia("","","");
		
		String lista="";
		String compra="";
		String [] menu= {"gerente", "cliente", "salir"};
		String [] menuG= {"Registrarse", "Registrar géneros","ver libros","calcular Resultados", "ver Resultados", "ver mi registro", "salir"};
		String [] menuC= {"Registrarse", "Comprar libros","ver compra","ver libros","ver mi registro","ver gerente" ,"salir"};
		
		int opcion=0;
		int opcionG=0;
		int opcionC=0;
		
		do {
			opcion=JOptionPane.showOptionDialog(null, "elija que quiere ser", null, 0, 0, null, menu, menu[0]);
			switch (opcion) {
			case 0:
				//gerente
				do {
					opcionG=JOptionPane.showOptionDialog(null, "elija que hacer", null, 0, 0, null, menuG, menuG[0]);
					switch (opcionG) {
					case 0:
						//registrarse
						if (gerente.getNombre().isEmpty()) {
							gerente.Registrarse();
						}else {
							JOptionPane.showMessageDialog(null, "Usted ya se registro");
						}
						break;
					case 1:
						//Registrar generos
						if (gerente.getNombre().isEmpty()) {
							JOptionPane.showMessageDialog(null, "Usted no se registro");
						}else {
							gerente.Registrarlibros(drama, comedia, accion);
						}
						break;
					case 2:
						//ver libros
						if (gerente.getNombre().isEmpty()) {
							JOptionPane.showMessageDialog(null, "Usted no se registro");
						}else {
							gerente.VerLibros(drama, accion, comedia);
						}
						break;
					case 3:
						//Calcular resultados
						if (gerente.getNombre().isEmpty()) {
							JOptionPane.showMessageDialog(null, "Usted no se registro");
						}else {
							lista=gerente.CalcularResultados(drama, comedia, accion, lista, cliente.getAutor1(), cliente.getAutor2(), cliente.getAutor3(),compra);
						}
						break;
					case 4:
						//ver Resultados
						if (gerente.getNombre().isEmpty()) {
							JOptionPane.showMessageDialog(null, "Usted no se registro");
						}else {
							if (lista.isEmpty()) {
								JOptionPane.showMessageDialog(null, "usted no calculó los resultados");
							}else {
								JOptionPane.showMessageDialog(null, lista);
							}
						}
						break;
					case 5:
						//ver mi registro
						if (gerente.getNombre().isEmpty()) {
							JOptionPane.showMessageDialog(null, "Usted no se registro");
						}else {
							JOptionPane.showMessageDialog(null, gerente);
						}
						break;
					case 6:
						//salir
						JOptionPane.showMessageDialog(null, "nos vemos mas tarde");
						break;
					}
				} while (opcionG!=6);
				break;
			case 1:
				//CLIENTE
				do {
					opcionC=JOptionPane.showOptionDialog(null, "elija que hacer", null, 0, 0, null, menuC, menuC[0]);
					switch (opcionC) {
					case 0:
						//registrarse
						if (cliente.getNombre().isEmpty()) {
							cliente.Registrarse();
						}else {
							JOptionPane.showMessageDialog(null, "Usted ya se registro");
						}
						break;
					case 1:
						//Comprar libros
						if (cliente.getNombre().isEmpty()) {
							JOptionPane.showMessageDialog(null, "Usted no se registro");
						}else {
							compra=cliente.ComprarLibros(drama, accion, comedia, compra);
						}
						break;
					case 2:
						//ver compra
						if (cliente.getNombre().isEmpty()) {
							JOptionPane.showMessageDialog(null, "Usted no se registro");
						}else {
							if (compra.isEmpty()) {
								JOptionPane.showMessageDialog(null, "usted no hizo ninguna compra");
							}else {
								JOptionPane.showMessageDialog(null, compra);
							}
						}
						break;
					case 3:
						//ver libros
						if (cliente.getNombre().isEmpty()) {
							JOptionPane.showMessageDialog(null, "Usted no se registro");
						}else {
							cliente.VerLibros(drama, accion, comedia);
						}
						break;
					case 4:
						//ver mi registro
						if (cliente.getNombre().isEmpty()) {
							JOptionPane.showMessageDialog(null, "Usted no se registro");
						}else {
							JOptionPane.showMessageDialog(null, cliente);
						}
						break;
					case 5:
						//ver gerente
						if (gerente.getNombre().isEmpty()) {
							JOptionPane.showMessageDialog(null, "El gerente no se registro");
						}else {
							JOptionPane.showMessageDialog(null, gerente);
						}
						break;
					case 6:
						//salir
						JOptionPane.showMessageDialog(null, "nos vemos mas tarde");
						break;
					}
				} while (opcionC!=6);
				break;
			case 2:
				//salir
				JOptionPane.showMessageDialog(null, "nos vemos despues");
				break;
			}
		} while (opcion!=2);
	}

}
