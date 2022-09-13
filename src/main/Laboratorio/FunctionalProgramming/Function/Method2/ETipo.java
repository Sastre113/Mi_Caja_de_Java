/**
 * 
 */
package main.Laboratorio.FunctionalProgramming.Function.Method2;

import java.util.Optional;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 13 sept 2022, 22:26:28
 */
public enum ETipo {

	PEPE_BIGOTE("PEPE_BIGOTE","pepeBigote"),
	PEPE_SIN_BIGOTE("PEPE_SIN_BIGOTE","pepeSinBigote"),
	PEPE_CALVO("PEPE_CALVO","pepeCalvo"),
	PEPE_CON_PELO("PEPE_CON_PELO","pepeConPelo");
	
	private String idTipo;
	private String nameMethod;
	
	private ETipo(String idTipo, String nameMethod) {
		this.idTipo = idTipo;
		this.nameMethod = nameMethod;
	}
	
	public static Optional<ETipo> getETipoByString(String idTipo) {
		for(ETipo eTipo : ETipo.values()) {
			if(eTipo.getIdTipo().equals(idTipo)) {
				return Optional.of(eTipo);
			}
		}
		
		return Optional.empty();
	}
	
	public String getIdTipo() {
		return idTipo;
	}

	public String getNameMethod() {
		return nameMethod;
	}	
}
