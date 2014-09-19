public class SodaCan
{
    public SodaCan()
    {
        height = 0;
        radius = 0;
    }
        public SodaCan(double initialHeight, double initialRadius)
    {
        height = initialHeight;
        radius = initialRadius;
    }
    public double getSurfaceArea()
    {
        double area = ((2 * Math.PI * radius) + (2 * (Math.PI * (radius * radius))));
        return area;
    }
    public double getVolume()
    {
        double volume = (((Math.PI) * (radius * radius)) * height);
        return volume;
    }
    private double height;
    private double radius;
}
