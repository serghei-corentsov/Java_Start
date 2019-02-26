package T_20180112_proglang_su.Java20;

public class Test20_07_02 {
    private int number;
    private double Test20_07_03;

    public Test20_07_02(int number) {
        this.number = number;
    }

    public void deposit(double amount) {
        Test20_07_03 += amount;
    }

    public void withdraw(double amount) throws Test20_07_01 {
        if(amount <= Test20_07_03) {
            Test20_07_03 -= amount;
        }else {
            double needs = amount - Test20_07_03;
            throw new Test20_07_01(needs);
        }
    }

    public double getBalance() {
        return Test20_07_03;
    }

    public int getNumber() {
        return number;
    }
}