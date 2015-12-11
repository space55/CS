// Eamonn Nugent
// CreditCard

public class CreditCard
{
    private double balance;
    private double payment;
    private double interest;
    
    public CreditCard()
    {
        balance = 0;
        interest = 0;
        payment = 0;
    }
    
    public CreditCard(double bal)
    {
        balance = bal;
        interest = balance * 0.18;
        payment = 0;
    }
    
    public void setBalance(double bal)
    {
        balance = bal;
    }
    
    public double getBalance()
    {
        return balance;
    }
    
    public void makePymt(double pay)
    {
        balance -= pay;
        payment = pay;
    }
    
    public double getPayment()
    {
        return payment;
    }
    
    public void computeInt()
    {
        interest = balance * 0.0018;
    }
    
    public double getInterest()
    {
        return interest;
    }
    
    public double getFinalBalance()
    {
        computeInterest();
        balance += interest;
        return balance;
    }
    
    public String toString()
    {
        String str = "Beginning Balance: " + getBalance();
        str += "Payment: " + getPayment();
        str += "Interest: " + getInterest();
        str += "New Balance: " + getFinalBalance();
        return str;
    }
}