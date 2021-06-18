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

	private final int MAX_VALOR_LISTA = 100;
	
	private final List<String> listaNombresApellidos = new ArrayList<>(
			Arrays.asList("Áurea Gabriel Quijano", "Ovidia Flavio Arriola", "Violeta Adelia Ojeda",
					"Norberto Margarita Domínguez", "María José Rosa María Villa", "Aurora Valeria Casales",
					"Silvio Rodolfo Machado", "Donato Dolores Figueroa", "Rosaura Pastor Ureña", "Justino Sofía Araujo",
					"José Antonio Maricruz Villaverde", "Ana María Marciano Márquez", "José Ángel Ariel Roldán",
					"Francisco Javier Alejandra María", "Mireya Vinicio Muñoz", "Rosalva Regina Torres",
					"Norberto Kike Iglesias", "Heriberto Héctor Pantoja", "Pacífica Jennifer Contreras",
					"Ginés Ofelia Basurto"));
	private final List<String> listaNombres = new ArrayList<>(Arrays.asList("Bernabé ", "Yolanda", "Lorena", "Nacho",
			"Isaías", "Aitana", "José ", "Angélia", "Catalina", "Sabina", "Raimundo", "Jorge", "Abril", "Ismael",
			"Alexis", "Adelardo", "Fernando", "Rolando", "Matías", "Jenifer"));
	
	
	public double getDoubleAleatorio() {
		return new Random().nextDouble();
	}
	
	public int getIntAleatorio() {
		return new Random().nextInt();
	}
	
	public int getIntAleatorio(int maxValor) {
		return new Random().nextInt(maxValor);
	}
	
	public int getIntAleatorioPositivo() {
		return Math.abs(this.getIntAleatorio());
	}
	
	public int getIntAleatorioNegativo(int maxValor) {
		return -this.getIntAleatorio(maxValor);
	}
	
	public String getNombreAleatorio() {
		return this.getListaNombres().get(this.getIndiceAleatorioListaNombre());
	}
	
	public String getNombreApellidoAleatorio() {
		return this.getListaNombresApellidos().get(this.getIndiceAleatorioListaNombreConApellido());
	}

	public List<String> getListNombresAleatorios(){
		return this.getListNombresAleatorios(this.getIntAleatorio(MAX_VALOR_LISTA));
	}
	
	public List<String> getListNombresApellidosAleatorios(){
		return this.getListNombresApellidosAleatorios(this.getIntAleatorio(MAX_VALOR_LISTA));
	} 
	
	public List<String> getListNombresAleatorios(int tamañoLista){
		List<String> list = new ArrayList<>();
		
		for(int i = 0; i < tamañoLista; i++) {
			list.add(this.getNombreAleatorio());
		}
		
		return list;
	}
	
	public List<String> getListNombresApellidosAleatorios(int tamañoLista){
		List<String> list = new ArrayList<>();
		
		for(int i = 0; i < tamañoLista; i++) {
			list.add(this.getNombreApellidoAleatorio());
		}
		
		return list;
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
