//This program is run by Dhruv Vekariya(21CE152)
public class ChkAccount extends Account {


    double overDraft = -1000;

    public void checking(double i) {

        //initializes double variable balance as 0.0
        double balance = 0.0;
        if (balance - i < overDraft){
            System.out.println("Failure: Can't overdraft more than            $1,000. A $25 +"
                    + "overdraft fee will be issued to your account. ");
            balance = balance - 25; }
        else
            balance = balance - i;
    }
}