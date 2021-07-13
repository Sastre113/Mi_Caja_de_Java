/**
 * 
 */
package resource.datos;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import main.utils.Messages;

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
	private final String texto = Messages.getString("ContenedorDeDatos.0");
	
	/**
	 * Variable que contiene una lista con nombres y dos apellidos.
	 */
	private final List<String> listaNombresApellidos = new ArrayList<>(
			Arrays.asList("Áurea Gabriel Quijano", "Ovidia Flavio Arriola", "Violeta Adelia Ojeda", 
					"Norberto Margarita Domínguez", "María José Rosa María Villa", "Aurora Valeria Casales", 
					"Silvio Rodolfo Machado", "Donato Dolores Figueroa", "Rosaura Pastor Ureña", "Justino Sofía Araujo", 
					"José Antonio Maricruz Villaverde", "Ana María Marciano Márquez", "José Ángel Ariel Roldán",
					"Francisco Javier Alejandra María", "Mireya Vinicio Muñoz", "Rosalva Regina Torres", 
					"Norberto Kike Iglesias", "Heriberto Héctor Pantoja", "Pacífica Jennifer Contreras", 
					"Ginés Ofelia Basurto")); 
	/**
	 * Variable que contiene una lista de nombres.
	 */
	private final List<String> listaNombres = new ArrayList<>(Arrays.asList("Bernabé ", "Yolanda", "Lorena", "Nacho", 
			"Isaías", "Aitana", "José ", "Angélia", "Catalina", "Sabina", "Raimundo", "Jorge", "Abril", "Ismael", 
			"Alexis", "Adelardo", "Fernando", "Rolando", "Matías", "Jenifer")); 
	
	
	/**
	 * Constructor por defecto.
	 */
	public ContenedorDeDatos() { }
	
	
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
		return this.getLista(0,this.getIntAleatorio(MAX_VALOR_LISTA));
	}
	
	/**
	 * Método que devuelve una lista con nombres y apellidos.
	 * @return
	 */
	public List<String> getListNombresApellidosAleatorios(){
		return this.getLista(1,this.getIntAleatorio(MAX_VALOR_LISTA));
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
	
	private List<String> getLista(int opcion, int tamañoLista){
		List<String> list = new ArrayList<>();

		for(int i = 0; i < tamañoLista; i++) {
			switch(opcion) {
			case 0:
				list.add(this.getNombreAleatorio());
				break;
			case 1:
				list.add(this.getNombreApellidoAleatorio());
				break;
			default:
				System.err.println(String.format("No se ha añadido ningún valor en la iteracción %d.\n",i));
			} 
			
		}
		
		return list;
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
