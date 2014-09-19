public class DataSetTester11_5
{
    public static void main(String[] args)
    {
        Measurer m = new PersonMeasurer();
        DataSet data = new DataSet(m);
        
        data.add(new Person("Homie", 182.23));
        data.add(new Person("Man", 175.54));
        data.add(new Person("Dude", 176.76));
        
        System.out.println("Average height = " + data.getAverage());
        Person max = (Person) data.getMaximum();
        System.out.println("The Tallest person is " + max.getName());
        Person min = (Person) data.getMinimum();
        System.out.println("The shortest person is " + min.getName());
    }
}