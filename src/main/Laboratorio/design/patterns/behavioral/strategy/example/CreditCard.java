/**
 * 
 */
package main.Laboratorio.design.patterns.behavioral.strategy.example;

/**
 * @author Miguel ?. Sastre <sastre113@gmail.com>
 * @version 7 jun 2022, 21:02:46
 */
public class CreditCard {
    private int amount;
    private String number;
    private String date;
    private String cvv;

    CreditCard(String number, String date, String cvv) {
        this.amount = 100_000;
        this.number = number;
        this.date = date;
        this.cvv = cvv;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }
}
