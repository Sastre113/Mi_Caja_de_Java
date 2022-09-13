/**
 * 
 */
package main.Laboratorio.FunctionalProgramming.Function.Method2;

import main.Laboratorio.FunctionalProgramming.Function.Method2.ClasesAuxiliares.ObjectoComplejo;
import main.Laboratorio.FunctionalProgramming.Function.Method2.ClasesAuxiliares.Respuesta;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 13 sept 2022, 22:33:04
 */
public class ContainerLogica implements IContainerLogica {

	@Override
	public Respuesta pepeBigote(ObjectoComplejo obj) {
		return new Respuesta(true, obj.getAtributo().toString());
	}

	@Override
	public Respuesta pepeSinBigote(ObjectoComplejo obj) {
		return new Respuesta(false, obj.getAtributo().toString());
	}

	@Override
	public Respuesta pepeCalvo(ObjectoComplejo obj) {
		return new Respuesta("OK", obj.getAtributo().toString());
	}

	@Override
	public Respuesta pepeConPelo(ObjectoComplejo obj) {
		return new Respuesta("KO", obj.getAtributo().toString());
	}

}
