/**
 * 
 */
package main.Laboratorio.Reflection.HastaDondeSeConoceUnaClase;

/**
 * Clase que tiene como objetivo mostrar el método interno de Exception, getSactkTrace(),
 * que nos permite conocer desde donde se lanza una excepcion.
 * 
 * 
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 12 jul. 2021, 21:17:19
 */
public class DondeFallaElCodigo {
	
	public static void main(String[] args) {
		nivel1();
	}
	
	public static void nivel1() {
		nivel2();
	}
	
	public static void nivel2() {
		nivel3();
	}
	
	public static void nivel3() {
		try {
			throw new Exception();
		} catch (Exception e) {
			// Punto en el que nos encontramos
			currentClass();
			System.out.println("*****************************************************");
			System.out.println("* 	Se va a imprimir toda la traza desde aqui.  *");
			System.out.println("*****************************************************");
			// El camino hasta ahora
			allStackTrace();
		}
		
	}
	
	private static String currentClass() {
		StackTraceElement[] stackTrace = new Exception().getStackTrace();
		StackTraceElement element = stackTrace[1];
		
		System.out.println(String.format("getClass -> [ %s ]",element.getClass()));          
		System.out.println(String.format("getModuleVersion -> [ %s ]",element.getModuleVersion()));  
		System.out.println(String.format("getModuleName -> [ %s ]",element.getModuleName()));     
		System.out.println(String.format("getMethodName -> [ %s ]",element.getMethodName()));     
		System.out.println(String.format("getLineNumber -> [ %s ]",element.getLineNumber()));     
		System.out.println(String.format("getFileName -> [ %s ]",element.getFileName()));       
		System.out.println(String.format("getClassName -> [ %s ]",element.getClassName()));      
		System.out.println(String.format("getClassLoaderName -> [ %s ]",element.getClassLoaderName()));
		
		return element.getClassName();
	}
	
	
	private static void allStackTrace() {
		StackTraceElement[] stackTrace = new Exception().getStackTrace();
		
		for(StackTraceElement element : stackTrace) {
			System.out.println("*************************************************");
			System.out.println(String.format("getClass -> [ %s ]",element.getClass()));          
			System.out.println(String.format("getModuleVersion -> [ %s ]",element.getModuleVersion()));  
			System.out.println(String.format("getModuleName -> [ %s ]",element.getModuleName()));     
			System.out.println(String.format("getMethodName -> [ %s ]",element.getMethodName()));     
			System.out.println(String.format("getLineNumber -> [ %s ]",element.getLineNumber()));     
			System.out.println(String.format("getFileName -> [ %s ]",element.getFileName()));       
			System.out.println(String.format("getClassName -> [ %s ]",element.getClassName()));      
			System.out.println(String.format("getClassLoaderName -> [ %s ]",element.getClassLoaderName()));
			System.out.println("*************************************************");
		}	
	}
	
}
