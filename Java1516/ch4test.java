//Eamonn Nugent
//Chapter 4 Test

public class ch4test
{
    public static void main(String[] args)
    {
        int sum = 0;
        for (int counter = 0; counter < 101; counter++)
        {
            if (counter % 13 == 0)
            {
                sum += counter;
            }
        }
        System.out.println("Sum: " + sum);
    }
}