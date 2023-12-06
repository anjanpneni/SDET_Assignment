package Question1;

//Base class
class Account {
 protected double balance;
 protected double interest;

 public Account(double balance, double interest) {
     this.balance = balance;
     this.interest = interest;
 }

 public void calculateInterest() {
     double calculatedInterest = balance * interest / 100;
     System.out.println("Interest calculated: " + calculatedInterest);
     addToAccount(calculatedInterest);
 }

 protected void addToAccount(double amount) {
     balance += amount;
     System.out.println("Interest added to the account. Updated balance: " + balance);
 }
}

//Derived class - Saving Account
class SavingAccount extends Account {
 private double minimumBalance;

 public SavingAccount(double balance, double interest, double minimumBalance) {
     super(balance, interest);
     this.minimumBalance = minimumBalance;
 }

 // Overridden method from the base class
 @Override
 public void calculateInterest() {
     // Additional logic specific to Saving Account, if needed
     super.calculateInterest();
 }

 // Additional method specific to Saving Account
 public void setMinimumBalance(double minimumBalance) {
     this.minimumBalance = minimumBalance;
 }
}

//Derived class - Current Account
class CurrentAccount extends Account {
 private double overdraftLimit;

 public CurrentAccount(double balance, double interest, double overdraftLimit) {
     super(balance, interest);
     this.overdraftLimit = overdraftLimit;
 }

 // Overridden method from the base class
 @Override
 public void calculateInterest() {
     // Additional logic specific to Current Account, if needed
     super.calculateInterest();
 }

 // Additional method specific to Current Account
 public void setOverdraftLimit(double overdraftLimit) {
     this.overdraftLimit = overdraftLimit;
 }
}


