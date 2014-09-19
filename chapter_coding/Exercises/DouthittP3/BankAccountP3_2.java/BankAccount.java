

public class BankAccount
{
    public BankAccount()
    {
       
        balance = 0;
    }

  
    public BankAccount(double initialBalance)
    {
        balance = initialBalance;
    }
    public void deposit(double amount)
    {
        double newBalance = balance + amount;
        balance = newBalance;
    }
    public void withdraw(double amount)
    {
        double newBalance = balance - amount;
        balance = newBalance;
    }
    public double getBalance()
    {
        return balance; 
    }
    public void addInterest(double rate)
    {
        double newBalance = balance + (balance * (rate/100));
        balance = newBalance;
    }
    private double balance;
}
