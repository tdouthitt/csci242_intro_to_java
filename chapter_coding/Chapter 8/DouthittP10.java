import java.util.Random;
public class DouthittP10
{
    public static void main(String[] args)
    {
        int[] temp = new int[10];
        int n = 100;
        int sum = 0;
        for(int i = 0; i < 10; i++)
        {
            Random random = new Random();
            temp[i] = random.nextInt(n) + 1;
            System.out.println(temp[i]);
           
            if(temp[i] % 2 == 0) sum = sum - temp[i];
            if(temp[i] % 2 == 1) sum = sum + temp[i];
        }
         System.out.println("Sum: " + sum);
    }
}