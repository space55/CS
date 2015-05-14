//Name: Eamonn Nugent
//Hangman Drawing Functions
//April 7th

import java.util.Scanner;
import TurtleGraphics.*;

public class ENugentHangmanGame
{
	public static void main(String[] args) throws Exception
	{
        boolean end = false;
        while (!end)
        {
            int relSize = 1;
            String secretWord = "power";
            StandardPen pen = new StandardPen();
            guessMyWordInput gInput = new guessMyWordInput();
            guessMyWordCheck gCheck = new guessMyWordCheck();
            guessMyWordIncorrect gInc = new guessMyWordIncorrect();
            ENugentHangmanDraw draw = new ENugentHangmanDraw();
            draw.drawNoose(pen, relSize);
            Scanner in = new Scanner(System.in);
            int incN = 0;

            boolean cont = true;
            int length = secretWord.length();
            char wordArray [] = new char [length];
            String dashes = "";
            
            for (int counter = 0; counter < length; counter++)
            {
                wordArray[counter] = '-';
            }
            String used = "";

            while (cont)
            {
                dashes = "";
                for (int counter = 0; counter < length; counter++)
                {
                    dashes += wordArray[counter];
                }
                System.out.print("You've used: ");
                for (int counter = 0; counter < used.length()-1; counter++)
                {
                    System.out.print(used.charAt(counter) + ", ");
                }
                if (used.length() > 1)
                {
                    System.out.println(used.charAt(used.length()-1) + ".");
                }
                if (used.length() == 1)
                {
                    System.out.println()
                }
                System.out.println();
                System.out.println(dashes);
                char guessed = gInput.guess();
                System.out.println("\n");

                boolean letterUsed = false;

                if (used.indexOf(guessed) != -1)
                {
                    letterUsed = true;
                }
                if (letterUsed)
                {
                    System.out.println("You've already used that.");
                }
                else
                {
                    boolean correct = gCheck.check(guessed, secretWord);
                    if (!correct)
                    {
                        boolean lose = gInc.incorrect(pen, relSize, incN);
                        if (lose)
                        {
                            cont = false;
                            System.out.println("You've lost.");
                        }
                        else
                        {
                            used += guessed;
                            incN++;
                        }
                    }
                    if (correct)
                    {
                        int spot = secretWord.indexOf(guessed);
                        wordArray[spot] = guessed;
                    }
                }
                if (dashes.equalsIgnoreCase(secretWord))
                {
                    System.out.println("You've finished the game! Congratz!");
                    cont = false;
                }
                letterUsed = false;
            }
            System.out.println("Would you like to play again?");
            String again = in.nextLine();
            if (again.equalsIgnoreCase("no"))
            {
                end = true;
            }
        }
	}
}