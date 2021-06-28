/**
 * 
 */
package main.whiteboard.pruebasConEnums;


/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 27 jun. 2021, 19:57:27
 */
public class Main {
	
	public static void main(String[] args) {

		System.out.println(EMensaje.PT_EXITO.getMsg());
		System.out.println(EMensaje.PT_FRACASO.getMsg());
		System.out.println(EMensaje.PT_VACIA.getMsg());
		System.out.println(EMensaje.ALTA_NIF_NO_VALIDO.getMsg());
		System.out.println(EMensaje.BANK_DOCUMENTO_DUPLICADO.getMsg());
		System.out.println(EMensaje.USUARIO_ERROR_AUTENTICACION.getMsg());
	}
}
