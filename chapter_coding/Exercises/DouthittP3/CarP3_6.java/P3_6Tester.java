
public class P3_6Tester
{
    public static void main(String[] args)
    {
        Car van = new Car(20);
        van.addGas(35);
        van.drive(100);
        System.out.println(van.getGas());
    }
}