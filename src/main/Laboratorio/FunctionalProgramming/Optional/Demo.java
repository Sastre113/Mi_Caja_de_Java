/**
 * 
 */
package main.Laboratorio.FunctionalProgramming.Optional;

import java.util.Optional;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 7 sept 2022, 22:01:02
 */
public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Optional<String> rspConString = getX("pepe");
		Optional<String> rspNull = getX(null);
		
		System.out.println("------- Uso con String -------");
		analizarRespuesta(rspConString);
		System.out.println("------- Uso nulo -------");
		analizarRespuesta(rspNull);
		
	}

	private static Optional<String> getX(String str){
		if(str != null) {
			String msg = "usando optional";
			return Optional.of(msg);
		}
		
		return Optional.empty();
	}

	private static void analizarRespuesta(Optional<String> rsp) {
		if(rsp.isPresent()) {
			System.out.println(String.format("El mensaje es %s", rsp.get()));
		} else if(rsp.isEmpty()) {
			System.out.println("No hay nada en la respuesta");
		}
	}
}
