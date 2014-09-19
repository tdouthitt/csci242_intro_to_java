public class Sentence
{
	public Sentence()
	{
		
	}
	public void reverse(String phrase)
	{
		
		if(phrase.length() == 1)
		{
			System.out.print(phrase);
		}
		else
		{
			
			reverse(phrase.substring(phrase.length() - 1, phrase.length()));
			reverse(phrase.substring(0, phrase.length() - 1));
		
		}

	}
	public String getText()
	{
		return phrase;
	}
	private String phrase;
	private int length;
}