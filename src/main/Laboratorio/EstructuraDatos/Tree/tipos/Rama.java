/**
 * 
 */
package main.Laboratorio.EstructuraDatos.Tree.tipos;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 12 jul 2023, 23:00:06
 */
public final class Rama implements Serializable {

	private static final long serialVersionUID = -7249084902425034425L;
	private String idRama;
	private int longitud;

	public Rama(String idRama, int longitud) {
		super();
		this.idRama = idRama;
		this.longitud = longitud;
	}

	public String getIdRama() {
		return idRama;
	}

	public int getLongitud() {
		return longitud;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idRama, longitud);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rama other = (Rama) obj;
		return Objects.equals(idRama, other.idRama) && longitud == other.longitud;
	}

	@Override
	public String toString() {
		return "Rama [idRama=" + idRama + ", longitud=" + longitud + "]";
	}
}