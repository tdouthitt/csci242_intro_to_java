
public class TesterP4_2
{
    public static void main(String[] args)
    {   
        CashRegister register = new CashRegister();
        register.recordPurchase(5.12);
        register.recordPurchase(6.78);
        register.recordPurchase(9.10);
        System.out.println(register.getItemCount());
        
    }
}