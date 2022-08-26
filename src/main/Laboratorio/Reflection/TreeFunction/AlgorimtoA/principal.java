package main.Laboratorio.Reflection.TreeFunction.AlgorimtoA;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeMap;

public class principal {

	static HashMap<Integer, TreeMap<Integer, estacion>> listaLineas = new HashMap();

	public static void main(String[] args) {

		// (int)Estacion; (boolean)Transbordo; (string) nombre estacion; (int)dist sig
		// est; (int)dist ant est; (int)Escaleras@...

		// Caso especial: Transbordo = true, hay dos dato mas al final
		// (int) codigoLinea; (int) codigoEstacion ; (int) retraso por transbordo ( En
		// minutos)

		String estacionesBruto =
				// Linea 0, Roja
				"0;false;Olmazor;5;-1;20:" + "1;false;Chilonzor;2;5;25:" + "2;false;Mirzo Ulugbek;2;2;10:"
						+ "3;false;Novza;3;2;23:" + "4;false;Milliy Bog;1;3;45:" + "5;false;Bunyodkor;3;1;40:"
						+ "6;true;Pakhtakor;4;3;30;1;4;10:" + "7;false;Mustakillik Maydoni;3;4;15:"
						+ "8;true;Amir Temur Hiyoboni;2;3;30;2;4;8:" + "9;false;Khamid Alimian;3;3;13:"
						+ "10;false;Pushkin;3;3;19:" + "11;false;Buyuk Ipak yuli;-1;3;56@"

						// Linea 1, Azul
						+ "0;false;Beruni;3;-1;10:" + "1;false;Tinchlik;5;3;36:" + "2;false;Chorsu;2;5;15:"
						+ "3;false;Gafur Gulom;2;2;9:" + "4;true;Alisher Navoi;2;2;20;0;6;5:"
						+ "5;false;Uzbekistan;3;2;26:" + "6;false;Kosmonavtlar;2;3;52:" + "7;true;Oybek;3;2;13;2;5;12:"
						+ "8;false;Toshkent;4;3;33;20:" + "9;false;Mashinasozlar;3;4;14;20:"
						+ "10;false;Dostlik;-1;3;20@"

						// Linea 2, Verde
						+ "0;false;Shakhriston;3;-1;11:" + "1;false;Bodomzor;2;3;8:" + "2;false;Minor;1;2;12:"
						+ "3;false;Abdulla Kodiriy;3;1;15:" + "4;true;Yunus Rajabiy;3;3;25;0;8;9:"
						+ "5;true;Ming Urik;-1;3;30;1;7;11@";

		String lineasSeparadas[] = estacionesBruto.split("@");
		estacion objetoEst;

		for (int codeLine = 0; codeLine < lineasSeparadas.length; codeLine++) {
			String cadenaLinea[] = lineasSeparadas[codeLine].split(":");
			TreeMap<Integer, estacion> listaEstaciones = new TreeMap();

			for (int codeStation = 0; codeStation < cadenaLinea.length; codeStation++) {
				objetoEst = new estacion(codeLine, cadenaLinea[codeStation]);
				listaEstaciones.put(codeStation, objetoEst);
			}

			/*
			 * Linea 0 = Roja Linea 1 = Azul Linea 2 = Verde
			 */
			listaLineas.put(codeLine, listaEstaciones);
		}
		/*
		 * // Prueba que debe fallar. System.out.println(transbordoCercano(0,3)); //
		 * Prueba de estacion de transbordo de verde a azul
		 * System.out.println(transbordoCercano(2,1));
		 */

		// Prueba para comoAvanzar.
		// Resultado = 1, Avanza hacia adelante.
		// Resultado = -1 , Avanza hacia atras.
		System.out.println(comoAvanzar(listaLineas.get(0).get(11), listaLineas.get(1).get(5)));

		// Pruebas del calculo de la funcion heuristica, h(n)
		System.out.println(calcularH(listaLineas.get(0).get(6), listaLineas.get(2).get(4)));

		// Pruebas para el algoritmoA*

		System.out.println(algoritmoA(listaLineas.get(0).get(5), listaLineas.get(1).get(8)));
	}

	@SuppressWarnings("unused")
	private estacion elegirEstacion(int linea, int estacion) {
		return this.listaLineas.get(linea).get(estacion);
	}

