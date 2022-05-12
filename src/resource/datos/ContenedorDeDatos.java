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
 * @author Miguel �. Sastre <sastre113@gmail.com>
 * @version 18 jun. 2021, 20:43:05
 */
public final class ContenedorDeDatos {

	/**
	 * Constante que contiene el tama�o m�ximo de las listas generadas aleatoriamente.
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
			Arrays.asList("�urea Gabriel Quijano", "Ovidia Flavio Arriola", "Violeta Adelia Ojeda", 
					"Norberto Margarita Dom�nguez", "Mar�a Jos� Rosa Mar�a Villa", "Aurora Valeria Casales", 
					"Silvio Rodolfo Machado", "Donato Dolores Figueroa", "Rosaura Pastor Ure�a", "Justino Sof�a Araujo", 
					"Jos� Antonio Maricruz Villaverde", "Ana Mar�a Marciano M�rquez", "Jos� �ngel Ariel Rold�n",
					"Francisco Javier Alejandra Mar�a", "Mireya Vinicio Mu�oz", "Rosalva Regina Torres", 
					"Norberto Kike Iglesias", "Heriberto H�ctor Pantoja", "Pac�fica Jennifer Contreras", 
					"Gin�s Ofelia Basurto")); 
	/**
	 * Variable que contiene una lista de nombres.
	 */
	private final List<String> listaNombres = new ArrayList<>(Arrays.asList("Bernab� ", "Yolanda", "Lorena", "Nacho", 
			"Isa�as", "Aitana", "Jos� ", "Ang�lia", "Catalina", "Sabina", "Raimundo", "Jorge", "Abril", "Ismael", 
			"Alexis", "Adelardo", "Fernando", "Rolando", "Mat�as", "Jenifer")); 
	
	
	/**
	 * Constructor por defecto.
	 */
	public ContenedorDeDatos() { }
	
	
	/**
	 * M�todo que genera un n�mero decimal. 
	 * @return
	 */
	public double getDoubleAleatorio() {
		return new Random().nextDouble();
	}
	
	/**
	 * M�todo que genera un n�mero entero.
	 * @return
	 */
	public int getIntAleatorio() {
		return new Random().nextInt();
	}
	
	/**
	 * M�todo que genera un n�mero con un rango m�ximo establecido.
	 * @param maxValor
	 * @return
	 */
	public int getIntAleatorio(int maxValor) {
		return new Random().nextInt(maxValor);
	}
	
	/**
	 * M�todo que genera un n�mero entero positivo. 
	 * @return
	 */
	public int getIntAleatorioPositivo() {
		return Math.abs(this.getIntAleatorio());
	}
	
	/**
	 * M�todo que genera un n�mero entero negativo.
	 * @param maxValor
	 * @return
	 */
	public int getIntAleatorioNegativo(int maxValor) {
		return -this.getIntAleatorio(maxValor);
	}
	
	/**
	 * M�todo que devuelve un nombre.
	 * @return
	 */
	public String getNombreAleatorio() {
		return this.getListaNombres().get(this.getIndiceAleatorioListaNombre());
	}
	
	/**
	 * M�todo que devuelve un nombre y apellidos.
	 * @return
	 */
	public String getNombreApellidoAleatorio() {
		return this.getListaNombresApellidos().get(this.getIndiceAleatorioListaNombreConApellido());
	}

	/**
	 * M�todo que devuelve una lista con nombres.
	 * @return
	 */
	public List<String> getListNombresAleatorios(){
		return this.getLista(0,this.getIntAleatorio(MAX_VALOR_LISTA));
	}
	
	/**
	 * M�todo que devuelve una lista con nombres y apellidos.
	 * @return
	 */
	public List<String> getListNombresApellidosAleatorios(){
		return this.getLista(1,this.getIntAleatorio(MAX_VALOR_LISTA));
	} 
	
	/**
	 * M�todo 'getter' que devuelve el texto.
	 * @return
	 */
	public String getTexto() {
		return this.texto;
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
	
	private List<String> getLista(int opcion, int sizeList){
		List<String> list = new ArrayList<>();

		for(int i = 0; i < sizeList; i++) {
			switch(opcion) {
			case 0:
				list.add(this.getNombreAleatorio());
				break;
			case 1:
				list.add(this.getNombreApellidoAleatorio());
				break;
			default:
				System.err.println(String.format("No se ha a�adido ning�n valor en la iteracci�n %d.\n",i));
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
