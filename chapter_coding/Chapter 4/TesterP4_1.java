
public class TesterP4_1
{
    
       public static void main(String[] args)
       {
           
        CashRegister bank = new CashRegister();
        bank.recordPurchase(1.15);
        bank.enterDollars(5);
        System.out.println(bank.giveChange());
       }
    
}