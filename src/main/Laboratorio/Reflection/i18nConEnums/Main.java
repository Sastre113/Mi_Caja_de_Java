/**
 * 
 */
package main.Laboratorio.Reflection.i18nConEnums;

import java.util.ArrayList;
import java.util.List;

/**
 * Esta demo tratá de probar el uso de Enums, Reflection, properties.file y
 * ResourceBundle para la internacionalización de una aplicación y tener todos
 * los errores recogidos en un mismo archivo.
 * 
 * El objetivo es facilizar el mantenimiento y recoger todos los errores
 * en un mismo lugar, además, de aplicar i18n sobre los mensajes que mostramos.
 * 
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 13 jul. 2021, 0:13:05
 */
public class Main {

	
	static List<String> listaErrores = new ArrayList<>();
	
	
	/**
	 * Método main que solo realizará 2 llamadas.
	 * 
	 * 	1. Simulará la validación de unos datos hipoteticos pero 
	 * 		que contendrá errores y serán almacenados en <listaErrores>.
	 * 	2. Se mostrará todos los errores encontrados por pantalla.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Se ejecuta el programa normalmente
		level1();
		
		// Se valida si ha ocurrido algún error
		imprimirErrores();
	}
	
	/**
	 * Método que simula la validación de la aplicación.
	 * Se imprimirán todos los errores localizados en la aplicacion.
	 * 
	 */
	private static void imprimirErrores() {
		listaErrores.forEach(error -> System.out.println(error));
	}

	/*
	 * Los métodos level1(),level2() y level3() son meras simulaciones
	 * de una situación donde se ha validado ciertos datos y durante esa comprobación
	 * se han encontrado errores y se almacena en una lista el mensaje construido.
	 */
	
	/**
	 * Método que simula contener errores
	 */
	static void level1() {
		listaErrores.add(String.format("%s", EMensaje.PT_CORRECTA.getMsg()));
		listaErrores.add(String.format("%s", EMensaje.ALTA_NIF_NO_VALIDO.getMsg()));
		listaErrores.add(String.format("%s", EMensaje.ALTA_EMAIL_NO_VALIDO.getMsg()));
		level2();
	}
	
	/**
	 * Método que simula contener errores
	 */
	static void level2() {
		listaErrores.add(String.format("%s", EMensaje.BANK_EMAIL_DOCUMENTO_DUPLICADO.getMsg()));
		level3();
	}
	
	/**
	 * Método que simula contener errores
	 */
	static void level3() {
		listaErrores.add(String.format("%s", EMensaje.PT_EXITO.getMsg()));
		listaErrores.add(String.format("%s", EMensaje.PT_VACIA.getMsg()));
		listaErrores.add(String.format("%s", EMensaje.USUARIO_ERROR_AUTENTIFICACION.getMsg()));
		listaErrores.add(String.format("%s", EMensaje.PT_FRACASO.getMsg()));
	}

}
