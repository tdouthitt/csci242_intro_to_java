/**
   This class sorts an array, using the selection sort 
   algorithm
*/
public class SelectionCoinSorter
{
   /**
      Constructs a selection sorter.
      @param anArray the array to sort
   */
   public SelectionCoinSorter(Coin[] anArray)
   {
      a = anArray;
   }

   /**
      Sorts the array managed by this selection sorter.
   */
   public void sort()
   {  
      for (int i = 0; i < a.length - 1; i++)
      {  
         int minPos = minPosition(i);
         swap(minPos, i);
      }
   }

   /**
      Finds the smallest element in a tail range of the array.
      @param from the first position in a to compare
      @return the position of the smallest element in the
      range a[from] . . . a[a.length - 1]
   */
   private int minPosition(int from)
   {  
      int minPos = from;
      for (int i = from + 1; i < a.length; i++)
         if (a[i].getValue() < a[minPos].getValue()) minPos = i;
      return minPos;
   }

   /**
      Swaps two entries of the array.
      @param i the first position to swap
      @param j the second position to swap
   */
   private void swap(int i, int j)
   {
      Coin temp = a[i];
      a[i] = a[j];
      a[j] = temp;
   }

   private Coin[] a;
}
