/**
 * 
 */
package main.Laboratorio.FunctionalProgramming.Function.Method2;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 13 sept 2022, 22:39:33
 */
public class Respuesta {

	private String codigo;
	private String descripcion;

	public Respuesta(boolean codigo, String descripcion) {
		this.codigo = codigo ? "OK":"KO";
		this.descripcion = descripcion;
	}

	public Respuesta(String codigo, String descripcion) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Respuesta [codigo=" + codigo + ", descripcion=" + descripcion + "]";
	}
}
