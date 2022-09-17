/**
 * 
 */
package main.Laboratorio.FunctionalProgramming.Predicate;

import java.util.function.Predicate;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 13 sept 2022, 19:59:22
 */
public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<String> miPredicateImplement = new Predicate<String>() {

			@Override
			public boolean test(String t) {
				return t.equals("pepe");
			}
			
		};
			
		System.out.println("Ejecutando miPredicate: " + miPredicateImplement.test("pepe"));
		System.out.println("Ejecutando miPredicate: " + miPredicateImplement.test("pepon"));
		
		Predicate<String> miPredicate = t -> t.equals("pepe");
		System.out.println("Ejecutando miPredicate: " + miPredicate.test("pepe"));
		System.out.println("Ejecutando miPredicate: " + miPredicate.test("pepon"));
		
		Predicate<String> miPredicateMethodReference = Demo::miFuncionPredicate;
		System.out.println("Ejecutando miPredicateMethodReference: " + miPredicateMethodReference.test("pepe"));
		System.out.println("Ejecutando miPredicateMethodReference: " + miPredicateMethodReference.test("pepon"));
	}
	
	private static boolean miFuncionPredicate(String str) {
		return str.equals("pepon");
	}

}
