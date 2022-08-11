/**
 * 
 */
package main.Laboratorio.Excepciones;
 
/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 30 dic. 2021, 20:34:12
 */
public class Bebedor {	 
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Vaso vaso = new Vaso();
		boolean exit = false;		
		System.out.println(String.format("Bienvenido a la aplicación Bebedor."));
		while(!exit) {
			System.out.println("Introduzca una opción.");
			Lector.leerTeclado();
		}
	}

}
