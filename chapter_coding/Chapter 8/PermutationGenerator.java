import java.util.Random;
public class PermutationGenerator
{

   public PermutationGenerator()
   {
      generator = new Random();
   }
   public int[] nextPermutation(int a)
   {  
      int[] x = new int[a];
      for (int i = 0; i < a; i++) 
         x[i] = i + 1;
         
      int xSize = a;
      int[] y = new int[a];
      
      for (int i = 0; i < a; i++)
      {
         int pos = generator.nextInt(xSize);
         y[i] = x[pos];
         x[pos] = x[xSize - 1];
         xSize--;
      }
      return y;
   }
   
   private Random generator;
}