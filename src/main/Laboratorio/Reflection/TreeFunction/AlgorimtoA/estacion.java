package main.Laboratorio.Reflection.TreeFunction.AlgorimtoA;

 
public class estacion {
	
	/*
	 *  Información básica de cada estación
	 */
	
	/** 
	 *  @param codeLine Codigo de la linea
	 *  1 = Roja
	 *  2 = Azul
	 *  3 = Verde
	 *  @param codeStation Codigo de estacion
	 *  @param transbordo Si es verdad tiene transbordo, ecc no.
	 *  @param nameSation Nombre de estación
	 */
	
	Integer codeLine;
	Integer codeStation;
	boolean transbordo;
	String nameStation;
	
	/**
	 * @param nextStation Distancia hasta la siguiente estación
	 * @param prevStation Distancia hasta la anterior estacion
	 * @param escaleras Escaleras que tiene la estacion
	 */
	
	Integer nextStation = -1;
	Integer prevStation = -1;
	int escaleras;
	
	/*
	 *  Informacion para estaciones con transbordos
	 */
	
	/**
	 * @param lineSister Código de línea de la estación hermana
	 * @param stationSister Código de la estación hermana
	 * @param delayTransbordo Retraso añadido por cambio de estación
	 */
	Integer lineSister = -1;
	Integer stationSister = -1;
	int delayTransbordo = 0;
	
	
	/**
	 * @param codLinea Código que identifica a que linea pertenece la estación
	 * @param linea Texto que incluye todo los datos de la linea
	 * 		Como esta compuesta:
	 * 		(int) codigoEstacion ;(boolean) Transbordo;nombreEstacion; 
	 *      (int) Dist. Sig. Estacion;(int) Dist. Ant. Estacion;
	 *      (int) Escaleras:@
	 *      
	 *      El caracter ';' indica la serapacion de cada dato relevante para la estacion.
	 *      El caracter ':' indica el fin de la estacion.
	 *      El caracter '@' indica el fin de la linea.
	 */
	
	public estacion(int codLinea,String linea) {
	
		String array[] = linea.split(";");
		this.codeLine = codLinea;
		this.codeStation = Integer.parseInt(array[0]);
		this.transbordo = stringToBoolean(array[1]);
		this.nameStation = array[2];
		this.nextStation = Integer.parseInt(array[3]);
		this.prevStation = Integer.parseInt(array[4]);
		this.escaleras = Integer.parseInt(array[5]);
		
		if(transbordo) estacionHermana(array[6],array[7],array[8]);
	}
	

	private void estacionHermana(String lineSister,String stationSister,String retraso) {
		this.lineSister= Integer.parseInt(lineSister);
		this.stationSister = Integer.parseInt(stationSister);
		this.delayTransbordo = Integer.parseInt(retraso);
	}
	private boolean stringToBoolean(String cadena) {
		return Boolean.parseBoolean(cadena);
	}
	
	
	public String toString() {
		String infoStation =  "||";
		
		if(this.codeLine == 0) infoStation = "Linea Roja";
		else if(this.codeLine == 1) infoStation = "Linea Azul";
		else infoStation = "Linea Verde";
		
		infoStation = infoStation + ", Estación: " + this.codeStation 
				+ ",\nNombre estación: "+ this.nameStation
				+ ",\nTransbordo: " + this.transbordo+", Escaleras: "+this.escaleras 
				+",\nDist. sig. estación: "+ this.nextStation ;
		
		if(this.prevStation > -1) 
			infoStation = infoStation + ", Dist. ant. estación: " + this.prevStation;
		if(this.transbordo) {
			infoStation = infoStation + ",\nEstacion hermana: "+ "Linea "+this.lineSister + ",Estación "+this.stationSister
					+"\nRetraso provocado por transbordo: "+ this.delayTransbordo + " min ";
		}
		infoStation = infoStation + "\n";
		return infoStation;
	}
	
	public boolean tieneSigEst() {
		return this.nextStation > 0;
	}
	
	public boolean tieneAntEst() {
		return this.prevStation > 0;
	}
	
	public Integer getCodigoLinea() {
		return this.codeLine;
	}

	public Integer getCodigoEstacion() {
		return this.codeStation;
	}

	public boolean tieneTransbordo() {
		return this.transbordo;
	}

	public String getNombreEstacion() {
		return this.nameStation;
	}

	public Integer getCodigoSiguienteEstacion() {
		return this.codeStation+1;
	}
	
	public Integer getCodigoAnteriorEstacion() {
		return this.codeStation-1;
	}
	
	public Integer getDistSigEstacion() {
		return this.nextStation;
	}
	
	public Integer getDistAntEstacion() {
		return this.prevStation;
	}

	public int getEscaleras() {
		return this.escaleras;
	}
	
	public int getLineaHermana() {
		return this.lineSister;
	}
	
	public int getEstacionHermana() {
		return this.stationSister;
	}
	
	public int getDelayTransbordo() {
		return this.delayTransbordo;
	}
}
