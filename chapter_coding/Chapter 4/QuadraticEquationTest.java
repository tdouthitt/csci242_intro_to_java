import java.util.Scanner;
public class QuadraticEquationTest
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
      
        System.out.print("Enter Value: ");
        double a = in.nextDouble();
        System.out.print("Enter Value: ");
        double b = in.nextDouble();
        System.out.print("Enter Value: ");
        double c = in.nextDouble();
        QuadraticEquation values = new QuadraticEquation(a, b, c);
        System.out.println(values.getSolution1());
        System.out.println(values.getSolution2());
    }
}