	/**
	 * Obtiene el camino más optimo hasta la estacion destino.
	 * 
	 * @param origen
	 * @param destino
	 * @return
	 */
	@SuppressWarnings("unused")
	private static LinkedList<estacion> algoritmoA(estacion origen, estacion destino) {
		LinkedList<Pair<estacion, Pair<Integer, Integer>>> listaCerrada = new LinkedList<Pair<estacion, Pair<Integer, Integer>>>();
		LinkedList<Pair<estacion, Pair<Integer, Integer>>> listaAbierta = new LinkedList<Pair<estacion, Pair<Integer, Integer>>>();

		estacion actual = origen, estAux;
		listaCerrada.add(new Pair(origen, calcularH(origen, destino)));

		int g = 0, auxG = 0;

		while (!alcanzadoDestino(actual, destino)) {

			int auxF = 0, menorH = 100000, auxH = 0, h = 0, sentido = 0;
			/*
			 * Se agregan las estaciones cercanas posibles a la lista abierta.
			 */
			sentido = comoAvanzar(actual, destino);
			estAux = listaLineas.get(actual.getCodigoLinea()).get(actual.getCodigoAnteriorEstacion());

			if (sentido == -1 && actual.tieneAntEst() && !estacionVisitada(listaCerrada, estAux)) {

				auxG = g + actual.getDistAntEstacion();
				h = calcularH(estAux, destino);
				listaAbierta.add(new Pair(estAux, new Pair(auxG, h)));
			}

			estAux = listaLineas.get(actual.getCodigoLinea()).get(actual.getCodigoSiguienteEstacion());
			if (sentido == 1 && actual.tieneSigEst() && !estacionVisitada(listaCerrada, estAux)) {

				auxG = g + actual.getDistSigEstacion();
				h = calcularH(estAux, destino);
				listaAbierta.add(new Pair(estAux, new Pair(auxG, h)));
			}

			if (actual.tieneTransbordo()) {
				estAux = listaLineas.get(actual.getLineaHermana()).get(actual.getEstacionHermana());
				auxG = g + actual.getDelayTransbordo();
				h = calcularH(estAux, destino);
				if (!estacionVisitada(listaCerrada, estAux))
					listaAbierta.add(new Pair(estAux, new Pair(auxG, h)));
			}

			Iterator<Pair<estacion, Pair<Integer, Integer>>> it = listaAbierta.iterator();
			Pair<estacion, Pair<Integer, Integer>> estacionAnal;
			Pair<estacion, Pair<Integer, Integer>> estSeleccionada = null;

			// Vamos a analizar la lista abierta.
			// Y al finalizar elegiremos 1 estacion para avanzar.
			// El bucle buscará aquella estacion que tenga el menor coste f.
			// Es decir, f(n) = g(n) + h(n)

			while (it.hasNext()) {
				estacionAnal = it.next();
				auxF = estacionAnal.getRight().getLeft() + estacionAnal.getRight().getRight();
				auxH = estacionAnal.getRight().getLeft();

				if (menorH > auxH) {
					menorH = auxH;
					estSeleccionada = estacionAnal;
				}
			}

			g = g + estSeleccionada.getRight().getLeft();
			h = estSeleccionada.getRight().getRight();
			listaCerrada.add(new Pair(estSeleccionada.getLeft(), new Pair(g, h)));
			listaAbierta.remove(estSeleccionada);
			actual = estSeleccionada.getLeft();
		}

		LinkedList<estacion> listaDevuelta = new LinkedList<estacion>();
		Iterator<Pair<estacion, Pair<Integer, Integer>>> it = listaCerrada.iterator();
		while (it.hasNext()) {
			listaDevuelta.add(it.next().getLeft());
		}

		return listaDevuelta;
	}

	private static boolean estacionVisitada(LinkedList<Pair<estacion, Pair<Integer, Integer>>> listaCerrada,
			estacion buscar) {
		Iterator<Pair<estacion, Pair<Integer, Integer>>> it = listaCerrada.iterator();
		boolean encontrada = false;

		while (it.hasNext() && !encontrada) {
			estacion auxEstacion = it.next().getLeft();

			if (buscar.getNombreEstacion().compareToIgnoreCase(auxEstacion.getNombreEstacion()) == 0)
				encontrada = true;
		}

		return encontrada;
	}

	/**
	 * Metodo que realiza un transbordo.
	 * 
	 * @param transbordo Indica la estacion desde la que se realiza el transbordo
	 * @return Devuelve la estacion a la que hemos hecho el transbordo
	 */
	private static estacion realizarTransbordo(estacion transbordo) {
		return listaLineas.get(transbordo.getLineaHermana()).get(transbordo.getEstacionHermana());
	}

