/**
 * 
 */
package main.Laboratorio.Reflection.HastaDondeSeConoceUnaClase;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 1 jul. 2021, 23:08:48
 */
public class Jugador {

	private String nombre;
	private Integer vida;
	private boolean fumador;
	private double alturaMetros;

	public Jugador() {
		// No hace nada
	}

	/**
	 * @param nombre
	 * @param vida
	 * @param fumador
	 * @param alturaCm
	 */
	public Jugador(String nombre, Integer vida, boolean fumador, double alturaMetros) {
		this.nombre = nombre;
		this.vida = vida;
		this.fumador = fumador;
		this.alturaMetros = alturaMetros;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the vida
	 */
	public Integer getVida() {
		return vida;
	}

	/**
	 * @param vida the vida to set
	 */
	public void setVida(Integer vida) {
		this.vida = vida;
	}

	/**
	 * @return the fumador
	 */
	public boolean isFumador() {
		return fumador;
	}

	/**
	 * @param fumador the fumador to set
	 */
	public void setFumador(boolean fumador) {
		this.fumador = fumador;
	}

	/**
	 * @return the alturaMetros
	 */
	public double getAlturaMetros() {
		return alturaMetros;
	}

	/**
	 * @param alturaMetros the alturaMetros to set
	 */
	public void setAlturaMetros(double alturaMetros) {
		this.alturaMetros = alturaMetros;
	}

}
