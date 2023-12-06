package Question1;

public class Test {
	 public static void main(String[] args) {
	     // Example usage
	     SavingAccount savingAccount = new SavingAccount(1000, 5, 200);
	     CurrentAccount currentAccount = new CurrentAccount(2000, 3, 500);

	     // Calculate interest and add to the accounts
	     savingAccount.calculateInterest();
	     currentAccount.calculateInterest();
	 }
	}