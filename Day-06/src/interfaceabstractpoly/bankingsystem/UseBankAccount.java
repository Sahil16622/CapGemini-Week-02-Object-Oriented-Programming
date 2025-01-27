package interfaceabstractpoly.bankingsystem;

public class UseBankAccount {
    public static void main(String[] args) {
        // Create accounts
        BankAccount savingsAccount = new SavingsAccount("SA123", "John Doe", 5000);
        BankAccount currentAccount = new CurrentAccount("CA456", "Jane Smith", 10000, 2000);

        // Process accounts
        processAccount(savingsAccount);
        System.out.println("-----------------------------");
        processAccount(currentAccount);
    }

    // Method to process account details
    public static void processAccount(BankAccount account) {
        account.displayAccountDetails();
        System.out.println("Interest: " + account.calculateInterest());

        if (account instanceof Loanable) {
            Loanable loanable = (Loanable) account;
            loanable.applyForLoan(20000);
            System.out.println("Loan Eligibility: " + loanable.calculateLoanEligibility());
        }

        System.out.println("Performing transactions...");
        account.deposit(2000);
        account.withdraw(3000);
        account.withdraw(12000); // Test overdraft for CurrentAccount
    }
}

