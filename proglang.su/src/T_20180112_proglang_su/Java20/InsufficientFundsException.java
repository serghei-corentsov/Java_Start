package T_20180112_proglang_su.Java20;

// Название файла InsufficientFundsException.java

public class InsufficientFundsException extends Exception {
    private double amount;

    public InsufficientFundsException(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}