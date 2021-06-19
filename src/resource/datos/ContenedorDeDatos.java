/**
 * 
 */
package resource.datos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 18 jun. 2021, 20:43:05
 */
public final class ContenedorDeDatos {

	/**
	 * Constante que contiene el tamaño máximo de las listas generadas aleatoriamente.
	 */
	private final int MAX_VALOR_LISTA = 100;
	
	/**
	 * Constante que contiene un simple texto.
	 */
	private final String texto = Messages.getString("ContenedorDeDatos.0"); //$NON-NLS-1$
	
	/**
	 * Variable que contiene una lista con nombres y dos apellidos.
	 */
	private final List<String> listaNombresApellidos = new ArrayList<>(
			Arrays.asList("Áurea Gabriel Quijano", "Ovidia Flavio Arriola", "Violeta Adelia Ojeda", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
					"Norberto Margarita Domínguez", "María José Rosa María Villa", "Aurora Valeria Casales", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
					"Silvio Rodolfo Machado", "Donato Dolores Figueroa", "Rosaura Pastor Ureña", "Justino Sofía Araujo", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
					"José Antonio Maricruz Villaverde", "Ana María Marciano Márquez", "José Ángel Ariel Roldán", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
					"Francisco Javier Alejandra María", "Mireya Vinicio Muñoz", "Rosalva Regina Torres", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
					"Norberto Kike Iglesias", "Heriberto Héctor Pantoja", "Pacífica Jennifer Contreras", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
					"Ginés Ofelia Basurto")); //$NON-NLS-1$
	/**
	 * Variable que contiene una lista de nombres.
	 */
	private final List<String> listaNombres = new ArrayList<>(Arrays.asList("Bernabé ", "Yolanda", "Lorena", "Nacho", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
			"Isaías", "Aitana", "José ", "Angélia", "Catalina", "Sabina", "Raimundo", "Jorge", "Abril", "Ismael", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ //$NON-NLS-7$ //$NON-NLS-8$ //$NON-NLS-9$ //$NON-NLS-10$
			"Alexis", "Adelardo", "Fernando", "Rolando", "Matías", "Jenifer")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$
	
	
	/**
	 * Método que genera un número decimal. 
	 * @return
	 */
	public double getDoubleAleatorio() {
		return new Random().nextDouble();
	}
	
	/**
	 * Método que genera un número entero.
	 * @return
	 */
	public int getIntAleatorio() {
		return new Random().nextInt();
	}
	
	/**
	 * Método que genera un número con un rango máximo establecido.
	 * @param maxValor
	 * @return
	 */
	public int getIntAleatorio(int maxValor) {
		return new Random().nextInt(maxValor);
	}
	
	/**
	 * Método que genera un número entero positivo. 
	 * @return
	 */
	public int getIntAleatorioPositivo() {
		return Math.abs(this.getIntAleatorio());
	}
	
	/**
	 * Método que genera un número entero negativo.
	 * @param maxValor
	 * @return
	 */
	public int getIntAleatorioNegativo(int maxValor) {
		return -this.getIntAleatorio(maxValor);
	}
	
	/**
	 * Método que devuelve un nombre.
	 * @return
	 */
	public String getNombreAleatorio() {
		return this.getListaNombres().get(this.getIndiceAleatorioListaNombre());
	}
	
	/**
	 * Método que devuelve un nombre y apellidos.
	 * @return
	 */
	public String getNombreApellidoAleatorio() {
		return this.getListaNombresApellidos().get(this.getIndiceAleatorioListaNombreConApellido());
	}

	/**
	 * Método que devuelve una lista con nombres.
	 * @return
	 */
	public List<String> getListNombresAleatorios(){
		return this.getListNombresAleatorios(this.getIntAleatorio(MAX_VALOR_LISTA));
	}
	
	/**
	 * Método que devuelve una lista con nombres y apellidos.
	 * @return
	 */
	public List<String> getListNombresApellidosAleatorios(){
		return this.getListNombresApellidosAleatorios(this.getIntAleatorio(MAX_VALOR_LISTA));
	} 
	
	/**
	 * Método que devuelve una lista del tamaño pasado que contiene nombres.
	 * @param tamañoLista
	 * @return
	 */
	public List<String> getListNombresAleatorios(int tamañoLista){
		List<String> list = new ArrayList<>();
		
		for(int i = 0; i < tamañoLista; i++) {
			list.add(this.getNombreAleatorio());
		}
		
		return list;
	}
	
	/**
	 * Método que devuelve una lista del tamaño pasado que contiene nombres y apellidos.
	 * @param tamañoLista
	 * @return
	 */
	public List<String> getListNombresApellidosAleatorios(int tamañoLista){
		List<String> list = new ArrayList<>();
		
		for(int i = 0; i < tamañoLista; i++) {
			list.add(this.getNombreApellidoAleatorio());
		}
		
		return list;
	} 
	
	/**
	 * Método 'getter' que devuelve el texto.
	 * @return
	 */
	public String getTexto() {
		return this.texto;
	}
	
	/*
	 * Métodos auxiliares de la clase
	 */
	
	
	private int getIndiceAleatorioListaNombre() {
		return this.getIntAleatorio(this.getListaNombres().size());
	}
	
	private int getIndiceAleatorioListaNombreConApellido() {
		return this.getIntAleatorio(this.getListaNombresApellidos().size());
	}
	
	
	/*
	 * Getter's
	 */
	
	private List<String> getListaNombresApellidos() {
		return listaNombresApellidos;
	}

	private List<String> getListaNombres() {
		return listaNombres;
	}
}
