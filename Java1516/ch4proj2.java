//Eamonn Nugent
//Chapter 4 Project 2

import java.util.Scanner;

public class ch4proj2
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a side of the triangle");
        int a = in.nextInt();
        System.out.println("Please enter a side of the triangle");
        int b = in.nextInt();
        System.out.println("Please enter a side of the triangle");
        int c = in.nextInt();
        boolean right = false;
        if (c * c == a * a + b * b)
        {
            right = true;
        }
        else if (b * b == a * a + c * c)
        {
            right = true;
        }
        else if (a * a == c * c + b * b)
        {
            right = true;
        }
        if (right)
        {
            System.out.println("It's a right triangle.");
        }
        else
        {
            System.out.println("It isn't a right triangle.");
        }
    }
}