//This program is run by Dhruv Vekariya(21CE152)
class Account {
    private int id = 0;
    public double balance = 500.0;
    private static double annualInterestRate = 7.0;
    public static double amount;

    private java.util.Date dateCreated;
    public Account() {
        dateCreated = new java.util.Date();
    }
    public Account(int id, double balace) {
        this();
        this.id = id;
        this.balance = balance;
    }
    public int getId() {
        return this.id;
    }
    public double getBalance() {
        return this.balance;
    }
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    public String getDateCreated() {
        return this.dateCreated.toString();
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public  void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    public double getMonthlyInterestRate() {
        return (annualInterestRate / 100) / 12 ;
    }
    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }
    public void withdraw(double amount) {
        this.balance -= amount;
    }
    public void deposit(double amount) {
        this.balance += amount;
    }
}