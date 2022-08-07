//This program is run by Dhruv Vekariya(21CE152)
public class SavingAccount extends Account{
    double overdraftLimit = 0;

    public void withdraw (double w) {
        if (balance - w < overdraftLimit)
            System.out.println("Insufficient Funds");
        else
            balance = balance - w;
    }
}