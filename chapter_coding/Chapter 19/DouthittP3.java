import java.util.Scanner;


public class DouthittP3
{  
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      
      System.out.println("Enter smallest array size:");
      int n1 = in.nextInt();

      System.out.println("Enter largest array size:");
      int n2 = in.nextInt();

      System.out.println("Enter number of measurements (>=2):");
      int m = in.nextInt();

      for (int i = 0; i < m; i++)
      {  
         int n = n1 + i * (n2 - n1) / (m - 1);
         int[] a = ArrayUtil.randomIntArray(n, 100);

         
         StopWatch timer = new StopWatch();
         timer.start();
         SelectionSorter s = new SelectionSorter(a);
         s.sort();
         timer.stop();

         System.out.println("n:" + n + ". Elapsed time: "
               + timer.getElapsedTime() + " milliseconds");
      }
   }
}
