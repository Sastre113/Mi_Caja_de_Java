/**
 * 
 */
package main.Laboratorio.Objetos.object;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @Version 27 feb 2022
 */
public class Personaje {
	
	// Atributos 
	private String nombre;
	private int salud;
	private int ataque;
	private int defensa;
	
	// Constructor
	
	// Constructor por defecto
	public Personaje() {
		this("",0,0,0);
	}
	
	public Personaje(String nombre, int salud, int ataque, int defensa) {
		this.nombre = nombre;
		this.salud = salud;
		this.ataque = ataque;
		this.defensa = defensa;
	}

	// Métodos internos
	
	@Override
	public String toString() {
		return "Personaje [nombre=" + nombre + ", salud=" + salud + ", ataque=" + ataque + ", defensa=" + defensa + "]";
	}
	

	public void recibirAtaque(Personaje personajeAtacante) {
		this.recibirAtaque(personajeAtacante.getNombre(),personajeAtacante.getAtaque());
	}
	
	private void recibirAtaque(String nombreAtacante, int daño) {
		if(this.recibirDaño(daño) > 0) {
			this.salud = this.salud - this.recibirDaño(daño);
		}
		
		System.out.println(String.format("%1$s recibe daño de %2$s por valor de %3$s. Salud restante %4$d de %1$s."
				, this.nombre, nombreAtacante, daño, this.salud)
		);
		
		this.estadoPersonaje();
	}
	
	private void estadoPersonaje() {
		if(this.salud < 0) {
			System.out.println(this.nombre + " a muerto.");
		}
	}
	
	private int recibirDaño(int daño) {
		int dañoRecibido = (daño-defensa);
		return dañoRecibido;
	}

	// GETTERS & SETTERS
	
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
	 * @return the salud
	 */
	public int getSalud() {
		return salud;
	}

	/**
	 * @param salud the salud to set
	 */
	public void setSalud(int salud) {
		this.salud = salud;
	}

	/**
	 * @return the ataque
	 */
	public int getAtaque() {
		return ataque;
	}

	/**
	 * @param ataque the ataque to set
	 */
	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	/**
	 * @return the defensa
	 */
	public int getDefensa() {
		return defensa;
	}

	/**
	 * @param defensa the defensa to set
	 */
	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}
}
