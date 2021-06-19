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

	/**
	 * Constante que contiene el tama�o m�ximo de las listas generadas aleatoriamente.
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
			Arrays.asList("�urea Gabriel Quijano", "Ovidia Flavio Arriola", "Violeta Adelia Ojeda", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
					"Norberto Margarita Dom�nguez", "Mar�a Jos� Rosa Mar�a Villa", "Aurora Valeria Casales", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
					"Silvio Rodolfo Machado", "Donato Dolores Figueroa", "Rosaura Pastor Ure�a", "Justino Sof�a Araujo", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
					"Jos� Antonio Maricruz Villaverde", "Ana Mar�a Marciano M�rquez", "Jos� �ngel Ariel Rold�n", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
					"Francisco Javier Alejandra Mar�a", "Mireya Vinicio Mu�oz", "Rosalva Regina Torres", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
					"Norberto Kike Iglesias", "Heriberto H�ctor Pantoja", "Pac�fica Jennifer Contreras", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
					"Gin�s Ofelia Basurto")); //$NON-NLS-1$
	/**
	 * Variable que contiene una lista de nombres.
	 */
	private final List<String> listaNombres = new ArrayList<>(Arrays.asList("Bernab� ", "Yolanda", "Lorena", "Nacho", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
			"Isa�as", "Aitana", "Jos� ", "Ang�lia", "Catalina", "Sabina", "Raimundo", "Jorge", "Abril", "Ismael", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ //$NON-NLS-7$ //$NON-NLS-8$ //$NON-NLS-9$ //$NON-NLS-10$
			"Alexis", "Adelardo", "Fernando", "Rolando", "Mat�as", "Jenifer")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$
	
	
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
		return this.getListNombresAleatorios(this.getIntAleatorio(MAX_VALOR_LISTA));
	}
	
	/**
	 * M�todo que devuelve una lista con nombres y apellidos.
	 * @return
	 */
	public List<String> getListNombresApellidosAleatorios(){
		return this.getListNombresApellidosAleatorios(this.getIntAleatorio(MAX_VALOR_LISTA));
	} 
	
	/**
	 * M�todo que devuelve una lista del tama�o pasado que contiene nombres.
	 * @param tama�oLista
	 * @return
	 */
	public List<String> getListNombresAleatorios(int tama�oLista){
		List<String> list = new ArrayList<>();
		
		for(int i = 0; i < tama�oLista; i++) {
			list.add(this.getNombreAleatorio());
		}
		
		return list;
	}
	
	/**
	 * M�todo que devuelve una lista del tama�o pasado que contiene nombres y apellidos.
	 * @param tama�oLista
	 * @return
	 */
	public List<String> getListNombresApellidosAleatorios(int tama�oLista){
		List<String> list = new ArrayList<>();
		
		for(int i = 0; i < tama�oLista; i++) {
			list.add(this.getNombreApellidoAleatorio());
		}
		
		return list;
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
