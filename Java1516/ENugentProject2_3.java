//Eamonn Nugent
//Project 2-3

import java.util.Scanner;

public class ENugentProject2_3
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Kilometers: ");
        double start = in.nextDouble();
        double kd = 10000 / 90;
        double ka = kd / 60;
        double end = start / ka;
        System.out.println("Nautical Miles: " + end);
    }
}