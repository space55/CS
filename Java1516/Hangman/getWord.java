//Eamonn Nugent
//Get my word

import java.util.Random;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class getWord
{
    public static String get() throws Exception
    {
        BufferedReader br = new BufferedReader(new FileReader("words.txt"));
        String words[] = new String [349877];
        int totalWords = 0;
        for (int counter = 0; counter < 349877; counter++)
        {
            try
            {
                String localWord = br.readLine();
                if (localWord.indexOf('\'') == -1)
                {
                    words[counter] = localWord;
                    totalWords++;
                }
            }
            catch (Exception e)
            {
                counter = 349877;
            }
        }
        
        Random rand = new Random();
        int pick = rand.nextInt(totalWords);
        return words[pick];
    }
}