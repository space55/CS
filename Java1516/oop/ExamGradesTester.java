//Eamonn Nugent
//Exam Grades Tester

public ExamGradesTester
{
    public static void main(String[] args)
    {
        ExamGrades g = new ExamGrades();
        g.setGrade(90);
        g.setGrade(75);
        g.setGrade(116);
        g.setGrade(99);
        System.out.println(g.toString());
    }
}