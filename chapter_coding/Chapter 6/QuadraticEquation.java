public class QuadraticEquation
{
    public QuadraticEquation(double A, double B, double C)
    {
      a = A;
      b = B;
      c = C;
      root = Math.sqrt(b * b - (4 * a * c));
    }
    public double getSolution1()
    {
        return ((-b - root)  / (2 * a));
    } 
     public double getSolution2()
    {
        return ((-b + root)  / (2 * a));
    } 
    public double getRoot()
    {
        return root;
    }
    public boolean hasSolutions()
    {
        return root >0;
    }
   
    private double a;
    private double b;
    private double c;
    private double root;
   
    
}