	/**
	 * Calcular el valor de la funcion heuristica. Para ello se usa el "Teorema de
	 * Pitágoras" o la "Distancia euclidiana". Por ello, habrá 2 tramos, donde el
	 * vertice que une los 2 lados menores será el transbordo. La hipotenusa será
	 * nuestra h(n).
	 * 
	 * @param origen  Indica la estacion en la que nos encontramos inicialmente.
	 * @param destino Indica la estacion a la que queremos llegar
	 * @return Nos devuelve el valor de h(n)
	 */
	private static int calcularH(estacion origen, estacion destino) {
		int valorH = 0, sentido = 0;
		estacion actual = listaLineas.get(origen.codeLine).get(origen.codeStation);

		if (mismaLinea(origen, destino)) {
			sentido = comoAvanzar(origen, destino);

			while (!alcanzadoDestino(actual, destino)) {
				// Acumula el valor de H
				valorH = valorH + distanciaSigEstacion(actual, sentido) + delayEscaleras(actual);
				// Avanza de estacion
				actual = listaLineas.get(actual.getCodigoLinea()).get(actual.getCodigoEstacion() + sentido);
			}
		} else {
			// Se busca la estacion mas cercana posible para realizar el cambio a la linea
			// objetivo.
			estacion estacionTransbordo = transbordoCercano(origen.getCodigoLinea(), destino.getCodigoLinea());
			int tramoA = 0, tramoB = 0, delayTransb = 0;

			// Primer tramo hasta el 1º transbordo.

			tramoA = calcularH(actual, estacionTransbordo);
			delayTransb = estacionTransbordo.getDelayTransbordo();
			estacionTransbordo = realizarTransbordo(estacionTransbordo);
			// Retraso provocado por realizar el transbordo

			// Segundo tramo hasta el estacion objetivo.
			tramoB = calcularH(estacionTransbordo, destino);

			// Calculo del valor de h(n), Raiz(TramoA^2 + TramoB^2)
			// El valor del retraso provocado por el transbordo se añade al final.
			valorH = (int) Math.sqrt((tramoA * tramoA) + (tramoB * tramoB));
			valorH = valorH + delayTransb;
		}
		return valorH;
	}

	/**
	 * 
	 * @param actual  Indica la estacion en la que nos encontramos
	 * @param sentido Indica en que sentido nos movemos. 1 = Siguiente, -1 =
	 *                Anterior
	 * @return Distancia hacia la siguiente estacion objetivo
	 */
	private static int distanciaSigEstacion(estacion actual, int sentido) {
		int resultado = 0;

		if (sentido == 1)
			resultado = actual.getDistSigEstacion();
		else
			resultado = actual.getDistAntEstacion();

		return resultado;
	}

	/**
	 * Calcula el retraso provocado por el uso de las escaleras
	 * 
	 * @param actual Indica la estacion en la que nos encontramos
	 * @return Minutos que invertimos en el uso de las escaleras
	 */
	private static int delayEscaleras(estacion actual) {
		return (int) ((actual.getEscaleras() * 0.5) / 10);
	}

	private static boolean mismaLinea(estacion origen, estacion destino) {
		boolean mismaLinea = false;

		if (origen.codeLine == destino.codeLine)
			mismaLinea = true;

		return mismaLinea;
	}

	/**
	 * Calcula en el sentido avanzamos para alcanzar el objetivo
	 * 
	 * @param origen  Indica la estacion en la que nos encontramos
	 * @param destino Indica la estacion a la que queremos llegar
	 * @return 1 = Siguiente o -1 = Anterior
	 */
	private static int comoAvanzar(estacion origen, estacion destino) {
		int resultado = 0;

		if (origen.getCodigoLinea() == destino.getCodigoLinea()) {
			resultado = destino.getCodigoEstacion() - origen.getCodigoEstacion();

			if (resultado > 0)
				resultado = 1;
			else
				resultado = -1;
		} else {
			estacion estacionTransbordo = transbordoCercano(origen.codeLine, destino.codeLine);
			resultado = estacionTransbordo.getCodigoEstacion() - origen.getCodigoEstacion();

			if (resultado > 0)
				resultado = 1;
			else
				resultado = -1;

		}

		return resultado;
	}

	/**
	 * Calcula cual es la estacion mas cercana para cambiar a la linea objetivo
	 * 
	 * @param lineaOrigen  Linea en la que partimos
	 * @param lineaDestino Linea a la que deseamos llegar
	 * @return Devuelve la estacion que hace de conexion entre ambas lineas
	 */
	private static estacion transbordoCercano(int lineaOrigen, int lineaDestino) {

		boolean encontrado = false;
		estacion transCercano = null;

		TreeMap<Integer, estacion> linea = listaLineas.get(lineaOrigen);
		int estacionActual = linea.firstKey();

		try {
			while (!encontrado) {

				if (linea.get(estacionActual).transbordo
						&& linea.get(estacionActual).getLineaHermana() == lineaDestino) {
					transCercano = linea.get(estacionActual);
					encontrado = true;
				}
				estacionActual++;
			}
		} catch (NullPointerException e) {
			System.err.println("\nNo existe la línea " + lineaDestino);
		}

		return transCercano;
	}

	/**
	 * Calcula si hemos llegado al destino
	 * 
	 * @param actual  Indica la estacion en la que nos encontramos
	 * @param destino Indica la estacion a la que queremos llegar
	 * @return True si hemos llegado.
	 */
	private static boolean alcanzadoDestino(estacion actual, estacion destino) {
		return actual.getCodigoLinea() == destino.getCodigoLinea()
				&& actual.getCodigoEstacion() == destino.getCodigoEstacion();
	}
}