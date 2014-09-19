import java.util.Scanner;


public class MonthTester
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      
      System.out.println("Enter Month");
      int month = in.nextInt();

      Month m = new Month(month);

      int days = m.days();

      if (days < 0)
         System.out.println("N/A");
      else
         System.out.println(days + " days");
   }
}

