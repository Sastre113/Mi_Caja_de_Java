/**
 * 
 */
package main.Laboratorio.Objetos;

import main.Laboratorio.Objetos.object.Personaje;

/**
 * 
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @Version 27 feb 2022
 */
public class Main {
	
	public static void main(String[] args) {
		Personaje aragorn = new Personaje("Aragorn",230,30,20);
		Personaje gollum = new Personaje();
		Personaje frodo = new Personaje("Frodo",120,21,10);
		Personaje sauron = new Personaje("Sauron",1000,400,50);
		
		System.out.println(aragorn.toString());
		System.out.println(gollum.toString());
		
		gollum.setNombre("Gollum");
		gollum.setSalud(30);
		gollum.setAtaque(4);
		gollum.setDefensa(10);
		System.out.println(gollum.toString());
		
		aragorn.recibirAtaque(frodo);
		aragorn.recibirAtaque(gollum);
		aragorn.recibirAtaque(sauron);
		
		frodo.recibirAtaque(aragorn);	
	}
}
