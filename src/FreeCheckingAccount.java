public class FreeCheckingAccount extends BankAccount{
    //Attributes
    private double balance;
    private double withdrawAmount = 200;
    private double minimumBalance = 100;

    //constructor
    public FreeCheckingAccount(double balance){
        this.balance = balance;
    }
    @Override
    public double getBalance(){
        return balance;
    }

    @Override
    public String toString(){
        String str;

        str = "Free Checking Account Balance: $" + getBalance() +"\nMinimum Balance: $" + minimumBalance + "\n" +
                "Free Checking Account Balance: $" + (getBalance() - withdrawAmount) + "\nMinimum Balance: $" + minimumBalance + "\n";
        return str;
    }

    public double withdraw(){
        super.getBalance();
        if(withdrawAmount >= minimumBalance){
            System.out.println("You cannot withdraw that amount. The minimum balance is: " + minimumBalance);
        } return balance;
    }
}

