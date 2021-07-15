/**
 * 
 */
package main.Laboratorio.Reflection.EnumsYReflection;

import main.utils.Messages;

/**
 * @author Miguel �. Sastre <sastre113@gmail.com>
 * @version 13 jul. 2021, 0:13:26
 */
public enum EMensaje {

	
	// Gen�ricas
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
	/** Nombre de variable que almacena su descripci�n*/
	private String value;

	/**
	 * M�todo que devuelve el ECodigo que le corresponde al EMensaje dependiendo
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
	 * M�todo que devuelve la descripcion
	 * @return cadena de texto
	 */
	public String getDescripcion() {
		return Messages.getString(this.getValue());
	}
	
	/**
	 * M�todo que construye un mensaje de error completo, donde se indica codigo de error, donde ha fallado
	 * y su descripci�n
	 * 
	 * @return mensaje construido 
	 */
	public String getMsg() {
		return String.format("{ %s - %s %s }", this.getCodigoError(),this.getDondeFalla(),this.getDescripcion());
	}
	
	/**
	 * M�todo que construye un mensaje compuesto entre el ECodigo y su id
	 * 
	 * @return mensaje construido con el ECodigo y su id
	 */
	private String getCodigoError() {
		return String.format("%s_%s", this.getECodigo(),this.getId());
	}
	
	/**
	 * M�todo que construye un mensaje desde donde se ha llamado. Se indicar� mediante el archivo .java y
	 * el m�todo donde ha fallado.
	 * El mensaje se construye si corresponde con EV o KO.
	 * 
	 * @return mensaje construido con el nombre del archivo y el m�todo.
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
