/**
 * 
 */
package main.Laboratorio.Reflection.HastaDondeSeConoceUnaClase;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 1 jul. 2021, 23:06:56
 */
public class AutoConocimiento {
	public static void main(String[] args) {
		Jugador hax = new Jugador("Hax",100, false, 1.73);
		
		System.out.println("getClass = " + Jugador.class.getDeclaredFields());
		
		
		
	}
}
