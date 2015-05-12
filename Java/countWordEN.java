//Eamonn Nugent
//Counting Words

import java.util.Scanner;

public class countWordEN
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        //System.out.println("Please enter a sentence.");
        //String sentence = in.nextLine();
        
        String sentence = "This is my sentence";
        
        int numWords = 0;
        int lastSpace = 0;
        int checkDone = 0;
        boolean finish = false;
        for (int space = 0; !finish && space != -1 && lastSpace <= sentence.length();)
        {
            space = sentence.indexOf(" ", lastSpace+1);
            lastSpace = space;
            System.out.println("space: " + space);
            System.out.println("lastSpace: " + space);
            numWords++;
            if (checkDone == lastSpace)
            {
                finish = true;
            }
        }
        System.out.println("Number of Words: " + numWords);
    }
}