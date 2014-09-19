import java.util.Scanner;
public class PrimeNumberTester
{
   public static void main (String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.print("Enter ending number: ");
      int end = in.nextInt();

      PrimeGenerator prime = new PrimeGenerator();

      boolean done = false;
      while (!done)
      {
         int num = prime.nextPrime();
         if (num > end)
            done = true;
         else
            System.out.println(num);
      }
   }
}
