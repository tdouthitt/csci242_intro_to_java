import java.util.ArrayList;
public class DouthittR6
{
    public static void main(String[] args)
    {
        double[] values = new double[4];
        values[0] = -1;
        values[1] = -2;
        values[2] = -3;
        values[3] = -4;
        
        double max = 0;
        int counter = 0;
        for (double x : values)
        {
            if(counter == 0) max = x;
            if (x > max) max = x;
            counter++;
        }
        System.out.println(max);
    }
    //The error would be it doesn't accept negative values
    //The fix would be to set max to the first value in the array
}
