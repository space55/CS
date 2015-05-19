//Name: Eamonn Nugent
//Hangman Drawing Functions
//April 7th

import java.util.Scanner;
import TurtleGraphics.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class main
{
	public static void main(String[] args) throws Exception
	{
        boolean end = false;
        while (!end)
        {
            SketchPadWindow pad = new SketchPadWindow(900, 900);
            int relSize = 1;
            StandardPen pen = new StandardPen();
            input gInput = new input();
            check gCheck = new check();
            incorrect gInc = new incorrect();
            draw draw = new draw();
            getWord gW = new getWord();
            Scanner in = new Scanner(System.in);
            
            //Number of words: 349877
            
            String trophy [] = new String [10];
            BufferedReader tR = new BufferedReader(new FileReader("trophy.txt"));
            String read = tR.readLine();
            for (int counter = 0; counter < 10; counter++)
            {
                trophy[counter] = read;
                read = tR.readLine();
            }
            draw.drawNoose(pen, relSize);
            
            int incN = 0;
            String secretWord = gW.get();
            //System.out.println(secretWord);
            

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
                    System.out.println(used);
                }
                System.out.println();
                System.out.println();
                dashes = "";
                for (int counter = 0; counter < length; counter++)
                {
                    dashes += wordArray[counter];
                }
                System.out.println(dashes);
                char guessed = gInput.guess();
                System.out.println("\n");

                if (used.indexOf(guessed) != -1)
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
                        for (int counter = 0; counter < secretWord.length(); counter++)
                        {
                            if (secretWord.charAt(counter) == guessed)
                            {
                                wordArray[counter] = guessed;
                            }
                        }
                        used += guessed;
                    }
                }
                dashes = "";
                for (int counter = 0; counter < length; counter++)
                {
                    dashes += wordArray[counter];
                }
                if (dashes.equalsIgnoreCase(secretWord))
                {
                    for (int counter = 0; counter < 10; counter++)
                    {
                        System.out.println(trophy[counter]);
                    }
                    System.out.println("You've finished the game! Congratz! The word was: " + secretWord);
                    cont = false;
                }
            }
            System.out.println("Would you like to play again?");
            String again = in.nextLine();
            if (again.equalsIgnoreCase("no"))
            {
                System.exit(0);
            }
        }
	}
}