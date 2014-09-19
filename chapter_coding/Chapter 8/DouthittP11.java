
public class DouthittP11
{  
   public static void main(String[] args)
   {  
      final int number = 10;
      final int permutation = 10;

      PermutationGenerator p = new PermutationGenerator();      
      
      for (int i = 0; i < permutation; i++)
      {  
         print(p.nextPermutation(number));
      }
   }

   public static void print(int[] a)
   {  
      for (int element : a)
         System.out.print(" " +  element);

      System.out.println();
   }   
}