public class SavingsAccount extends BankAccount{    //Attributes
    private double balance;
    private double withdrawAmount = 200;
    private double minimumBalance = 5;

    //DefaultConstructor
    public SavingsAccount(double balance){
        this.balance = balance;
    }
    @Override
    public double getBalance(){
        return balance;
    }

    @Override
    public String toString(){
        String str;

        str = "Savings Account Account Balance: $" + getBalance() +"\nMinimum Balance: $" + minimumBalance + "\n" +
                "Savings Account Account Balance: $" + (getBalance() - withdrawAmount) + "\nMinimum Balance: $" + minimumBalance + "\n";
        return str;
    }

    //Methods

    public double withdraw(){
        super.getBalance();
        if(withdrawAmount >= minimumBalance){
            System.out.println("You cannot withdraw that amount. The minimum balance is: " + minimumBalance);
        } return balance;
    }

}
