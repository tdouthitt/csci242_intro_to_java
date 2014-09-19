import java.util.ArrayList;
import java. util.Comparator;
import java.util.Collections;
/**
 * Write a description of class DouthittP13 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DouthittP13
{
    public static void main(String[] args)
    {
        ArrayList<String> a = new ArrayList<String>();
        a.add("Balls");
        a.add("To");
        a.add("The");
        a.add("Walls");
    
        class StringComparator implements Comparator<String>
        {
            public int compare(String x, String y)
            {
                String first = x;
                String second = y;
                if (first.length() < second.length()) return -1;
                if (first.length() == second.length()) return 0;
                return 1;
            }
        }
        Collections.sort(a, new StringComparator());
        System.out.println(a);
    }
}

        