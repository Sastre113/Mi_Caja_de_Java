/**
 * 
 */
package main.Laboratorio.Excepciones.Excepcion;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 30 dic. 2021, 20:36:52
 */
public class VasoException extends Exception {
	
	private static final long serialVersionUID = 1L;

	/**
	 * @param string
	 */
	public VasoException(String msg) {
		super(msg);
	}

}
