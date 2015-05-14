//Eamonn Nugent
//Guess my word

import java.util.Scanner;

public class guessMyWordCheck
{
    public static boolean check(char entered, String word)
    {
        boolean guessed = false;
        boolean correctLetter = false;
        int length = word.length();
        char wordArray [] = new char [length];
        for (int counter = 0; counter < length; counter++)
        {
            wordArray[counter] = '-';
        }
        boolean wordFinished = false;
        int lastPos = 0;
        while (!wordFinished)
        {
            if (word.indexOf(entered, lastPos) != -1)
            {
                int guessedPos = word.indexOf(entered);
                wordArray[guessedPos] = entered;
                lastPos = guessedPos+1;
                if (lastPos == length)
                {
                    wordFinished = true;
                }
                correctLetter = true;
            }
            else
            {
                wordFinished = true;
            }
        }
        return correctLetter;
    }
}