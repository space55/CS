//Eamonn Nugent
//Chapter 4 Exercise # 2 Problem A

import java.util.Scanner;
import javax.swing.*;

public class Ch4Ex2_A
{
    public static void main(String[] args)
    {
        String id = JOptionPane.showInputDialog(null, "Salesperson's ID please?");
        String policiesS = JOptionPane.showInputDialog(null, "And now the number of policies, please.");
        double policies = 0;
        try
        {
            policies = Integer.parseInt(policiesS);
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Invalid input");
            System.exit(0);
        }
        if (policies > 24)
        {
            JOptionPane.showMessageDialog(null, "Salesperson's ID: " + id + "\nPolicies sold: " + policies);
        }
    }
}