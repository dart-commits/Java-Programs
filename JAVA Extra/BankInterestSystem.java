

class Account {
    protected double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double calculateInterest() {
        return 0;
    }
}

class SavingsAccount extends Account {
    private static final double RATE = 0.04;              
    private static final double BONUS_THRESHOLD = 50000;  
    private static final double BONUS = 500;

    public SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    public double calculateInterest() {
        double interest = balance * RATE;
        if (balance > BONUS_THRESHOLD) {
            interest += BONUS;
        }
        return interest;
    }
}

class FixedDeposit extends SavingsAccount {
    private static final double EXTRA_RATE = 0.02;

    public FixedDeposit(double balance) {
        super(balance);
    }

    @Override
    public double calculateInterest() {

        return super.calculateInterest() + (balance * EXTRA_RATE);
    }
}

public class BankInterestSystem {
    public static void main(String[] args) {
        Account a1 = new SavingsAccount(10000);
        System.out.println("TC1 SavingsAccount(10000)  -> " + a1.calculateInterest());


        Account a2 = new SavingsAccount(60000);
        System.out.println("TC2 SavingsAccount(60000)  -> " + a2.calculateInterest());


        Account acc = new FixedDeposit(60000);
        System.out.println("TC3 FixedDeposit(60000)    -> " + acc.calculateInterest());
    }
}
