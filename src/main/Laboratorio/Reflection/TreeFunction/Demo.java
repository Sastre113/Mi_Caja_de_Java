/**
 * 
 */
package main.Laboratorio.Reflection.TreeFunction;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ExecutionException;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 22 ago 2022, 21:45:49
 */
public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String, String> treeMap = new TreeMap<>();
		

		
		
		ClaseConMetodos clazz = new ClaseConMetodos();
		TreeSet<Method> tree = new TreeSet<>();
		
		try {
			tree.add(alimentarTree("primer"));
			tree.add(alimentarTree("dependeDePrimeraA"));
			tree.add(alimentarTree("dependeDePrimerB"));
			tree.add(alimentarTree("dependeDePrimerBSegundo"));
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		for(Method met : tree) {
			try {
				met.invoke(null,null);
			} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
	}
	
	
	public static Method alimentarTree(String nombreMethod) throws ExecutionException {
		try {
			return ClaseConMetodos.class.getMethod(nombreMethod, String.class);
		} catch (NoSuchMethodException | SecurityException e) {
			throw new ExecutionException(e);
		}
	}
}
