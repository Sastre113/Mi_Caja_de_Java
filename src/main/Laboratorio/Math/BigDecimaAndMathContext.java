package main.Laboratorio.Math;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class BigDecimaAndMathContext {
	public static void main(String[] args) {
		BigDecimaAndMathContext.casoA();
		BigDecimaAndMathContext.casoB();
	}
	
	
	private static void casoA() {
		System.out.println("----------------------------------------");
		System.out.println("------------- CASO A ----------------");
		System.out.println("----------------------------------------");
		MathContext mathContext = new MathContext(4, RoundingMode.HALF_UP);

		BigDecimal cantidadDeseada = new BigDecimal("14.055");
		BigDecimal cantidadConcedida = new BigDecimal("12.432");
		BigDecimal recinto1 = new BigDecimal("4.73");
		BigDecimal recinto2 = new BigDecimal("9.325");

		BigDecimal coeficienteDistribucion = cantidadConcedida.divide(cantidadDeseada, 10, RoundingMode.HALF_UP);
		System.out.println("Coeficiente: " + coeficienteDistribucion);
		
		BigDecimal supRecinto1 = coeficienteDistribucion.multiply(recinto1, mathContext);
		BigDecimal supRecinto2 = coeficienteDistribucion.multiply(recinto2, mathContext);

		System.out.println("Recinto1: " + supRecinto1);
		System.out.println("Recinto2: " + supRecinto2);
		System.out.println("Suma de ambos recintos: " + supRecinto1.add(supRecinto2));
	}
	
	private static void casoB() {
		System.out.println("----------------------------------------");
		System.out.println("------------- CASO B ----------------");
		System.out.println("----------------------------------------");
		MathContext mathContext = new MathContext(4, RoundingMode.HALF_UP);

		BigDecimal cantidadDeseada = new BigDecimal("14.055");
		BigDecimal cantidadConcedida = new BigDecimal("12.432");
		BigDecimal recinto1 = new BigDecimal("4.7312");
		BigDecimal recinto2 = new BigDecimal("9.3259");

		BigDecimal coeficienteDistribucion = cantidadConcedida.divide(cantidadDeseada, 10, RoundingMode.HALF_UP);
		System.out.println("Coeficiente: " + coeficienteDistribucion);
		
		BigDecimal supRecinto1 = coeficienteDistribucion.multiply(recinto1, mathContext);
		BigDecimal supRecinto2 = coeficienteDistribucion.multiply(recinto2, mathContext);

		System.out.println("Recinto1: " + supRecinto1);
		System.out.println("Recinto2: " + supRecinto2);
		System.out.println("Suma de ambos recintos: " + supRecinto1.add(supRecinto2));
	}
}