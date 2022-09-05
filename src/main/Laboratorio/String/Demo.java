/**
 * 
 */
package main.Laboratorio.String;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 4 sept 2022, 17:59:05
 */
public class Demo {
	public static void main(String[] args) {
		System.out.println(Comparador.comparaString("aNa", "ana"));
		System.out.println(Comparador.comparaString("ana", "aNa"));
		System.out.println("anal vs ana : "+ Comparador.comparaString("anal", "ana"));
		System.out.println(Comparador.comparaString("ana", "ana"));
		System.out.println(Comparador.comparaString("ana1223132", "ana122313A2"));
	}
}
