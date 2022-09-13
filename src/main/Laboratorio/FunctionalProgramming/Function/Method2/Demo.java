/**
 * 
 */
package main.Laboratorio.FunctionalProgramming.Function.Method2;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 13 sept 2022, 22:23:04
 */
public class Demo {

	public static void main(String[] args) {
		ClassService classService = new ClassService();
		
		System.out.println("Ejecutando classService opción 1.....");
		classService.ejecutar(1);
		System.out.println("Ejecutando classService opción 2.....");
		classService.ejecutar(2);
		
	}
}
