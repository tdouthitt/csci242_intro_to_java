public class Employee
{
    public Employee()
    {
       
        salary = 0;
        name = new String();
    }

  
    public Employee(String initialName, double initialSalary)
    {
        salary = initialSalary;
        name = initialName;
    }
   
    public double getSalary()
    {
        return salary; 
    }
    public String getName()
    {
        return name; 
    }
    private double salary;
    private String name;
}
