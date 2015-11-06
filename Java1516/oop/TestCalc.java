//Eamonn Nugent
//Testcalc

import java.util.Scanner;

public class TestCalc
{
    public static void main(String[] args)
    {
        Calc calc = new Calc();
        Scanner in = new Scanner(System.in);
        
        //System.out.println("What operator would you like to use?");
        //String input = in.next();
        int[] nums = new int[2];
        nums = getNum(in);
        
        calc.add(nums[0], nums[1]);
        int n = calc.get();
        System.out.println(n);
        calc.sub(nums[0], nums[1]);
        n = calc.get();
        System.out.println(n);
        calc.mult(nums[0], nums[1]);
        n = calc.get();
        System.out.println(n);
        calc.div(nums[0], nums[1]);
        n = calc.get();
        System.out.println(n);
        calc.mod(nums[0], nums[1]);
        n = calc.get();
        System.out.println(n);
        
        /*
        if (input.contains("add"))
        {
            int[] nums = getNum(in);
            calc.add(nums[0], nums[1]);
            int n = calc.get();
            System.out.println(n);
        }
        
        if (input.contains("sub"))
        {
            int[] nums = getNum(in);
            calc.sub(nums[0], nums[1]);
            int n = calc.get();
            System.out.println(n);
        }
        
        if (input.contains("mult"))
        {
            int[] nums = getNum(in);
            calc.mult(nums[0], nums[1]);
            int n = calc.get();
            System.out.println(n);
        }
        
        if (input.contains("div"))
        {
            int[] nums = getNum(in);
            calc.div(nums[0], nums[1]);
            int n = calc.get();
            System.out.println(n);
        }
        
        if (input.contains("mod"))
        {
            int[] nums = getNum(in);
            calc.mod(nums[0], nums[1]);
            int n = calc.get();
            System.out.println(n);
        }*/
        in.close();
    }
    
    public static int[] getNum(Scanner in)
    {
        int[] ret = new int[2];
        System.out.println("Please enter number 1");
        String n1 = in.next();
        ret[0] = Integer.parseInt(n1);
        System.out.println("Please enter number 2");
        String n2 = in.next();
        ret[1] = Integer.parseInt(n2);
        return ret;
    }
}