package inheritance.hierarchicalinheritance.bankaccounttypes;

public class CheckingAccount extends BankAccount {

    double withdrawlAmount;

    public CheckingAccount(long accountNumber, double bankBalance, double withdrawlAmount) {
        super(accountNumber, bankBalance);
        this.withdrawlAmount = withdrawlAmount;
    }

    public void displayAccounttype() {
        System.out.println("Account type is Checking Account");
    }

    @Override
    public void displayDetails() {
        displayAccounttype();
        super.displayDetails();
        System.out.println("Withdrawal Ammount is: " + withdrawlAmount);
    }
}