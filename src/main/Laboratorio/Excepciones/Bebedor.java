/**
 * 
 */
package main.Laboratorio.Excepciones;
 
/**
 * @author Miguel �. Sastre <sastre113@gmail.com>
 * @version 30 dic. 2021, 20:34:12
 */
public class Bebedor {	 
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Vaso vaso = new Vaso();
		boolean exit = false;		
		System.out.println(String.format("Bienvenido a la aplicaci�n Bebedor."));
		while(!exit) {
			System.out.println("Introduzca una opci�n.");
			Lector.leerTeclado();
		}
	}

}
