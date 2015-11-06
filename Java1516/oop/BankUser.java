//Eamonn Nugent
//Bank Account Moneyz

public class BankUser
{
    private String name = "";
    private int bal = 1000;
    public BankUser(String name)
    {
        this.name = name;
    }
    
    public void dep(int amt)
    {
        bal += amt;
    }
    
    public void wd(int amt)
    {
        if (amt > bal)
        {
            
        }
        bal -= amt;
    }
    
    public int getBal()
    {
        return bal;
    }
    
    public String getName()
    {
        return name;
    }
}