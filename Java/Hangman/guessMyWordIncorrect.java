//Eamonn Nugent
//Guess My Word Incorrect

import TurtleGraphics.*;

public class guessMyWordIncorrect
{
    int incorrectNumber;
    int guessesLeft;
    int ret[] = new int [2];
    public static void init()
    {
        int incorrectNumber = 0;
        int guessesLeft = 12;
        ret[0] = incorrectNumber;
        ret[1] = guessesLeft;
    }
    
    public static int[] incorrect(StandardPen pen, int relSize)
    {
        incorrectNumber++;
        ret[0] = incorrectNumber;
        ret[1] = guessesLeft;
        if (incorrectNumber == 0)
        {
            drawNoose(pen, relSize);
        }
        if (incorrectNumber == 1)
        {
            drawHead(pen, relSize);
        }
        if (incorrectNumber == 2)
        {
            drawEye(pen, relSize);
        }
        if (incorrectNumber == 3)
        {
            drawEye(pen, relSize);
        }
        if (incorrectNumber == 4)
        {
            drawNose(pen, relSize);
        }
        if (incorrectNumber == 5)
        {
            drawMouth(pen, relSize);
        }
        if (incorrectNumber == 6)
        {
            drawTophat(pen, relSize);
        }
        if (incorrectNumber == 7)
        {
            drawBody(pen, relSize);
        }
        if (incorrectNumber == 8)
        {
            drawArmL(pen, relSize);
        }
        if (incorrectNumber == 9)
        {
            drawArmR(pen, relSize);
        }
        if (incorrectNumber == 10)
        {
            drawLegL(pen, relSize);
        }
        if (incorrectNumber == 11)
        {
            drawLegR(pen, relSize);
        }
        return ret[];
    }
}