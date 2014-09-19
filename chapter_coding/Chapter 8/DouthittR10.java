public class DouthittR10
{
    public static void main(String[] args)
    {
        int[] square = new int[20];
        for(int c = 1; c < 11; c++)
        {
            square[c] = (int)Math.pow(c, 2);
            System.out.println(square[c]);
        }
    }
}
//The contents of the other elements are zero's