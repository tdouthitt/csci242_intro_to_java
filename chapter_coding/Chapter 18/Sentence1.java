public class Sentence1
{
    public Sentence1()
    {
    }
    public void reverse(String phrase)
    {
        for(int a = phrase.length() - 1; a >= 0; a--)
        {
            System.out.print(phrase.substring(a, a + 1));
			
        }
    }
}
            