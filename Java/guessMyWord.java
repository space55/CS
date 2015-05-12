//Eamonn Nugent
//Guess my word

import java.util.Scanner;

public class guessMyWord
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String word = "power";
        boolean guessed = false;
        int length = word.length();
        char wordArray [] = new char [length];
        for (int counter = 0; counter < length; counter++)
        {
            wordArray[counter] = '-';
        }
        while (!guessed)
        {
            clearConsole();
            for (int counter = 0; counter < length; counter++)
            {
                System.out.print(wordArray[counter]);
            }
            System.out.println();
            System.out.println("Guess a letter");
            System.out.print(">> ");
            String input = in.next();
            input.toLowerCase();
            char entered = 'e';
            boolean charValid = false;
            
            try
            {
                entered = input.charAt(0);
                charValid = true;
            }
            catch (Exception e)
            {
                System.out.println("Invalid input");
            }
            
            if (charValid)
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
                if (fullArray.equalsIgnoreCase())
                {
                    guessed = true;
                }
            }
        }
        System.out.println("You've guessed the word!");
    }
    
    
    protected final static void clearConsole()
    {
        try
        {
            final String os = System.getProperty("os.name");
            
            if (os.contains("Windows"))
            {
                Runtime.getRuntime().exec("cls");
            }
            else
            {
                Runtime.getRuntime().exec("clear");
            }
        }
        catch (final Exception e)
        {
            System.out.println("Well then. You appear to be running Linux or have corrupted this program. Congratz!");
        }
    }
}