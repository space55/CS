//Eamonn Nugent
//Chapter 4 Project 1

import java.util.Scanner;

public class ch4proj1
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num1 = in.nextInt();
        System.out.println("Please enter a second number");
        int num2 = in.nextInt();
        String output = "";
        if (num1 > num2)
        {
            output = num1 / num2 + " r" + num1 % num2;
        }
        
        else
        {
            output = num2 / num1 + " r" + num2 % num1;
        }
        
        System.out.println(output);
    }
}