package inheritance.hierarchicalinheritance.bankaccounttypes;

public class SavingAccount extends BankAccount {
    int interestRate;

    public SavingAccount(long accountNumber, double bankBalance, int interestRate) {
        super(accountNumber, bankBalance);
        this.interestRate = interestRate;
    }

    public void displayaccount() {
        System.out.println("Account type is Saving Account");
    }

    @Override
    public void displayDetails() {
        displayaccount();
        super.displayDetails();
        System.out.println("Interest rate decided is :" + interestRate + " percent");
    }
}