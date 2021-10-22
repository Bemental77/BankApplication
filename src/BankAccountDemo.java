public class BankAccountDemo {
    public static void main(String[] args) {
        int i;
        BankAccount x;

        //SavingsAccount creation
        SavingsAccount savingsAccount = new SavingsAccount(250);

        //FreeCheckingAccount creation
        FreeCheckingAccount freeCheckingAccount = new FreeCheckingAccount(500);

        //BusinessCheckingAccountCreation
        BusinessCheckingAccount businessCheckingAccount = new BusinessCheckingAccount(2000);

        //Display account balances
        System.out.println("Savings Account Balance: $" + savingsAccount.getBalance());
        System.out.println("Free Checking Account Balance: $" + freeCheckingAccount.getBalance());
        System.out.println("Business Checking Account Balance: $" + businessCheckingAccount.getBalance() + "\n");


        BankAccount[] accounts = new BankAccount[3];
        accounts[0] = savingsAccount;
        accounts[1] = freeCheckingAccount;
        accounts[2] = businessCheckingAccount;

        // iterating over an array
        for (i = 0; i < accounts.length; i++) {

            // accessing each element of array
            x = accounts[i];
            System.out.print(x.toString() + "\n");

        }
    }
}
