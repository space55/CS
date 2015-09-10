//Eamonn Nugent
//Custom output class (for logging)


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class IO
{
    BufferedWriter bw;
    Scanner in;
    
    public IO(String fileName)
    {
        try
        {
            bw = new BufferedWriter(new FileWriter("logs/" + fileName + ".sp"));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        in = new Scanner(System.in);
    }
    
    public void print(String text)
    {
        System.out.println(text);
        try
        {
            bw.write(text);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        try
        {
            bw.flush();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    
    public void print(Object text)
    {
        print("" + text);
    }
    
    public String read()
    {
        String ret = in.nextLine();
        try
        {
            bw.write("[Info] Writing " + ret);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return ret;
    }
}