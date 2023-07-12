/**
 * 
 */
package main.Laboratorio.EstructuraDatos.Tree.tipos;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.StringJoiner;
import java.util.TreeMap;
import java.util.UUID;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 12 jul 2023, 22:58:08
 */
public class Arboles {

	private final Random rand = new Random();
	private String [] COLOR = {"ROJO","AZUL","AMARILLO","VERDE","NEGRO"};
	private String[] NOMBRES_ARBOLES = {"Roble", "Pino", "Secuoya", "Cedro", "Arce", "Abeto"};

	public void pintarArbol() {
		TreeMap<Seccion, List<Rama>> arbol = this.crearArbol();
		
		arbol.forEach((seccion, ramas) -> {
			StringJoiner strRamas = new StringJoiner(",");
			ramas.forEach(rama -> strRamas.add(rama.toString()));
			
			String msg = String.format("idSeccion: %s, Color: %s, Ramas: {%s}"
					, seccion.getIdSeccion(), seccion.getColor(), strRamas.toString());
			
			System.out.println(msg);
		});
	}
	
	private TreeMap<Seccion, List<Rama>> crearArbol(){
		TreeMap<Seccion, List<Rama>> arbol = new TreeMap<>();
		int arbolesParaCrear = this.rand.nextInt(4);
		
		for(int i = 0; i < arbolesParaCrear; i++) {
			arbol.put(this.crearSeccionAleatoria(), this.crearNRamas());
		}
		
		return arbol;
	}
	
	private Seccion crearSeccionAleatoria() {
		return new Seccion(NOMBRES_ARBOLES[this.rand.nextInt(6)], COLOR[this.rand.nextInt(5)]);
	}

	private List<Rama> crearNRamas() {
		List<Rama> ramas = new ArrayList<>(this.rand.nextInt(20));
		
		for(int i = 0; i < ramas.size(); i++) {
			ramas.add(this.crearRamaAleatoria());
		}
		
		return ramas;
	}

	private Rama crearRamaAleatoria() {
		return new Rama(UUID.randomUUID().toString(), this.rand.nextInt());
	}	
}