import java.util.Scanner;
public class DouthittR7
{
    public static void main(String[] args)
    {
        double[] a = new double[11];
        
        for(int i = 1; i < 11; i++)
        {
            a[i] = i;
            System.out.println(a[i]);
        }
        double[] mult = new double[12];
        for(int b = 0; b < 11; b++)
        {
            mult[b] = 2 * b;
            System.out.println(mult[b]);
        }
        double[] square = new double[11];
        for(int c = 1; c < 11; c++)
        {
            square[c] = Math.pow(c, 2);
            System.out.println(square[c]);
        }
          double[] zero = new double[10];
          for(int f = 0; f < 10; f++)
          {
                System.out.println(zero[f]);
          } 
            
            double[] rand = {1.0, 4.0, 9.0, 16.0, 9.0, 7.0, 4.0, 9.0, 11.0};
            for(int g = 0; g < 9; g++)
            {
            System.out.println(rand[g]);
            }
    }
}
        