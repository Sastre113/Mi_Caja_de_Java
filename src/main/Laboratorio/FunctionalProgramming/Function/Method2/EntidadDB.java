/**
 * 
 */
package main.Laboratorio.FunctionalProgramming.Function.Method2;

import java.util.List;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 13 sept 2022, 22:48:40
 */
public class EntidadDB {

	private String id;
	private List<ObjectoComplejo> listaObjetosComplejos;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<ObjectoComplejo> getListaObjetosComplejos() {
		return listaObjetosComplejos;
	}

	public void setListaObjetosComplejos(List<ObjectoComplejo> listaObjetosComplejos) {
		this.listaObjetosComplejos = listaObjetosComplejos;
	}
}
