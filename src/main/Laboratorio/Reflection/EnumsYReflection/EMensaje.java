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
	 
	public String getECodigo() {
		StringBuilder msg = new StringBuilder();
		
		if(this.getId() == 0) {
			msg.append(ECodigo.OK.toString());
		} else if(this.getId() == 1) {
			msg.append(ECodigo.EV.toString());
		} else {
			msg.append(ECodigo.KO.toString());
		}
		
		return msg.append(String.format("_%s", this.getId())).toString();
	}
	
	public String getDescripcion() {
		return Messages.getString(this.getValue());
	}
	
	private String getDondeFalla() {
		StackTraceElement element = new Exception().getStackTrace()[2];
		return String.format("[%s -> %s]", element.getFileName(),element.getMethodName()); 
	}
	
	public String getMsg() {
		StringBuilder msg = new StringBuilder(this.getECodigo());
		msg.append(this.getDondeFalla());
		msg.append(this.getDescripcion());
		return msg.toString();
	}
}
