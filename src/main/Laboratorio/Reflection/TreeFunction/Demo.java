/**
 * 
 */
package main.Laboratorio.Reflection.TreeFunction;

import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.function.Function;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 22 ago 2022, 21:45:49
 */
public class Demo {

	private static TreeMap<Integer, Function<ClaseConMetodos, Void>> treeMap = new TreeMap<>();
	
	
	public static void main(String[] args) {
		treeMap.put(1, ClaseConMetodos::primer);
		treeMap.put(2, ClaseConMetodos::dependeDePrimerA);
		treeMap.put(3, ClaseConMetodos::dependeDePrimerB);
		treeMap.put(4, ClaseConMetodos::dependeDePrimerBSegundo);
		
		ejecutarMetodos(treeMap);
		System.out.println(treeMap);
	}

	
	private static void ejecutarMetodos(TreeMap<Integer, Function<ClaseConMetodos, Void>> treeMap) {
		
		for(Entry<Integer, Function<ClaseConMetodos, Void>> key : treeMap.entrySet()) {
			key.getValue().apply((ClaseConMetodos) key.getValue());
		}
	}
}
