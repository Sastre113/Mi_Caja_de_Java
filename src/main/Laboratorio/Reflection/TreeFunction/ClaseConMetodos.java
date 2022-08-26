/**
 * 
 */
package main.Laboratorio.Reflection.TreeFunction;

import java.util.TreeSet;
import java.util.function.Consumer;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 22 ago 2022, 21:46:08
 */
public class ClaseConMetodos {

	private TreeSet<Consumer<String>> tree;
	
	public ClaseConMetodos() {
		this.tree = new TreeSet<>();
		this.tree.add(new Consumer<String>() {

			@Override
			public void accept(String t) {
				// TODO Auto-generated method stub
				
			}
		});
	}
	
	public void primer(String id) {
		System.out.println(String.format("imprimeAlgo::%s", id));
	}
	
	public void dependeDePrimerA(String id) {
		System.out.println(String.format("doSomethig::%s", id));
	}
	
	public void dependeDePrimerB(String id) {
		System.out.println(String.format("getPais::%s", id));
	}
	
	public void dependeDePrimerBSegundo(String id) {
		System.out.println(String.format("getNom::%s", id));
	}
}
