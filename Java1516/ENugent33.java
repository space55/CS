//Eamonn Nugent
//Chapter 3 Project 3

import java.util.Scanner;

public class ENugent33
{
    public static void main(String[] args)
    {
        double pi = 3.141592653589793238462643383279;
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter mass (in kilos)");
        String massInput = in.nextLine();
        System.out.println("Please enter the velocity (in m/s)");
        String vInput = in.nextLine();
        double mass = 0;
        double vel = 0;
        try
        {
            mass = Double.parseDouble(massInput);
            vel = Double.parseDouble(vInput);
        }
        catch (Exception e)
        {
            System.out.println("Invalid input");
            System.exit(0);
        }
        double momentum = mass * vel;
        double ke = 0.5 * mass * vel * vel;
        System.out.println("Momentum:       " + momentum);
        System.out.println("Kinetic Energy: " + ke);
    }
}