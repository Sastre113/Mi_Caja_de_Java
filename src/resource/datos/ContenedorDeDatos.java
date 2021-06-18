/**
 * 
 */
package resource.datos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * @author Miguel �. Sastre <sastre113@gmail.com>
 * @version 18 jun. 2021, 20:43:05
 */

public final class ContenedorDeDatos {

	private final int MAX_VALOR_LISTA = 100;
	
	private final List<String> listaNombresApellidos = new ArrayList<>(
			Arrays.asList("�urea Gabriel Quijano", "Ovidia Flavio Arriola", "Violeta Adelia Ojeda",
					"Norberto Margarita Dom�nguez", "Mar�a Jos� Rosa Mar�a Villa", "Aurora Valeria Casales",
					"Silvio Rodolfo Machado", "Donato Dolores Figueroa", "Rosaura Pastor Ure�a", "Justino Sof�a Araujo",
					"Jos� Antonio Maricruz Villaverde", "Ana Mar�a Marciano M�rquez", "Jos� �ngel Ariel Rold�n",
					"Francisco Javier Alejandra Mar�a", "Mireya Vinicio Mu�oz", "Rosalva Regina Torres",
					"Norberto Kike Iglesias", "Heriberto H�ctor Pantoja", "Pac�fica Jennifer Contreras",
					"Gin�s Ofelia Basurto"));
	private final List<String> listaNombres = new ArrayList<>(Arrays.asList("Bernab� ", "Yolanda", "Lorena", "Nacho",
			"Isa�as", "Aitana", "Jos� ", "Ang�lia", "Catalina", "Sabina", "Raimundo", "Jorge", "Abril", "Ismael",
			"Alexis", "Adelardo", "Fernando", "Rolando", "Mat�as", "Jenifer"));
	
	
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
	
	public List<String> getListNombresAleatorios(int tama�oLista){
		List<String> list = new ArrayList<>();
		
		for(int i = 0; i < tama�oLista; i++) {
			list.add(this.getNombreAleatorio());
		}
		
		return list;
	}
	
	public List<String> getListNombresApellidosAleatorios(int tama�oLista){
		List<String> list = new ArrayList<>();
		
		for(int i = 0; i < tama�oLista; i++) {
			list.add(this.getNombreApellidoAleatorio());
		}
		
		return list;
	} 
	
	
	/*
	 * M�todos auxiliares de la clase
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
