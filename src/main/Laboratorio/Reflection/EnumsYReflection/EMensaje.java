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
	PT_VACIA	(1000,"error.peticion.vacia"),
	ALTA_EMAIL_NO_VALIDO (1001,"error.alta.emailNoValido"),
	ALTA_NIF_NO_VALIDO (1002,"error.alta.nifNoValido"),
	BANK_EMAIL_DOCUMENTO_DUPLICADO (1003,"error.bank.documentoDuplicado"),
	USUARIO_ERROR_AUTENTIFICACION (1004,"error.usuario.autenticacioErronea"),
	PT_FRACASO	(2000,"error.peticion.fracaso");
	
	

	/** Identificador del error */
	private int id;
	/** Nombre de variable que almacena su descripción*/
	private String value;
	/** ECodigo correspondiente al id*/
	private ECodigo codigo;
	
	/** OK: 0 - 999*/
	private final int ID_OK_MAX = 1000;
	/** EV: 1000 - 1999*/
	private final int ID_EV_MAX = 2000;
	/** KO: 2000 - 2999*/
	private final int ID_KO_MAX = 3000;
	
	
	/**
	 * Constructor
	 * 
	 * @param id
	 * @param value
	 */
	private EMensaje(int id, String value) {
		this.id = id;
		this.value = value;
		this.codigo = this.getECodigo(id);
	}

	/**
	 * Método que devuelve el ECodigo que le corresponde al EMensaje dependiendo
	 * de su id
	 * 
	 * @return ECodigo 
	 */
	private ECodigo getECodigo(int id) {
		ECodigo eCodigo;
		
		if(id < ID_OK_MAX) {
			eCodigo = ECodigo.OK;
		} else if (id < ID_EV_MAX) {
			eCodigo = ECodigo.EV;
		} else {
			eCodigo = ECodigo.KO;
		}
		
		return eCodigo;
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
		return String.format("%s_%s", this.getCodigo() ,this.getId());
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
	 * @return int
	 */
	private int getId() {
		return id;
	}
	
	/**
	 * @return the eCodigo
	 */
	private ECodigo getCodigo() {
		return codigo;
	}
	
	/**
	 * 
	 * @return String 
	 */
	private String getValue() {
		return value;
	}
}
