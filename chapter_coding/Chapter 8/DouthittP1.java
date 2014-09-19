
 public class DouthittP1
{  
   public static void main(String[] args)
   {
      Bank bank = new Bank();

      int aAccount = 0;
      int bAccount = 1;
      int cAccount = 2;
      int dAccount = 3;

      bank.addAccount(aAccount, 1000);
      bank.addAccount(bAccount, 2000);
      bank.addAccount(cAccount, 3000);
      bank.addAccount(dAccount, 10000);
      
      bank.deposit(aAccount, 200);
      bank.withdraw(bAccount, 500);
      bank.deposit(cAccount, 1000);
      bank.withdraw(dAccount, 7000);
      
      System.out.println(
         "aAccount Balance: " + bank.getBalance(aAccount));
      System.out.println(
         "bAccount Balance: " + bank.getBalance(bAccount));
      System.out.println(
         "cAccount Balance: " + bank.getBalance(cAccount));
      System.out.println(
         "dAccount Balance: " + bank.getBalance(dAccount));
   }
}