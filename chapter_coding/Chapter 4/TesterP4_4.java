import java.util.Scanner;

public class TesterP4_4
{
   
    public static void main(String[] args)
       {
            Scanner in = new Scanner(System.in);
            
            
            System.out.print("Enter Value: ");
            double number1 = in.nextDouble();
            
            System.out.print("Enter Value: ");
            double number2 = in.nextDouble();
            
            Pair number = new Pair(number1, number2);
            
            System.out.println(number.getSum());
            System.out.println(number.getDifference());
            System.out.println(number.getProduct());
            System.out.println(number.getDistance());
            System.out.println(number.getMax());
            System.out.println(number.getMin());
            System.out.println(number.getAverage(2));
       }
    
}
        