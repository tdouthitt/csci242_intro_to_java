public class DouthittP1
{
    public static void main(String[] args)
    {
        BankAccount account = new BankAccount(5, 1000);
        try
        {
            BankAccount account1 = new BankAccount(23, -5);
        }
        catch(IllegalArgumentException exception)
       {
           exception.printStackTrace();
       }
        try
        {
            account.withdraw(-10);
        }
        catch(IllegalArgumentException exception1)
       {
           exception1.printStackTrace();
       }
       try
        {
            account.deposit(-10);
        }
        catch(IllegalArgumentException exception2)
       {
           exception2.printStackTrace();
       }
    }
}