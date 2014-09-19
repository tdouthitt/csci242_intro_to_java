/**
   This program tests the selection sort algorithm by
   sorting an array that is filled with random numbers.
*/
import java.util.ArrayList;
public class DouthittP7
{  
   public static void main(String[] args)
   { 
      Coin quarter = new Coin(.25, "Quarter");
      Coin dime = new Coin(.10, "Dime");
      Coin nickel = new Coin(.05, "Nickel");
      Coin penny = new Coin(.01, "Penny");
      ArrayList<Coin> a = new ArrayList<Coin>();
      a.add(quarter);
      a.add(nickel);
      a.add(penny);
      a.add(dime);
      

      SorterP19_7 sorter = new SorterP19_7(a);
      sorter.sort();

      ArrayUtil.print3(a);
   }
}

   
