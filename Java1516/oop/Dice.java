//Eamonn Nugent
//Dice Class

import java.util.Random;

public class Dice
{
    Random rand = new Random();
    private int side;
    public Dice()
    {
        side = rand.nextInt(6) + 1;
    }
    
    public int getSide()
    {
        return side;
    }
    
    public int roll()
    {
        side = rand.nextInt(6) + 1;
        return side;
    }
}