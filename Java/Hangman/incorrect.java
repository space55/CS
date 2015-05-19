//Eamonn Nugent
//Guess My Word Incorrect

import TurtleGraphics.*;

public class incorrect
{
    public static boolean incorrect(StandardPen pen, int relSize, int incorrectNumber)
    {
        int guessesLeft = 11-incorrectNumber;
        draw draw = new draw();
        boolean lose = false;
        if (incorrectNumber == 0)
        {
            draw.drawHead(pen, relSize);
        }
        if (incorrectNumber == 1)
        {
            draw.drawHeadEye1(pen, relSize);
        }
        if (incorrectNumber == 2)
        {
            draw.drawHeadEye2(pen, relSize);
        }
        if (incorrectNumber == 3)
        {
            draw.drawNose(pen, relSize);
        }
        if (incorrectNumber == 4)
        {
            draw.drawMouth(pen, relSize);
        }
        if (incorrectNumber == 5)
        {
            draw.drawTophat(pen, relSize);
        }
        if (incorrectNumber == 6)
        {
            draw.drawBody(pen, relSize);
        }
        if (incorrectNumber == 7)
        {
            draw.drawArmL(pen, relSize);
        }
        if (incorrectNumber == 8)
        {
            draw.drawArmR(pen, relSize);
        }
        if (incorrectNumber == 9)
        {
            draw.drawLegL(pen, relSize);
        }
        if (incorrectNumber == 10)
        {
            draw.drawLegR(pen, relSize);
            lose = true;
        }
        incorrectNumber++;
        return lose;
    }
}