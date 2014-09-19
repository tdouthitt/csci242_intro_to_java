
public class P3_1Tester
{
    public static void main(String[] args)
    {
        BankAccount taylorChecking = new BankAccount();
        taylorChecking.deposit(1000);
        taylorChecking.withdraw(500);
        taylorChecking.withdraw(400);
        taylorChecking.addInterest(10);
        System.out.println(taylorChecking.getBalance());
    }
}
