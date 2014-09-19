public class PrimeGenerator
{
   public PrimeGenerator()
   {
      number = 1;
   }

   public int nextPrime()
   {
      do
      {
         number++;
      }
      while (!isPrime());

      return number;
   }

   public boolean isPrime()
   {
      if (number <= 1)
         return false;
      if (number > 2 && number % 2 == 0)
         return false;
      
      for (int x = 3; x * x <= number; x = x + 2)
         if (number % x == 0)
            return false;

      return true;
   }

   private int number;
}