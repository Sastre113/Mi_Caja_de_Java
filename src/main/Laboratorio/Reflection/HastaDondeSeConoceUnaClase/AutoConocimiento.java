/**
 * 
 */
package main.Laboratorio.Reflection.HastaDondeSeConoceUnaClase;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 1 jul. 2021, 23:06:56
 */

@SuppressWarnings({"rawtypes","static-access"})
public class AutoConocimiento {
	
	
	public static void main(String[] args) {
		Jugador hax = new Jugador("Hax",100, false, 1.73);
		Class clazz = hax.getClass();

		System.out.println("Clase que muestra todo el contenido accesible por Reflection de un objeto.");
		System.out.println(String.format("getClass -> [%s]", clazz));
		
		System.out.println("Llamando a getMetodosQueRetornanString()");
		getMetodosQueRetornanString(clazz);
		System.out.println("Llamando a getPackage()");
		getPackage(clazz);
		System.out.println("Llamando a quienEsHax()");
		quienEsHax(hax);
	}
	
	
	/**
	 * @param clazz
	 */
	private static void getMetodosQueRetornanString(Class clazz) {
		System.out.println(String.format("getTypeName -> [%s]",clazz.getTypeName()));
		System.out.println(String.format("getSimpleName -> [%s]",clazz.getSimpleName()));
		System.out.println(String.format("getPackageName -> [%s]",clazz.getPackageName()));
		System.out.println(String.format("getName -> [%s]",clazz.getName()));
		System.out.println(String.format("getCanonicalName -> [%s]",clazz.getCanonicalName()));
	}
		
	/**
	 * @param clazz
	 */
	
	private static void getPackage(Class clazz) {
		Package paquete = clazz.getPackage();
		
		System.out.println(String.format("getName -> [%s]",paquete.getName()));
		System.out.println(String.format("getImplementationTitle -> [%s]",paquete.getImplementationTitle()));
		System.out.println(String.format("getImplementationVendor -> [%s]",paquete.getImplementationVendor()));
		System.out.println(String.format("getSpecificationVendor -> [%s]",paquete.getSpecificationVendor()));
		System.out.println(String.format("getSpecificationTitle -> [%s]",paquete.getSpecificationTitle()));
		System.out.println(String.format("getSpecificationVendor -> [%s]",paquete.getSpecificationVendor()));
		System.out.println(String.format("getSpecificationVersion -> [%s]",paquete.getSpecificationVersion()));
		
		System.out.println("Tamaño del Packages : " + paquete.getPackages().length);
		for(Package elemento : paquete.getPackages()) 
			System.out.println(String.format("getName -> [%s]",elemento.getName()));
		
	}
	
	/**
	 * @param hax
	 */
	private static void quienEsHax(Jugador hax) {
		
	}

}
