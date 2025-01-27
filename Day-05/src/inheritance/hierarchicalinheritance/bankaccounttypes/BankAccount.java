package inheritance.hierarchicalinheritance.bankaccounttypes;

public class BankAccount {
    protected long accountNumber;
    protected double bankBalance;

    public BankAccount(long accountNumber, double bankBalance) {
        this.accountNumber = accountNumber;
        this.bankBalance = bankBalance;
    }

    public void displayDetails() {
        System.out.println("Account number = " + accountNumber);
        System.out.println("Bank balance = " + bankBalance);
    }
}
