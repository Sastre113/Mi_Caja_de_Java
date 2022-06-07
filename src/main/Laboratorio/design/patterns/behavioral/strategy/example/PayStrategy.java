/**
 * 
 */
package main.Laboratorio.design.patterns.behavioral.strategy.example;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 7 jun 2022, 21:00:44
 */
public interface PayStrategy {
	 boolean pay(int paymentAmount);
	    void collectPaymentDetails();
}
