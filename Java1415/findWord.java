//Eamonn Nugent
//Find word in sentence & remove

import java.util.Scanner;

public class findWord
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a sentence\n>> ");
        String sentence = in.nextLine();
        
        int k = sentence.length();
        String newSentence = "";
        
        System.out.println("Please select a word to remove\n>> ");
        String word = in.nextLine();
        int wleng = word.length();
    
        int x = sentence.indexOf(word);
        while (x != -1)
        {
            newSentence = sentence.substring(0, x) + sentence.substring(x+wleng+1, k);
            System.out.println(newSentence);
            break;
        }
        System.out.println(">> ");
    }
}