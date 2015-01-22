//Name: EamonnNugent
//Draw Box

import TurtleGraphics.*;

public class drawBoxFor
{
	public static void main(String[] args)
	{
		StandardPen pen = new StandardPen();
		pen.home();
		for (int counter = 0; counter <3; counter++)
		{
			pen.move(30);
			pen.turn(90);
		}
	}
}