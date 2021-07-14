/**
 * 
 */
package main.Laboratorio.Reflection.EnumsYReflection;

/**
 * @author Miguel �. Sastre <sastre113@gmail.com>
 * @version 14 jul. 2021, 21:42:39
 */
public enum ECodigo {
	
	OK("Todo Ok."),
	EV("Fallo en validaci�n"),
	KO("KO");
	
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
