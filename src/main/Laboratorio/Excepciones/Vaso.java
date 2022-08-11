/**
 * 
 */
package main.Laboratorio.Excepciones;

import main.Laboratorio.Excepciones.Excepcion.VasoException;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 30 dic. 2021, 20:34:28
 */
public class Vaso {

	private final int MIN_CANTIDAD = 0, MAX_CANTIDAD = 100;
	private int cantidad;

	public Vaso() {
	}

	public Vaso(int cantidad) {
		
		this.cantidad = cantidad;
	}
	
	public void llenar() {
		this.cantidad = this.MAX_CANTIDAD;
	}
	
	public void vaciar() {
		this.cantidad = this.MIN_CANTIDAD;
	}
	
	public void beber() throws VasoException {
		if(cantidad != MIN_CANTIDAD) {
			this.cantidad -= 25;
			
			if(cantidad < MIN_CANTIDAD) {
				this.cantidad = MIN_CANTIDAD;
			}			
		} else {
			throw new VasoException("El vaso esta vacio!");
		}
	}
	
	public void rellenar(int cantidad) throws VasoException {
		if(this.MAX_CANTIDAD > this.cantidad + cantidad) {
			this.cantidad = MAX_CANTIDAD;
			throw new VasoException("El vaso ha superado el limite de su capacidad y se ha salido liquido, pero se ha llenado al maximo de su capacidad");
		} else {
			this.cantidad += cantidad;
		}
	}
	
	/**
	 * @return the cantidad
	 */
	public int getCantidad() {
		return cantidad;
	}

	/**
	 * @param cantidad the cantidad to set
	 */
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
}
