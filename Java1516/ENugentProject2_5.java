//Eamonn Nugent
//Project 2-5

import java.util.Scanner;

public class ENugentProject2_5
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Mass (in kilos): ");
        double mass = in.nextDouble();
        System.out.print("Velocity (in m/s): ");
        double vel = in.nextDouble();
        double momentum = mass * vel;
        System.out.println("Momentum: " + momentum);
    }
}