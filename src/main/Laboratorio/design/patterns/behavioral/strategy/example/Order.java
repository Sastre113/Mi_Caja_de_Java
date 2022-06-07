/**
 * 
 */
package main.Laboratorio.design.patterns.behavioral.strategy.example;

/**
 * @author Miguel Á. Sastre <sastre113@gmail.com>
 * @version 7 jun 2022, 21:02:59
 */
public class Order {
    private int totalCost = 0;
    private boolean isClosed = false;

    public void processOrder(PayStrategy strategy) {
        strategy.collectPaymentDetails();
        // Here we could collect and store payment data from the strategy.
    }

    public void setTotalCost(int cost) {
        this.totalCost += cost;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void setClosed() {
        isClosed = true;
    }
}