/**
 * 
 */
package main.Laboratorio.Excepciones.Excepcion;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 31 dic. 2021, 20:01:28
 */
public class LectorException extends Exception {

	public LectorException() {
		super("Dato introducido no valido.");
	}
	
	public LectorException(String msg) {
		super(msg);
	}
}
