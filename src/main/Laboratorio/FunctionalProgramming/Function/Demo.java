/**
 * 
 */
package main.Laboratorio.FunctionalProgramming.Function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 4 sept 2022, 0:22:41
 */
public class Demo {

	public static void main(String[] args) {

		Function<String, Integer> fx = new Function<String, Integer>() {
			@Override
			public Integer apply(String t) {
				// TODO Auto-generated method stub
				if (t.equals("pepe"))
					return 1;

				return 0;
			}
		};
		
		Function<String, Integer> gx = new Function<String, Integer>() {
			@Override
			public Integer apply(String t) {
				return -1;
			}
		};
		
		
		System.out.println(fx.apply("pepe"));
		MiClaseMatematica miClase = new MiClaseMatematica();
		
		List<Function<String, Integer>> listaFunciones = new ArrayList<>();
		
		listaFunciones.add(fx);
		listaFunciones.add(gx);
		listaFunciones.add(miClase::fx);
		
		listaFunciones.forEach(function -> System.out.println(function.apply("pepe")));
	}
}
