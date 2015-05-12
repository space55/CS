//Eamonn Nugent
//Guess my word

import java.util.Scanner;

public class guessMyWordInClass
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String secretWord = "power";
        String guessedLetter = "";
        String dashes = "";
        int k = secretWord.length();
        int index = 0;
        
        for (int counter = 0; counter < secretWord.length(); counter++)
        {
            dashes += "-";
        }
        System.out.println(dashes);
        
        System.out.println("Please enter a letter");
        guessedLetter = scan.next();
        if (secretWord.indexOf(guessedLetter) != -1)
        {
            index = secretWord.indexOf(guessedLetter);
            dashes = dashes.substring(0, index) + guessedLetter + dashes.substring(index+1, secretWord.length());
        }
    }
}