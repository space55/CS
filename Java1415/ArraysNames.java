//Eamonn Nugent
//Arrays

import java.util.Scanner;
import java.util.ArrayList;

public class ArraysNames
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<String>();
        boolean finish = false;
        for (int counter = 0; !finish; counter++)
        {
            System.out.println("Please enter friend # " + (counter+1) + ". Type \"!\" when finished.");
            String localName = in.next();
            if (localName.indexOf("!") == -1)
            {
                names.add(localName);
            }
            else
            {
                finish = true;
            }
        }
        
        for (int counter = 0; counter < names.size(); counter++)
        {
            System.out.println("Friend # " + (counter+1) + " is named: " + names.get(counter));
        }
    }
}