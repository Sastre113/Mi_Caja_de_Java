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
		level2();
	}
	
	static void level2() {
		level3();
	}
	
	static void level3() {
		
		System.out.println(String.format("%s", EMensaje.PT_EXITO.getMsg()));
		System.out.println(String.format("%s", EMensaje.PT_FRACASO.getMsg()));
		
	}

}
