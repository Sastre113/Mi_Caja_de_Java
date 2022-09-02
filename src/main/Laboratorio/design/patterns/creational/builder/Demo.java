package main.Laboratorio.design.patterns.creational.builder;

public class Demo {
	
	public static void main(String[] args) {
		// Ejemplo de como construir un CarWithBuilderInside
		CarWithBuilderInside miCar = new CarWithBuilderInside.CarBuilder("12312APL")
				.modelo("Opel")
				.color("rojo")
				.ruedas(4)
				.numAsientos(5)
				.build();
		
		System.out.println(miCar.toString());
		
	}
}
