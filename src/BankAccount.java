
public class BankAccount {
	private double balance;
    
    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }
    
    public void withdraw(double amount) {
        if (balance > amount) {
            balance -= amount;
        }
    }
    
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount(50.0);
        myAccount.withdraw(50.0);
        System.out.println("Remaining balance: " + myAccount.balance);
    }
}
