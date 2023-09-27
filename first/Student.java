/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagement;
/**
 *
 * @author 22CSEB61
 */
public class Student 
{    
    String name;
    int rollno;
    double av;
    char grade1,grade2,grade3;
    public Student(String name,int rollno,char grade1,char grade2,char grade3)
    {
        this.name=name;
        this.rollno=rollno;
        this.grade1=grade1;
        this.grade2=grade2;
        this.grade3=grade3;
    }
    public double average(char grade1,char grade2,char grade3)
    {
        int a=0,b=0,c=0;
        switch(grade1)
        {
            case 'A':
                a=10;
                break;
            case 'B':
                a=9;
                break;
            case 'C':
                a=8;
                break;
            case 'D':
                a=7;
                break;
            case 'E':
                a=6;
                break;
        }
        switch(grade2)
        {
            case 'A':
                b=10;
                break;
            case 'B':
                b=9;
                break;
            case 'C':
                b=8;
                break;
            case 'D':
                b=7;
                break;
            case 'E':
                b=6;
                break;
        }
        switch(grade3)
        {
            case 'A':
                c=10;
                break;
            case 'B':
                c=9;
                break;
            case 'C':
                c=8;
                break;
            case 'D':
                c=7;
                break;
            case 'E':
                c=6;
                break;
        }
        int sum=a+b+c;
        av=sum/3;
        return av;
    }
    public String toString()
    {
        return "\nName:"+name+"\nRollno:"+rollno+"\nGrade1:"+grade1+"\nGrade2:"+grade2+"\nGrade3:"+grade3+"\nAverage:"+av;
    }
}
