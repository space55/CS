package student;

// Eamonn Nugent
// Student Tester

import java.util.Scanner;

public class StudentTester
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the student's name");
        String name = in.next();
        System.out.println("Please enter the student's score on test 1");
        int t1 = in.nextInt();
        System.out.println("Please enter the student's score on test 2");
        int t2 = in.nextInt();
        System.out.println("Please enter the student's score on test 3");
        int t3 = in.nextInt();
        Student student1 = new Student();
        student1.setName(name);
        student1.setScore(1, t1);
        student1.setScore(2, t2);
        student1.setScore(3, t3);
        System.out.println("High Score for student: " + student1.getHighScore());
        System.out.println(student1.toString());
        in.close();
    }
}