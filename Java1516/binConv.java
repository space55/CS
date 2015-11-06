//Eamonn Nugent
//Binary Converter

import java.util.Scanner;

public class binConv
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String input = "";
        System.out.println("Please enter something to convert. Detection of type will be automatic");
        input = in.nextLine();
        input.toLowerCase();
        boolean binary = true;
        for (int counter = 2; counter < 10; counter++)
        {
            if (input.contains(counter))
            {
                binary = false;
            }
        }
        
        for (int counter = 0; counter < 26; counter++)
        {
            if (input.contains((char) counter + 65))
            {
                binary = false;
            }
        }
        
        if (binary)
        {
            for (int counter = 0; counter < 8; counter++)
            {
                if (input.charAt(counter) == '1')
                {
                    outputBinary += Math.pow(2, counter);
                }
            }
            int outputBinary = 0;
            System.out.println(outputBinary);
        }
        
        else
        {
            
        }
    }
}