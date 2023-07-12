/**
 * 
 */
package main.Laboratorio.EstructuraDatos.Tree.tipos;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 12 jul 2023, 23:00:01
 */
public final class Seccion implements Serializable {

	private static final long serialVersionUID = 1697253171255276620L;
	private String idSeccion;
	private String color;

	public Seccion(String idSeccion, String color) {
		super();
		this.idSeccion = idSeccion;
		this.color = color;
	}

	public String getIdSeccion() {
		return idSeccion;
	}

	public String getColor() {
		return color;
	}

	@Override
	public int hashCode() {
		return Objects.hash(color, idSeccion);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Seccion other = (Seccion) obj;
		return Objects.equals(color, other.color) && Objects.equals(idSeccion, other.idSeccion);
	}

	@Override
	public String toString() {
		return "Seccion [idSeccion=" + idSeccion + ", color=" + color + "]";
	}
}