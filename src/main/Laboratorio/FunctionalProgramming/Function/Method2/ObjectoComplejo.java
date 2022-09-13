/**
 * 
 */
package main.Laboratorio.FunctionalProgramming.Function.Method2;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 13 sept 2022, 22:17:11
 */
public class ObjectoComplejo {

	private String tipoEnum;
	private Integer atributo;

	public ObjectoComplejo(String tipoEnum, Integer atributo) {
		super();
		this.tipoEnum = tipoEnum;
		this.atributo = atributo;
	}

	public String getTipoEnum() {
		return tipoEnum;
	}

	public void setTipoEnum(String tipoEnum) {
		this.tipoEnum = tipoEnum;
	}

	public Integer getAtributo() {
		return atributo;
	}

	public void setAtributo(Integer atributo) {
		this.atributo = atributo;
	}
}
