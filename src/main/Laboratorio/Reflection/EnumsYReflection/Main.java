/**
 * 
 */
package main.Laboratorio.Reflection.EnumsYReflection;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 13 jul. 2021, 0:13:05
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		level1();
	}
	
	
	static void level1() {
		System.out.println(String.format("%s", EMensaje.ALTA_NIF_NO_VALIDO.getMsg()));
		System.out.println(String.format("%s", EMensaje.ALTA_EMAIL_NO_VALIDO.getMsg()));
		level2();
	}
	
	static void level2() {
		System.out.println(String.format("%s", EMensaje.BANK_EMAIL_DOCUMENTO_DUPLICADO.getMsg()));
		level3();
	}
	
	static void level3() {
		System.out.println(String.format("%s", EMensaje.PT_EXITO.getMsg()));
		System.out.println(String.format("%s", EMensaje.PT_VACIA.getMsg()));
		System.out.println(String.format("%s", EMensaje.USUARIO_ERROR_AUTENTIFICACION.getMsg()));
		System.out.println(String.format("%s", EMensaje.PT_FRACASO.getMsg()));
	}

}
