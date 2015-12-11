// Eamonn Nugent
// ExamGrades

public class ExamGrades
{
    private int grade, count, sum, max, min;
    private double average;
    
    public ExamGrades()
    {
        grade = 0;
        count = 0;
        sum  = 0;
        max = 0;
        min = 99999;
        average = 0;
    }
    
    public void setGrade(int grade)
    {
        this.grade = grade;
        count++;
        sum += grade;
        getAverage();
        if (grade > max)
        {
            max = grade;
        }
        if (grade < min)
        {
            min = grade;
        }
    }
    
    public int getCount()
    {
        return count;
    }
    
    public double getAverage()
    {
        average = sum / count;
        return average;
    }
    
    public int getMax()
    {
        return max;
    }
    
    public int getMin()
    {
        return min;
    }
    
    public int getSum()
    {
        return sum;
    }
    
    public int getGrade()
    {
        return grade;
    }
    
    public String toString()
    {
        String ret = "";
        ret += "Grade:   " + getGrade();
        ret += "Count:   " + getCount();
        ret += "Sum:     " + getSum();
        ret += "Max:     " + getMax();
        ret += "Min:     " + getMin();
        ret += "Average: " + getAverage();
        return ret;
    }
}