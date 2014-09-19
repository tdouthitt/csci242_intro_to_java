import java.util.Scanner;
public class QuadraticEquationTest
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
      
        System.out.print("Enter Value A: ");
        double a = in.nextDouble();
        System.out.print("Enter Value B: ");
        double b = in.nextDouble();
        System.out.print("Enter Value C: ");
        double c = in.nextDouble();
        QuadraticEquation values = new QuadraticEquation(a, b, c);
        
       if (values.getRoot() == 0 || values.getRoot() > 0)
       {
           System.out.println(values.getSolution1());
           System.out.println(values.getSolution2());
       }
       else System.out.println("There are no solutions");
        
          
           
       
    }
}