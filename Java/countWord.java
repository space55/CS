//program that counts words

import java.util.Scanner;

public class countWord
{
	public static void main(String[] args)
	{
		int number=0;
		Scanner scan = new Scanner(System.in);
		String sentence = "";
		String y = "";
		
		System.out.println("Please enter a sentence");
		sentence = scan.nextLine();
		System.out.println(sentence);
		
		for(int x = 0; x < 4; x++)
		{
			y += sentence.substring(x, x + 1);
			if(y.equals(" "))
			{
				int i = sentence.indexOf(" ");
                
                y = sentence.substring(0, i);
                System.out.println(y);
			}
		}
		//number= number+1;
		//System.out.println("Number of words: " + number);
	}
}