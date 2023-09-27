/*
 1. Student Management Package
Create a Java package named studentmanagement. Inside the studentmanagement package, create
a class called Student with fields for student name, roll number, and grades. Include methods to
calculate the average grade and display student information.
Create another class called StudentManager in the studentmanagement package to manage a list
of students. Include methods to add students, remove students, and display the list of students.
Create a separate Java application outside the studentmanagement package to demonstrate the
usage of the Student and StudentManager classes. Add several students, display their information,
and calculate the average grade for a group of students.
 */

package javaex5;
/**
 *
 * @author 22CSEB61
 */
import java.util.Scanner;
import studentmanagement.Student;
import studentmanagement.studentmanager;

public class Javaex5
{
    public static void main(String[] args) 
    {        
        Scanner obj=new Scanner(System.in);
        int choice=0;
        System.out.print("Enter no. of Students: ");
        int n=obj.nextInt();
        Student[] s=new Student[66];
        studentmanager stdm=new studentmanager();
        String name;
        int rollno;
        char grade1,grade2,grade3;
        for(int i=0;i<n;i++)
        {
            System.out.print("\nEnter the name: ");
            name=obj.next();
            System.out.print("Enter the roll no: ");
            rollno=obj.nextInt();
            System.out.print("****Grades - A B C D E****\n");
            try
            {
            System.out.print("Enter the grade1: ");
            grade1=obj.next().charAt(0);
            System.out.print("Enter the grade2: ");
            grade2=obj.next().charAt(0);
            System.out.print("Enter the grade3: ");
            grade3=obj.next().charAt(0);
            s[i]=new Student(name,rollno,grade1,grade2,grade3);            
            }
            catch(Exception e)
            {
                System.out.println("Wrong Input.");
            }            
        }       
        while(choice!=5)
        {
            System.out.println("\n1.Add Student \n2.Remove Student \n3.Display All Students \n4.Average grade of All \n5.Exit");
            System.out.print("\nEnter your choice: ");
            choice=obj.nextInt();
            switch(choice)
            {
                case 1:
                    int temp=stdm.addstudent(n, s);
                    n=temp;
                    break;
                case 2:
                    int temp1=stdm.removestudent(n, s);
                    n=temp1;
                    break;
                case 3:
                    stdm.display(n, s);
                    break;
                case 4:
                    stdm.avgrade(n, s);
                    break;
            }
        }       
    }    
}
