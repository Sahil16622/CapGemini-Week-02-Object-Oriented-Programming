package interfaceabstractpoly.bankingsystem;

class CurrentAccount extends BankAccount implements Loanable {
    private static final double INTEREST_RATE = 0.01; // 1% interest rate
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, String holderName, double balance, double overdraftLimit) {
        super(accountNumber, holderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public double calculateInterest() {
        return getBalance() * INTEREST_RATE;
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Loan application submitted for amount: " + amount);
    }

    @Override
    public double calculateLoanEligibility() {
        return getBalance() * 5 + overdraftLimit; // Loan eligibility is balance * 5 + overdraft limit
    }

    // Overriding withdraw method to allow overdraft
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= getBalance() + overdraftLimit) {
            setBalance(getBalance() - amount);
            System.out.println(amount + " withdrawn. New balance: " + getBalance());
        } else {
            System.out.println("Invalid withdraw amount or exceeds overdraft limit.");
        }
    }
}
