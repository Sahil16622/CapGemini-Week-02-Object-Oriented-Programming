package inheritance.hierarchicalinheritance.bankaccounttypes;

public class FixedDepositAccount extends BankAccount {

    int timeDuration;

    public FixedDepositAccount(long accountNumber, double bankBalance, int timeDuration) {
        super(accountNumber, bankBalance);
        this.timeDuration = timeDuration;
    }

    public void displayAccountType() {
        System.out.println("Account Type is Fixed deposit Account");
    }

    @Override
    public void displayDetails() {
        displayAccountType();
        super.displayDetails();
        System.out.println("Time duration of fixed deposit is: " + timeDuration + " years");
    }
}
