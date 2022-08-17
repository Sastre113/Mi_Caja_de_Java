package main.Laboratorio.Math;

import java.math.BigDecimal;

public class DoubleVsBigDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double dos = 0.02;
		Double tres = 0.03;
		BigDecimal numBigDecimal = new BigDecimal(tres.toString());
		BigDecimal numBigDecimal2 = new BigDecimal(dos.toString());
		
		System.out.println(numBigDecimal.subtract(numBigDecimal2));
	}

}
