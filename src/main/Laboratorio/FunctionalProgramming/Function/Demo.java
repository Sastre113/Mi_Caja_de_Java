/**
 * 
 */
package main.Laboratorio.FunctionalProgramming.Function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 5 sept 2022, 21:17:37
 */
public class Demo {

	public static void main(String[] args) {
		
		List<EFunciones> listaFunciones = new ArrayList<>();
		listaFunciones.add(EFunciones.FX);
		listaFunciones.add(EFunciones.HX);
		listaFunciones.forEach(funcion -> funcion.ejecutar(null));
		
		Function<String, Integer> miFunction = new Function<>() {
			@Override
			public Integer apply(String t) {
				return t.equals("pepe") ? 100 : 50;
			}
		};
		
		Function<String, Integer> miFunctionLambda = t -> t.equals("pepe") ? 100 : 50;
		Function<String, Integer> miFunctionMethodReference = Demo::getMiFunction;
		
		
		System.out.println("Usando mi función con el parámetro: 'pepe' , Resultado: " + miFunction.apply("pepe"));
		System.out.println("Usando mi función con el parámetro: 'pepon' , Resultado: " + miFunction.apply("pepon"));
			
	}

	private static Integer getMiFunction(String string1) {
		return string1.equals("pepe") ? 100 : 50;
	}
}
