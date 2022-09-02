package main.Laboratorio.design.patterns.creational.builder;

/**
 * 
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 2 sept 2022, 20:55:02
 */
public class CarWithBuilderInside {

	private final String matricula;
	private String modelo;
	private int ruedas;
	private int numAsientos;
	private String color;

	public CarWithBuilderInside(CarBuilder carBuilder) {
		this.matricula = carBuilder.matricula;
		this.modelo = carBuilder.modelo;
		this.ruedas = carBuilder.ruedas;
		this.numAsientos = carBuilder.numAsientos;
		this.color = carBuilder.color;
	}

	public String getMatricula() {
		return matricula;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getRuedas() {
		return ruedas;
	}

	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}

	public int getNumAsientos() {
		return numAsientos;
	}

	public void setNumAsientos(int numAsientos) {
		this.numAsientos = numAsientos;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "CarWithBuilderInside [matricula=" + matricula + ", modelo=" + modelo + ", ruedas=" + ruedas
				+ ", numAsientos=" + numAsientos + ", color=" + color + "]";
	}

	public static class CarBuilder {

		private final String matricula;
		private String modelo;
		private int ruedas;
		private int numAsientos;
		private String color;

		public CarBuilder(String matricula) {
			this.matricula = matricula;
		}

		public CarWithBuilderInside build() {
			return new CarWithBuilderInside(this);
		}

		public CarBuilder modelo(String modelo) {
			this.modelo = modelo;
			return this;
		}

		public CarBuilder ruedas(int ruedas) {
			this.ruedas = ruedas;
			return this;
		}

		public CarBuilder numAsientos(int numAsientos) {
			this.numAsientos = numAsientos;
			return this;
		}

		public CarBuilder color(String color) {
			this.color = color;
			return this;
		}
	}
}
