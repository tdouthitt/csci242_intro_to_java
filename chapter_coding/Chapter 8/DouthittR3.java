import java.util.ArrayList;

public class DouthittR3
{
   public static void main(String[] args)
   {
       
       
       ArrayList<BankAccount> account = new ArrayList<BankAccount>();
       account.add(new BankAccount(1, 1000));
       account.add(new BankAccount(2, 2000));
       account.add(new BankAccount(3, 3000));
       account.add(new BankAccount(4, 4000));
       
       BankAccount max = account.get(0);
       BankAccount min = account.get(0);
       for (BankAccount temp : account)
       {
           if (temp.getBalance() > max.getBalance())
            max = temp;
            
           if (temp.getBalance() < min.getBalance())
            min = temp;
       }
       System.out.println(max.getAccountNumber() + " " + max.getBalance());
       System.out.println(min.getAccountNumber() + " " + min.getBalance());
       
   }
}