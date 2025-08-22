package core;

public class AsciiArrayAZ {

	public static void main(String[] args)
	{
		char[] letters = new char[26];
		for(int i=0;i<26;i++)
		{
			letters[i] =(char) i;
		}
		for(int i =0;i< letters.length;i++)
		{
			System.out.println(letters[i]+"="+(int)letters[i]);
		}	
	}

}
