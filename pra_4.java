//This program is run by Dhruv Vekariya(21CE152)
public class pra_4 {
    SavingAccount savings = new SavingAccount();
    ChkAccount checking = new ChkAccount();
    Account account;

    public static void main(String[] args) {
        Account account = new Account(1122, 20000);

   System.out.print("After Creation,  " );
   System.out.println(account.getBalance());
   account.setAnnualInterestRate(4.5);
   System.out.print("After Withdrawal of $2,500,  " );
   account.withdraw(2500);
   System.out.println(account.getBalance());
   System.out.print("After Deposit of $3,000,  " );
   account.deposit(3000);
    System.out.println(account.getBalance());
    System.out.println("Balance is " + account.getBalance());
    System.out.println("Monthly interest is " + account.getMonthlyInterest());
    System.out.println("This account was created at " + account.getDateCreated());
    System.out.println("This program is run by Dhruv Vekariya(21CE152)");
    }
}
