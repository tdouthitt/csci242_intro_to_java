
public class Car
{
    public Car()
    {
       
        fuel = 0;
        efficiency = 0;
    }

  
    public Car(double initialEfficiency)
    {
        fuel = 0;
        efficiency = initialEfficiency;
    }
    public void addGas(double amount)
    {
        double newFuel = fuel + amount;
        fuel = newFuel;
    }
    public double getGas()
    {
        return fuel; 
    }
    public void drive(double amount)
    {
        double newFuel = fuel - (amount/efficiency);
        fuel = newFuel;
    }
    private double fuel;
    private double efficiency;
}
