/**
 * 
 */
package main.Laboratorio.FunctionalProgramming.Function.Method;

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
		ClaseConFunciones miClase = new ClaseConFunciones();
		
		List<Function<String, Integer>> listaFunciones = new ArrayList<>();
		
		listaFunciones.add(fx);
		listaFunciones.add(gx);
		
		List<Function<Void,Void>> lista = new ArrayList<>();
		//lista.add(miClase::fx);		
		//EMetodos.FX.getMetodo().apply(null);
		
		listaFunciones.forEach(function -> System.out.println(function.apply("fx")));           
		lista.forEach(function -> function.apply(null));
		
		
		List<EUsaMethod> listaPepe = new ArrayList<>();
		listaPepe.add(EUsaMethod.FX);
		listaPepe.add(EUsaMethod.GX);
		
		
		ClaseConFunciones miClazz = new ClaseConFunciones();
		listaPepe.forEach(eMetodo -> eMetodo.invokedMethod());
	}


}
