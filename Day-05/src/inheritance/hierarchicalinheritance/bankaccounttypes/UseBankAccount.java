package inheritance.hierarchicalinheritance.bankaccounttypes;

public class UseBankAccount{
    public static void main(String[] args) {
        BankAccount ba = new BankAccount(2321414, 36245786584.00);
        ba.displayDetails();
        System.out.println();
        ba = new SavingAccount(12376756, 63765735.00, 24);
        ba.displayDetails();
        System.out.println();
        ba = new CheckingAccount(12343253, 76876768.00, 656753.00);
        ba.displayDetails();
        System.out.println();
        ba = new FixedDepositAccount(232222243, 87600900.00, 5);
        ba.displayDetails();
    }
}