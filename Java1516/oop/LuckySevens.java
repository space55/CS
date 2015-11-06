//Eamonn Nugent
//Lucky Sevens

import java.util.Scanner;

public class LuckySevens
{
    public static void main(String[] args)
    {
        for (;;)
        {
            Dice a = new Dice();
            Dice b = new Dice();
            Scanner in = new Scanner(System.in);

            int rolls = 0;
            System.out.println("How much money do you have?");
            System.out.print(">> ");
            int money = in.nextInt();
            int maxDollars = money;
            int maxRolls = 0;
            while (money > 0)
            {
                int aSide = a.roll();
                int bSide = b.roll();
                if (aSide + bSide == 7)
                {
                    money += 4;
                }
                else
                {
                    money--;
                }
                if (money > maxDollars)
                {
                    maxDollars = money;
                    maxRolls = rolls;
                }
                rolls++;
            }

            System.out.println("You are broke after " + rolls + " rolls.");
            System.out.println("You should have quit after " + maxRolls + " rolls when you had $" + maxDollars);
        }
    }
}