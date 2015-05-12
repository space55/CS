//Eamonn Nugent
//Guess my word

import java.util.Scanner;

public class guessMyWord
{
    public static boolean check(char input, String word)
    {
        Scanner in = new Scanner(System.in);
        boolean guessed = false;
        boolean correctLetter = false;
        char wordArray [] = new char [length];
        for (int counter = 0; counter < length; counter++)
        {
            wordArray[counter] = '-';
        }
        while (!guessed)
        {
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
            String fullArray = "";
            for (int counter = 0; counter < length; counter++)
            {
                fullArray += wordArray[counter];
            }
            if (fullArray.equalsIgnoreCase(word))
            {
                guessed = true;
            }
        }
        System.out.println("You've figured out the word!");
    }
}