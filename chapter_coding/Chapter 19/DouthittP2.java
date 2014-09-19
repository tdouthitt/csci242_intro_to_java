/**
   This program tests the selection sort algorithm by
   sorting an array that is filled with random numbers.
*/
public class DouthittP2
{  
   public static void main(String[] args)
   { 
      Coin quarter = new Coin(.25, "Quarter");
      Coin dime = new Coin(.10, "Dime");
      Coin nickel = new Coin(.05, "Nickel");
      Coin penny = new Coin(.01, "Penny");
      Coin[] a = {nickel, dime, penny, quarter};
      

      SelectionCoinSorter sorter = new SelectionCoinSorter(a);
      sorter.sort();

      ArrayUtil.print2(a);
   }
}

   
