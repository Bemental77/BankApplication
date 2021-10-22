public class BusinessCheckingAccount extends BankAccount {
    //Attributes
    private double balance;
    private double withdrawAmount = 200;
    private double minimumBalance = 1000;

    //constructor
    public BusinessCheckingAccount(double balance){
        this.balance = balance;
    }
    @Override
    public double getBalance(){
        return balance;
    }

    @Override
    public String toString(){
        String str;

        str = "Business Checking Account Balance: $" + getBalance() +"\nMinimum Balance: $" + minimumBalance + "\n" +
                "Business Account Balance: $" + (getBalance() - withdrawAmount) + "\nMinimum Balance: $" + minimumBalance + "\n";
        return str;
    }


    public double withdraw(){
        super.getBalance();
        if(withdrawAmount >= minimumBalance){
            System.out.println("You cannot withdraw that amount. The minimum balance is: " + minimumBalance);
        } return balance;
    }

}
