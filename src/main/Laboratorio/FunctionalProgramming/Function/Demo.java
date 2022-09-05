/**
 * 
 */
package main.Laboratorio.FunctionalProgramming.Function;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 5 sept 2022, 21:17:37
 */
public class Demo {

	public static void main(String[] args) {
		
		List<EFunciones> listaFunciones = new ArrayList<>();
		listaFunciones.add(EFunciones.FX);
		listaFunciones.add(EFunciones.HX);
		
		
		listaFunciones.forEach(funcion -> funcion.ejecutar());
	}

}
