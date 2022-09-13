/**
 * 
 */
package main.Laboratorio.FunctionalProgramming.Function.Method2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Optional;

import main.Laboratorio.FunctionalProgramming.Function.Method2.ClasesAuxiliares.EntidadDB;
import main.Laboratorio.FunctionalProgramming.Function.Method2.ClasesAuxiliares.ObjectoComplejo;
import main.Laboratorio.FunctionalProgramming.Function.Method2.ClasesAuxiliares.Respuesta;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 13 sept 2022, 22:24:08
 */
public class ClassService {
	
	private IContainerLogica logica;

	public ClassService() {
		this.logica = (IContainerLogica) new ContainerLogica();
	}

	public void ejecutar(Integer opcion) {
		EntidadDB entidad = this.llamadaBD(opcion);
		entidad.getListaObjetosComplejos().forEach(objComplejo -> ejecutarSegunEnum(objComplejo));
	}

	/**
	 * @param objComplejo
	 * @return
	 */
	private void ejecutarSegunEnum(ObjectoComplejo objComplejo) {
		Optional<ETipo> optionalETipo = ETipo.getETipoByString(objComplejo.getTipoEnum());
		
		if(optionalETipo.isPresent()) {
			Respuesta respuesta = this.ejecutarMetodo(objComplejo, optionalETipo);
	
			// se modifica la base de datos con la respuesta de los métodos
			/*
			 * ...
			 * ...
			 * ...
			 */
			System.out.println(respuesta);
		}
	}

	/**
	 * @param objComplejo
	 * @param optionalETipo
	 * @return Respuesta
	 * @throws IllegalAccessException
	 * @throws InvocationTargetException
	 */
	private Respuesta ejecutarMetodo(ObjectoComplejo objComplejo, Optional<ETipo> optionalETipo) {
		try {
			return (Respuesta) this.getMethodByETipo(optionalETipo).invoke(logica, objComplejo);
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			System.out.println("Error ClassService::ejecutarMetodo()");
			throw new RuntimeException(e);
		}
	}

	/**
	 * 
	 * @param optionalETipo
	 * @return Method
	 * @throws RuntimeException
	 */
	private Method getMethodByETipo(Optional<ETipo> optionalETipo) {
		try {
			return logica.getClass()
					.getDeclaredMethod(optionalETipo
							.get()
							.getNameMethod(), ObjectoComplejo.class);
		} catch (NoSuchMethodException | SecurityException e) {
			System.out.println("Error ClassService::getMethodByETipo()");
			throw new RuntimeException(e);
		}
	}
	
	
	
	
	/******************************************************************************/
	/******************************************************************************/
	/******************************************************************************/
	/******************************************************************************/
	/******************************************************************************/
	/******************************************************************************/
	/******************************************************************************/
	/******************************************************************************/
	/******************************************************************************/
	/******************************************************************************/
	/******************************************************************************/
	/******************************************************************************/
	/******************************************************************************/
	/******************************************************************************/
	/******************************************************************************/
	/******************************************************************************/
	/******************************************************************************/
	/******************************************************************************/
	/******************************************************************************/
	/******************************************************************************/
	
	

	/**
	 * Método para simular persistencia con base de datos
	 * @param opcion
	 * @return entidad
	 */
	private EntidadDB llamadaBD(Integer opcion) {
		// TODO Auto-generated method stub
		if(opcion == null)
			throw new RuntimeException("Opción no puede ser nula");
		EntidadDB entidad = new EntidadDB();
		ArrayList<ObjectoComplejo> listaObjetosComplejos = new ArrayList<>();
		entidad.setListaObjetosComplejos(listaObjetosComplejos);
		switch(opcion) {
		case 1:
			entidad.setId("1");
			listaObjetosComplejos.add(new ObjectoComplejo("PEPE_BIGOTE", 1));
			listaObjetosComplejos.add(new ObjectoComplejo("PEPE_SIN_BIGOTE", 2));
			listaObjetosComplejos.add(new ObjectoComplejo("PEPE_CALVO", 3));
			listaObjetosComplejos.add(new ObjectoComplejo("PEPE_CON_PELO", 4));
			break;
		case 2:
			entidad.setId("1");
			listaObjetosComplejos.add(new ObjectoComplejo("PEPE_BIGOTE", 100));
			listaObjetosComplejos.add(new ObjectoComplejo("PEPE_CON_PELO", 4213));
			break;
		default:
			throw new RuntimeException("Opción incorrecta");
		}
		
		return entidad;
	}
}
