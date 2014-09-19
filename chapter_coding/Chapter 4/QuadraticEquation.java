public class QuadraticEquation
{
    public QuadraticEquation(double A, double B, double C)
    {
      a = A;
      b = B;
      c = C;
    }
    public double getSolution1()
    {
        return ((-b - Math.sqrt(b * b - (4 * a * c)))  / (2 * a));
    } 
     public double getSolution2()
    {
        return ((-b + Math.sqrt(b * b - (4 * a * c)))  / (2 * a));
    } 
   
    private double a;
    private double b;
    private double c;
   
    
}