/**
 * 
 */
package main.Laboratorio.Reflection.EnumsYReflection;

/**
 * Clase que almacena códigos simple de respuesta para las peticiones.
 * 
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 14 jul. 2021, 21:42:39
 */
public enum ECodigo {
	
	OK("OK"),
	EV("Error en validación"),
	KO("Error en ejecución");
	
	private String value;

	/**
	 * @param value
	 */
	private ECodigo(String value) {
		this.value = value;
	}

	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}
}
