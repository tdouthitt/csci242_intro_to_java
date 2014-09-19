import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;
import java.awt.Color;
import java.util.ArrayList;
import info.gridworld.grid.Grid;
public class SorterP19_7
{
   
   public SorterP19_7(ArrayList<Actor> anArrayList)
   {
      a = anArrayList;
   }

   
   public void sort()
   {  
      for (int i = 0; i < a.size() - 1; i++)
      {  
         int minPos = minPosition(i);
         swap(minPos, i);
      }
   }

  
   private int minPosition(int from)
   {  
      int minPos = from;
      for (int i = from + 1; i < a.size(); i++)
         if (a.get(i).getValue().equals(a.get(minPos).getValue())) minPos = i;
      return minPos;
   }

  
   private void swap(int i, int j)
   {
      Coin temp = a.get(i);
      a.set(i, a.get(j));
      a.set(j, temp);
   }

   private ArrayList<Actor> a;
}
