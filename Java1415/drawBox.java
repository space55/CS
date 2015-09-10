//Name: EamonnNugent
//Draw Box

import TurtleGraphics.*;

public class drawBox
{
	public static void main(String[] args)
	{
		StandardPen pen = new StandardPen();
		pen.home();
		//Draw Square
		pen.move(30);
		pen.turn(90);
		pen.move(30);
		pen.turn(90);
		pen.move(30);
		pen.turn(90);
		pen.move(30);
		pen.turn(90);
		//Draw Triangle
		pen.up();
		pen.move(30);
		pen.down();
		pen.turn(45);
		pen.move(22);
		pen.turn(90);
		pen.move(21);
		//Draw Chimney
		pen.home();
		pen.up();
		pen.move(32);
		pen.turn(90);
		pen.move(3);
		pen.turn(270);
		pen.down();
		pen.move(15);
		pen.turn(90);
		pen.move(5);
		pen.turn(90);
		pen.move(9);
	}
}