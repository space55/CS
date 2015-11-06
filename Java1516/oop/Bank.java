//Eamonn Nugent
//Bank Account Main

import java.util.Scanner;

public class Bank
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("What is your name?");
        System.out.print(">> ");
        BankUser bu1 = new BankUser(in.nextLine());
        for (;;)
        {
            System.out.println("Would you like to deposit, withdraw, or view your balance?");
            System.out.print(">> ");
            String action = in.nextLine();
            action = action.toLowerCase();
            if (action.contains("depo"))
            {
                System.out.println("How much would you like to deposit?");
                System.out.print(">> ");
                String amtS = in.nextLine();
                int amt = Integer.parseInt(amtS);
                bu1.dep(amt);
            }
            else if (action.contains("with"))
            {
                System.out.println("How much would you like to withdraw?");
                System.out.print(">> ");
                String amtS = in.nextLine();
                int amt = Integer.parseInt(amtS);
                bu1.wd(amt);
            }
            else if (action.contains("bal"))
            {
                System.out.println("The account under the name " + bu1.getName() + " has a balance of " + bu1.getBal());
            }
            else
            {
                System.out.println("Quitting. See you later!");
                System.exit(0);
            }
        }
    }
}