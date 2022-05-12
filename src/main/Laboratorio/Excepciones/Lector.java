/**
 * 
 */
package main.Laboratorio.Excepciones;

import java.util.Scanner;

import main.Laboratorio.Excepciones.Excepcion.LectorException;

/**
 * @author Miguel �. Sastre <sastre113@gmail.com>
 * @version 31 dic. 2021, 20:01:07
 */
public final class Lector {
	
	public static String leerTeclado() {
		Scanner sc = new Scanner(System.in);
		String line = null;
			
		try {
			if(sc.hasNext()) {
				line = sc.nextLine();
			} else {
				throw new LectorException("No se ha introducido ning�n valor");
			}
		} catch (LectorException e){
			e.printStackTrace();
		} finally {
		}
		
		return line;
	}
}
