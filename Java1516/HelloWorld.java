//Eamonn Nugent
//Hello World (w/ method)

public class HelloWorld
{
    static IO io = new IO("HelloWorld");
    static arithmetic arith = new arithmetic();
    
	public static void main(String[] args)
	{
		helloWorld();
        String name = askName();
        stateName(name);
        doMath();
	}
	
	protected static void helloWorld()
	{
		io.print("This is a program written by Eamonn Nugent");
		io.print("Hello World!");
	}
    
    protected static String askName()
    {
        io.print("What is your name?");
        String name = io.read();
        return name;
    }
    
    protected static void stateName(String name)
    {
        io.print("Hello there, " + name + "!");
    }
    
    protected static void doMath()
    {
        //io.print("Would you like to add, subtract, multiply, or divide?");
        //String type = io.read();
        double x = askDouble();
        double y = askDouble();
        double add = arith.add(x, y);
        io.print(add);
        double sub = arith.subtract(x, y);
        io.print(sub);
        double mult = arith.multiply(x, y);
        io.print(mult);
        double div = arith.divide(x, y);
        io.print(div);
        /*
        if (type.equalsIgnoreCase("add"))
        {
            double x = arith.add(askDouble(), askDouble());
            io.print(x);
        }
        else if (type.contains("sub") || type.contains("subtract"))
        {
            double x = arith.subtract(askDouble(), askDouble());
            io.print(x);
        }
        else if (type.contains("mult") || type.contains("multiply"))
        {
            double x = arith.multiply(askDouble(), askDouble());
            io.print(x);
        }
        else if (type.contains("div") || type.contains("divide"))
        {
            double x = arith.divide(askDouble(), askDouble());
            io.print(x);
        }*/
    }
    
    protected static int askInt()
    {
        io.print("Please enter a number");
        return Integer.parseInt(io.read());
    }
    
    
    protected static double askDouble()
    {
        io.print("Please enter a number");
        return Double.parseDouble(io.read());
    }
}