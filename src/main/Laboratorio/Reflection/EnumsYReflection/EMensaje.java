/**
 * 
 */
package main.Laboratorio.Reflection.EnumsYReflection;

import main.utils.Messages;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 13 jul. 2021, 0:13:26
 */
public enum EMensaje {

	
	// Genéricas
	PT_EXITO	(0,"info.exito"),
	PT_VACIA	(1,"error.peticion.vacia"),
	PT_FRACASO	(2,"error.peticion.fracaso");
	
	/**
	 * @param id
	 * @param value
	 */
	private EMensaje(int id, String value) {
		this.id = id;
		this.value = value;
	}

	private int id;
	private String value;

	
	private String getValue() {
		return value;
	}

	private int getId() {
		return id;
	}
	
	public String getMsg() {
		StackTraceElement element = new Exception().getStackTrace()[1];
		StringBuilder msg = new StringBuilder(String.format("[%s -> %s] ", element.getFileName(),element.getMethodName()));
		msg.append(Messages.getString(this.getValue()));
		return msg.toString();
	}
}
