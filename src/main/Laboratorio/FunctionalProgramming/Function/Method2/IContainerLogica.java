/**
 * 
 */
package main.Laboratorio.FunctionalProgramming.Function.Method2;

import main.Laboratorio.FunctionalProgramming.Function.Method2.ClasesAuxiliares.ObjectoComplejo;
import main.Laboratorio.FunctionalProgramming.Function.Method2.ClasesAuxiliares.Respuesta;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 13 sept 2022, 22:38:52
 */
public interface IContainerLogica {

	public Respuesta pepeBigote(ObjectoComplejo obj);
	public Respuesta pepeSinBigote(ObjectoComplejo obj);
	public Respuesta pepeCalvo(ObjectoComplejo obj);
	public Respuesta pepeConPelo(ObjectoComplejo obj);

}
