//This program is run by Dhruv Vekariya(21CE152)
public class pra_2 {
    public static void main(String[] args) {
        Account account = new Account(152, 20000);
        account.setAnnualInterestRate(4.0);
        account.withdraw(2500.0);
        account.deposit(3000.0);
        System.out.println("Balance: $" + account.getId());
        System.out.println("Balance: $" + account.getBalance());
        System.out.println("Monthly Interest: " + account.getMonthlyInterest());
        System.out.println("Annual Interest: " + account.getAnnualInterestRate());
        System.out.println("Date Created: " + account.getDateCreated());
        System.out.println("This program is run by Dhruv Vekariya(21CE152)");
    }
}