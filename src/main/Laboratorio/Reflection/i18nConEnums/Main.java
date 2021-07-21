/**
 * 
 */
package main.Laboratorio.Reflection.i18nConEnums;

import java.util.ArrayList;
import java.util.List;

/**
 * Esta demo trat� de probar el uso de Enums, Reflection, properties.file y
 * ResourceBundle para la internacionalizaci�n de una aplicaci�n y tener todos
 * los errores recogidos en un mismo archivo.
 * 
 * El objetivo es facilizar el mantenimiento y recoger todos los errores
 * en un mismo lugar, adem�s, de aplicar i18n sobre los mensajes que mostramos.
 * 
 * @author Miguel �. Sastre <sastre113@gmail.com>
 * @version 13 jul. 2021, 0:13:05
 */
public class Main {

	
	static List<String> listaErrores = new ArrayList<>();
	
	
	/**
	 * M�todo main que solo realizar� 2 llamadas.
	 * 
	 * 	1. Simular� la validaci�n de unos datos hipoteticos pero 
	 * 		que contendr� errores y ser�n almacenados en <listaErrores>.
	 * 	2. Se mostrar� todos los errores encontrados por pantalla.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Se ejecuta el programa normalmente
		level1();
		
		// Se valida si ha ocurrido alg�n error
		imprimirErrores();
	}
	
	/**
	 * M�todo que simula la validaci�n de la aplicaci�n.
	 * Se imprimir�n todos los errores localizados en la aplicacion.
	 * 
	 */
	private static void imprimirErrores() {
		listaErrores.forEach(error -> System.out.println(error));
	}

	/*
	 * Los m�todos level1(),level2() y level3() son meras simulaciones
	 * de una situaci�n donde se ha validado ciertos datos y durante esa comprobaci�n
	 * se han encontrado errores y se almacena en una lista el mensaje construido.
	 */
	
	/**
	 * M�todo que simula contener errores
	 */
	static void level1() {
		listaErrores.add(String.format("%s", EMensaje.PT_CORRECTA.getMsg()));
		listaErrores.add(String.format("%s", EMensaje.ALTA_NIF_NO_VALIDO.getMsg()));
		listaErrores.add(String.format("%s", EMensaje.ALTA_EMAIL_NO_VALIDO.getMsg()));
		level2();
	}
	
	/**
	 * M�todo que simula contener errores
	 */
	static void level2() {
		listaErrores.add(String.format("%s", EMensaje.BANK_EMAIL_DOCUMENTO_DUPLICADO.getMsg()));
		level3();
	}
	
	/**
	 * M�todo que simula contener errores
	 */
	static void level3() {
		listaErrores.add(String.format("%s", EMensaje.PT_EXITO.getMsg()));
		listaErrores.add(String.format("%s", EMensaje.PT_VACIA.getMsg()));
		listaErrores.add(String.format("%s", EMensaje.USUARIO_ERROR_AUTENTIFICACION.getMsg()));
		listaErrores.add(String.format("%s", EMensaje.PT_FRACASO.getMsg()));
	}

}
