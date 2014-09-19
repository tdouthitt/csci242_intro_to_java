

public class Pair
{   
    public Pair(double aFirst, double aSecond)
    {
       number1 = aFirst;
       number2 = aSecond;
      
    }
    public double getSum()
    {
       return (number1 + number2);
       
    }
     public double getDifference()
    {
       return (number1 - number2);
       
    }
     public double getProduct()
    {
       return (number1 * number2);
       
    }
     public double getAverage(double amount)
    {
       return ((number1 + number2)/(amount));
       
    }
     public double getDistance()
    {
       return (Math.abs(number1 - number2));
       
    }
     public double getMax()
    {
       if (number1 > number2)
       {
           number3 = number1;
       }
       if (number1 < number2)
       {
           number3 = number2;
       }    
       return number3;
    }
    public double getMin()
    {
       if (number1 > number2)
       {
           number3 = number2;
       }
       if (number1 < number2)
       {
           number3 = number1;
       }    
       return number3;
    }
    
    private double number1;
    private double number2;
    private double number3;
    
       
}