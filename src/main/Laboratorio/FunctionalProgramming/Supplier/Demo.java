/**
 * 
 */
package main.Laboratorio.FunctionalProgramming.Supplier;

import java.util.function.Supplier;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 13 sept 2022, 19:59:22
 */
public class Demo {

	public static void main(String[] args) {
		Supplier<String> miSupplier = new Supplier<String>() {

			@Override
			public String get() {
				return "pepe";
			}
		};
		
		Supplier<String> miSupplierLambda = () -> "pepe";
		Supplier<String> miSupplierMethodReference = Demo::miMetodoSupplier;
	}

	private static String miMetodoSupplier() {
		return "pepe";
	}

}
