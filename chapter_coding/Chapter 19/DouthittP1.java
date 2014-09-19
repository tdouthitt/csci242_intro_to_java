/**
   This program tests the selection sort algorithm by
   sorting an array that is filled with random numbers.
*/
public class DouthittP1
{  
   public static void main(String[] args)
   {  
      int[] a = {1, 2, 3, 4, 5};
      

      SelectionSorter sorter = new SelectionSorter(a);
      sorter.sort();

      ArrayUtil.print(a);
   }
}

   
