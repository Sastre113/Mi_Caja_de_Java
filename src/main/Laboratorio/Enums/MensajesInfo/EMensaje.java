/**
 * 
 */
package main.Laboratorio.Enums.MensajesInfo;

import java.util.Arrays;
import java.util.LinkedList;

import main.utils.Messages;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 27 jun. 2021, 19:58:18
 */
public enum EMensaje {

	// Genéricas
	PT_EXITO	("OK","000","info.exito"),
	PT_VACIA	("EV","001","error.peticion.vacia"),
	PT_FRACASO	("KO","002","error.peticion.fracaso"),
	
	// ALTA
	ALTA_NIF_NO_VALIDO		("EV","101","error.alta.nifNoValido"),
	ALTA_EMAIL_NO_VALIDO	("EV","102","error.alta.emailNoValido"),
	
	// BANK
	BANK_DOCUMENTO_DUPLICADO	("EV","201","error.bank.documentoDuplicado"),
	
	// USUARIO
	/*
	 * Este código se sale del orden establecido, pero aun así, se dará como un código genérico.
	 */
	USUARIO_ERROR_AUTENTICACION ("KO","1000","error.usuario.autenticacioErronea"); 
	
	private String codigo;
	private String id;
	private String key;
	
	/*
	 * LinkedList vs HashMap/HashSet, lo bueno de la linkedlist es que no necesito añadir un índice pero debo tener
	 * en cuenta como los agrego, a diferencía de un hashMap donde debería indicar el índice o clave.
	 */
	private final LinkedList<String> listaServicios = new LinkedList<String>(Arrays.asList(
			"GEN", 		// 0 
			"ALTA", 	// 1
			"BANK",		// 2
			"USUARIO"	// 3
			));
	

	/**
	 * @param i
	 * @param string
	 */
	EMensaje(String codigo,String id, String value) {
		this.codigo = codigo;
		this.id = id;
		this.key = value;
	}

		
	public String getMsg() {
		return  String.format("%s : %s", this.getCodigoError(),this.getDescripcionError());
	}
	
	
	/*
	 * Método auxiliares internos 
	 */
	

	private String getCodigoError() {
		return String.format("%s_%s_%s", this.getCodigo(),this.getServiceName(this), this.getId());
	}
	
	private String getDescripcionError() {
		return Messages.getString(this.getKey());
	}
	
	private String getServiceName(EMensaje mensaje) {
		String serviceName = this.getListaservicios().get(0);
		int idService = Integer.parseInt(mensaje.getId()) /100;
		
		if(idService < listaServicios.size()) {
			serviceName = this.getListaservicios().get(idService);
		}
		
		return serviceName;
	}


	/**
	 * @return the codigo
	 */
	private String getCodigo() {
		return codigo;
	}


	/**
	 * @return the id
	 */
	private String getId() {
		return id;
	}


	/**
	 * @return the key
	 */
	private String getKey() {
		return key;
	}


	/**
	 * @return the listaservicios
	 */
	private LinkedList<String> getListaservicios() {
		return listaServicios;
	}
}
