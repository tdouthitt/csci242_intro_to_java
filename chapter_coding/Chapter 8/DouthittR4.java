import java.util.ArrayList;
public class DouthittR4
{
    public static void main(String[] args)
    {
       
        
        
        
        
        
        ArrayList<String> temp = new ArrayList<String>();
        for (int i = 0; i < 10; i++)
        {
            String a = "";
            if (i == 0) 
            {
                a = "A";
            }
            if (i == 1) 
            {
                a = "B";
            }
            if (i == 2) 
            {
                a = "C";
            }
            if (i == 3) 
            {
                a = "D";
            }
            if (i == 4) 
            {
                a = "E";
            }
            if (i == 5) 
            {
                a = "F";
            }
            if (i == 6) 
            {
                a = "G";
            }
            if (i == 7) 
            {
                a = "H";
            }
            if (i == 8) 
            {
                a = "I";
            }
            if (i == 9) 
            {
                a = "J";
            }
            temp.add(a);
        }
        for (int x = 0; x < 10; x++)
        {
            String b = "";
            if (x == 0) 
            {
                b = temp.get(9);
            }
            if (x == 1) 
            {
                b = temp.get(8);
            }
            if (x == 2) 
            {
                b = temp.get(7);
            }
            if (x == 3) 
            {
                b = temp.get(6);
            }
            if (x == 4) 
            {
                b = temp.get(5);
            }
            if (x == 5) 
            {
                b = temp.get(4);
            }
            if (x == 6) 
            {
                b = temp.get(3);
            }
            if (x == 7) 
            {
                b = temp.get(2);
            }
            if (x == 8) 
            {
                b = temp.get(1);
            }
            if (x == 9) 
            {
                b = temp.get(0);
            }
            System.out.println(b);
        }
    }
    
}
            