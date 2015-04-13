//Name: Eamonn Nugent
//Hangman Drawing Functions
//April 7th

import java.util.Scanner;
import TurtleGraphics.*;

public class ENugentHangmanGame
{
	public static void main(String[] args) throws Exception
	{
		ENugentHangmanDraw draw = new ENugentHangmanDraw();
		StandardPen pen = new StandardPen();
		Scanner in = new Scanner(System.in);
		
		String word = "cat";
		int wleng = word.length();
		
		String letter[] = new String[wleng];
		for (int counter = 0; counter < wleng; counter++)
		{
			letter[counter] word.charAt(counter);
		}
		
		System.out.println("Please guess a letter");
		String guess = in.next();
		int gleng = guess.length();
		
		for (int counter = 0; counter < gleng; counter++)
		{
			for (int counter = 0; counter < 
			if (guess.charAt(counter) == letter[counter]
		}
		
		int relSize = 1;
		
		draw.drawNoose(pen, relSize);
		Thread.sleep(1000);
		draw.drawHeadLoc(pen, relSize);
		Thread.sleep(1000);
		draw.drawHeadEye(1, pen, relSize);
		Thread.sleep(1000);
		draw.drawHeadEye(2, pen, relSize);
		Thread.sleep(1000);
		draw.drawNoseLoc(pen, relSize);
		Thread.sleep(1000);
		draw.drawMouthLoc(pen, relSize);
		Thread.sleep(1000);
		draw.drawTophat(pen, relSize);
		Thread.sleep(1000);
		draw.drawBody(pen, relSize);
		Thread.sleep(1000);
		draw.drawMoustache(pen, relSize);
	}
}