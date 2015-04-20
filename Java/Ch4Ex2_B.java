//Eamonn Nugent
//Chapter 4 Exercise 2 Problem B

import java.util.Scanner;
import javax.swing.*;

public class Ch4Ex2_B
{
    public static void main(String[] args)
    {
        boolean moreValue = true;
        int iterations = 1000;
        int timeThrough = 0;
        String idS[] = new String [iterations];
        int id[] = new int [iterations];
        String policiesS[] = new String [iterations];
        int policies[] = new int [iterations];
        
        JOptionPane.showMessageDialog(null, "Hello! When you're done inputting values, please enter \"done\", got it?");
        
        for (timeThrough = 0; moreValue && timeThrough < iterations; timeThrough++;)
        {
            idS[timeThrough] = JOptionPane.showInputDialog(null, "ID please.");
            policiesS[timeThrough] = JOptionPane.showInputDialog(null, "How many policies did they sell?");
            
            try
            {
                if (policiesS[timeThrough].equalsIgnoreCase("done") || idS[timeThrough].equalsIgnoreCase("done"))
                {
                    moreValue = false;
                }
                else
                {
                    policies[timeThrough] = Integer.parseInt(policiesS[timeThrough]);
                    id[timeThrough] = Integer.parseInt(idS[timeThrough]);
                }
            }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, "One of your inputs was invalid.");
                timeThrough--;
            }
        }
        
        JOptionPane.showMessageDialog(null, "Please excuse the printing to the console.");
        
        for (int counter = 0; counter <= timeThrough; counter++)
        {
            if (id[counter] > 24)
            {
                System.out.println("ID: " + id[counter]);
                System.out.println("Policies Sold: " + id[counter]);
                System.out.println();
            }
            else
            {
                System.out.println("Salesperson with ID " + id[counter] + " was not a high performer.");
                System.out.println();
            }
        }
    }
}