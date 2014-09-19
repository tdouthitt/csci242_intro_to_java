/**
   This program tests the merge sort algorithm by
   sorting an array that is filled with random numbers.
*/
public class DouthittP4
{  
   public static void main(String[] args)
   {  
      String[] a = {"moose", "Banjo", "ballin", "giggles", "Masochist", "apple"};
      
      MergeSorter sorter = new MergeSorter(a);
      sorter.sort();
      ArrayUtil.print1(a);
   }
}

