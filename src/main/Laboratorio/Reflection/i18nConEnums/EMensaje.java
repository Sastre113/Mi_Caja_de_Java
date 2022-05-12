/**
 * 
 */
package main.Laboratorio.Reflection.i18nConEnums;


/**
 * Clase donde se recogen todos los mensajes de información de una aplicación.
 * Los que se almacena en esta clase será el identificador del mensaje y el nombre de la variable
 * en messages.properties. Esto nos permite usar i18n y solo tener que modificar en 1 punto.
 * 
 * Además de el almacen donde estarán las constantes, se construye el mensaje de información para las 
 * peticiones.
 * 
 * El formato establecido es:
 * 		{ ECodigo_id - {[FileName -> MethodName]} Mensaje } 
 *	
 * Ejemplos: A. { OK_0 - Exito }
 *			 B. { EV_1003 - [Main.java -> level2] Documento duplicado. }
 * 
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 13 jul. 2021, 0:13:26
 */

@SuppressWarnings("unused")
public enum EMensaje {

	
	// OK
	PT_EXITO	(0,"info.exito"),
	PT_CORRECTA (1,"info.peticion.correcta"),
	
	// EV
	PT_VACIA	(1000,"error.peticion.vacia"),
	ALTA_EMAIL_NO_VALIDO (1001,"error.alta.emailNoValido"),
	ALTA_NIF_NO_VALIDO (1002,"error.alta.nifNoValido"),
	BANK_EMAIL_DOCUMENTO_DUPLICADO (1003,"error.bank.documentoDuplicado"),
	USUARIO_ERROR_AUTENTIFICACION (1004,"error.usuario.autenticacioErronea"),
	
	// KO
	PT_FRACASO	(2000,"error.peticion.fracaso");
	
	

	/** Identificador del error */
	private int id;
	/** Nombre de variable que almacena su descripción*/
	private String contenedor;
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
		this.contenedor = value;
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
	 * Método que construye un mensaje de error completo, donde se indica codigo de error, donde ha fallado
	 * y su descripción
	 * 
	 * @return mensaje construido 
	 */
	public String getMsg() {
		String msg;
		String dondeFalla = getDondeFalla();
		
		if(!dondeFalla.isEmpty()) {
			msg = String.format("{ %s - %s %s }", this.getCodigoError(),dondeFalla,this.getDescripcion());
		} else {
			msg = String.format("{ %s - %s }", this.getCodigoError(),this.getDescripcion());
		}
		
		return msg;
	}
	
	/**
	 * Método que devuelve el mensaje almacenado en las variables de messages.properties.
	 * 
	 * @return mensaje
	 */
	private String getDescripcion() {
		return Messages.getString(this.getContenedor());
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
	 * El mensaje se construye si corresponde con EV.
	 * 
	 * @return mensaje construido con el nombre del archivo y el método.
	 */
	private String getDondeFalla() {
		String msgDondeFalla = "";
		
		if(this.getCodigo()  == ECodigo.EV) {
			StackTraceElement element = new Exception().getStackTrace()[2];
			msgDondeFalla =  String.format("[%s -> %s]", element.getFileName(),element.getMethodName()); 
		}
		
		return msgDondeFalla;
	}
	
	/**
	 * Getter id
	 * 
	 * @return valor entero que indica el identificador del EMensaje
	 */
	private int getId() {
		return id;
	}
	
	/**
	 * Getter codigo
	 * 
	 * @return ECodigo que corresponde a la instancia de EMensaje
	 */
	private ECodigo getCodigo() {
		return codigo;
	}

	/**
	 * @return nombre de la variable en messages.properties
	 */
	private String getContenedor() {
		return contenedor;
	}	
}
