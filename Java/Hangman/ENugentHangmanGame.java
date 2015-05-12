//Name: Eamonn Nugent
//Hangman Drawing Functions
//April 7th

import java.util.Scanner;
import TurtleGraphics.*;

public class ENugentHangmanGame
{
	public static void main(String[] args) throws Exception
	{
        int relSize = 1;
        String secretWord = "power";
		StandardPen pen = new StandardPen();
		guessMyWordInput gInput = new guessMyWordInput();
        guessMyWordCheck gCheck = new guessMyWorcCheck();
        guessMyWordIncorrect gInc = new guessMyWordIncorrect();
        
        gInput.init(secretWord);
        gInc.init();
        char used [] = new char [26];
        
        while (cont)
        {
            char guessed = gInput.guess();
            
            boolean used = false;
            
            for (int counter = 0; counter < 26; counter++)
            {
                if (used[counter] == guessed)
                {
                    used = true;
                }
            }
            if (used)
            {
                System.out.println("You've already used that.");
            }
            else
            {
                int guessInt = (int) guessed - 97;
                
                boolean correct = gCheck.check(secretWord, guessed);
                if (!correct)
                {
                    gInc(pen, relSize);
                }
                if (correct)
                {
                    used[guessInt] = guessed;
                }
            }
        }
	}
}