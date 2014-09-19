import java.util.Random;
public class DouthittR8
{
    public static void main(String[] args)
    {
        int[] temp = new int[10];
        int n = 100;
        for(int i = 0; i < 10; i++)
        {
            Random random = new Random();
            
            temp[i] = random.nextInt(n) + 1;
            System.out.println(temp[i]);
        }
        
    }
}