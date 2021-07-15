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
	 * Constructor
	 * 
	 * @param id
	 * @param value
	 */
	private EMensaje(int id, String value) {
		this.id = id;
		this.value = value;
	}

	/** Identificador del error */
	private int id;
	/** Nombre de variable que almacena su descripción*/
	private String value;

	/**
	 * Método que devuelve el ECodigo que le corresponde al EMensaje dependiendo
	 * de su id
	 * 
	 * @return cadena de texto
	 */
	public String getECodigo() {
		String msg;
		
		if(this.getId() == 0) {
			msg = ECodigo.OK.toString();
		} else if(this.getId() == 1) {
			msg = ECodigo.EV.toString();
		} else {
			msg = ECodigo.KO.toString();
		}
		
		return msg;
	}
	
	/**
	 * Método que devuelve la descripcion
	 * @return cadena de texto
	 */
	public String getDescripcion() {
		return Messages.getString(this.getValue());
	}
	
	/**
	 * Método que construye un mensaje de error completo, donde se indica codigo de error, donde ha fallado
	 * y su descripción
	 * 
	 * @return mensaje construido 
	 */
	public String getMsg() {
		return String.format("{ %s - %s %s }", this.getCodigoError(),this.getDondeFalla(),this.getDescripcion());
	}
	
	/**
	 * Método que construye un mensaje compuesto entre el ECodigo y su id
	 * 
	 * @return mensaje construido con el ECodigo y su id
	 */
	private String getCodigoError() {
		return String.format("%s_%s", this.getECodigo(),this.getId());
	}
	
	/**
	 * Método que construye un mensaje desde donde se ha llamado. Se indicará mediante el archivo .java y
	 * el método donde ha fallado.
	 * El mensaje se construye si corresponde con EV o KO.
	 * 
	 * @return mensaje construido con el nombre del archivo y el método.
	 */
	private String getDondeFalla() {
		if(this.getId() != 0) {
			StackTraceElement element = new Exception().getStackTrace()[2];
			return String.format("[%s -> %s]", element.getFileName(),element.getMethodName()); 
		} else {
			return "";
		}
		
	}
	
	/**
	 * 
	 * @return String 
	 */
	private String getValue() {
		return value;
	}

	/**
	 * 
	 * @return int
	 */
	private int getId() {
		return id;
	}
}
