//Eamonn Nugent
//Arrays

import java.util.Scanner;
import java.util.ArrayList;

public class ArraysInts
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        boolean finish = false;
        for (int counter = 0; !finish;)
        {
            System.out.println("Please enter a number. Type \"!\" when finished.");
            System.out.print(">> ");
            String localString = in.next();
            int localInt = 2;
            if (localString.indexOf("!") == -1)
            {
                boolean valid = true;
                try
                {
                    localInt = Integer.parseInt(localString);
                }
                catch (Exception e)
                {
                    System.out.println("Invalid input.");
                    valid = false;
                }
                if (valid)
                {
                    if (localInt % 2 == 0)
                    {
                        numbers.add(localInt);
                    }
                }
            }
            else
            {
                finish = true;
            }
        }
        
        for (int counter = 0; counter < numbers.size(); counter++)
        {
            System.out.println("Even number # " + (counter+1) + " is: " + numbers.get(counter));
        }
    }
}