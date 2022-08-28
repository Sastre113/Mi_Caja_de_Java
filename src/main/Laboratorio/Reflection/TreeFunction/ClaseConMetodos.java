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
	
	public Void primer() {
		System.out.println(String.format("imprimeAlgo::%s", "1"));		
		return null;
	}
	
	public Void dependeDePrimerA() {
		System.out.println(String.format("doSomethig::%s", "2"));
		return null;
	}
	
	public Void dependeDePrimerB() {
		System.out.println(String.format("getPais::%s", "3"));
		return null;
	}
	
	public Void dependeDePrimerBSegundo() {
		System.out.println(String.format("getNom::%s", "4"));
		return null;
	}
}
