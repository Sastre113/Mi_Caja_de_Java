/**
 * 
 */
package main.Laboratorio.FunctionalProgramming.Consumer;

import java.util.function.Consumer;

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
		
		Consumer<String> miConsumer = new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		};
		
		Consumer<String> miConsumerLambda = a -> System.out.println(a);
		Consumer<String> miConsumerMethodReference = Demo::getConsumer;
		
		
		miConsumer.accept("Prueba miConsumer");
		miConsumerLambda.accept("Prueba miConsumerLambda");
		miConsumerMethodReference.accept("Prueba miConsumerMethodReference");
	}
	
	private static void  getConsumer(String t) {
		System.out.println(t);
	}
}
