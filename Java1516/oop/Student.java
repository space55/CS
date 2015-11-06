// Eamonn Nugent
// Student Class

public class Student
{
    private String name = "";
    private int test1 = 0;
    private int test2 = 0;
    private int test3 = 0;
    
    public Student()
    {
        //Do I really need to be redundant? Okay...
        name = "";
        test1 = 0;
        test2 = 0;
        test3 = 0;
    }
    
    public Student(int score1, int score2, int score3)
    {
        String val = validateData(int score1, int score2, int score3);
        if (val.equals(null))
        {
            test1 = score1;
            test2 = score2;
            test3 = score3;
        }
        else
        {
            System.out.println(val);
        }
    }
    
    public Student(int score1)
    {
        String val = validateData(score1);
        if (val.equals(null))
        {
            test1 = score1;
        }
        else
        {
            System.out.println(val);
        }
    }
    
    public Student(String name)
    {
        String val = validateData(name);
        if (val.equals(null))
        {
            this.name = name;
        }
        else
        {
            System.out.println(val);
        }
    }
    
    public Student(int score1, int score2, int score3, String name)
    {
        // I did these extra constructors to appease my own wish to make this be able to work as an API
        // Turns out, I need them
        String val = validateData(score1, score2, score3, name);
        if (val.equals(null))
        {
            test1 = score1;
            test2 = score2;
            test3 = score3;
            this.name = name;
        }
        else
        {
            System.out.println(val);
        }
    }
    
    public String validateData(int arg0, int arg1, int arg2)
    {
        int[] args = new int[3];
        args[0] = arg0;
        args[1] = arg1;
        args[2] = arg2;
        for (int counter = 0; counter < 3; counter++)
        {
            if (!validateData(args[counter]).equals(null))
            {
                return validateData(args[counter]);
            }
        }
        return null;
    }
    
    public String validateData(int arg0, int arg1, int arg2, String arg2)
    {
        int[] args = new int[3];
        args[0] = arg0;
        args[1] = arg1;
        args[2] = arg2;
        for (int counter = 0; counter < 3; counter++)
        {
            if (!validateData(args[counter]).equals(null))
            {
                return validateData(args[counter]);
            }
        }
        if (!validateData(arg2).equals(null))
        {
            return validateData(arg2);
        }
        return null;
    }
    
    public String validateData(String data)
    {
        if (data.equals(null))
        {
            return "Error: Can not set name to an empty string";
        }
        else
        {
            return null;
        }
        return "Something broke! (1)";
    }
    
    public String validateData(int data)
    {
        if (data <= 100 && data >= 0)
        {
            return null;
        }
        else
        {
            return "Error: Data was outside range";
        }
        return "Something broke! (2)";
    }
    
    public void setName(String name)
    {
        String val = validateData(name);
        if (val.equals(null))
        {
            this.name = name;
        }
        else
        {
            System.out.println(val);
        }
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setScore(int test, int score)
    {
        String val = validateData(score);
        if (val.equals(null))
        {
            if (test == 1)
            {
                test1 = score;
            }
            else if (test == 2)
            {
                test2 = score;
            }
            else if (test == 3)
            {
                test3 = score;
            }
            else
            {
                System.out.println("Call to setScore messed up");
            }
        }
        else
        {
            System.out.println(val);
        }
    }
    
    public int getScore(int test)
    {
        if (test == 1)
        {
            return test1;
        }
        else if (test == 2)
        {
            return test2;
        }
        else if (test == 3)
        {
            return test3;
        }
        else
        {
            System.out.println("Call to getScore messed up");
        }
        return 0;
    }
    
    public int getAverage()
    {
        return Math.round((test1 + test2 + test3) / 3);
    }
    
    public int getHighScore()
    {
        if (test1 >= test2 && test1 >= test3)
        {
            return test1;
        }
        if (test2 >= test1 && test2 >= test3)
        {
            return test2;
        }
        if (test3 >= test2 && test3 >= test1)
        {
            return test2;
        }
        return 0;
    }
    
    public String toString()
    {
        String ret =
            "Name:       " + name + "\n" + 
            "Test 1:     " + test1 + "\n" + 
            "Test 2:     " + test2 + "\n" + 
            "Test 3:     " + test3 + "\n" + 
            "Average:    " + getAverage();
        return ret;
    }
}