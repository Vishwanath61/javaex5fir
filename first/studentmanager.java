package studentmanagement;
/**
 *
 * @author 22CSEB61
 */
import java.util.Scanner;

public class studentmanager 
{
    Scanner obj=new Scanner(System.in);
    String name;
    int rollno;
    char grade1,grade2,grade3;
    
    public int addstudent(int n,Student s[])
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
            s[n]=new Student(name,rollno,grade1,grade2,grade3);
            double c=s[n].average(grade1,grade2,grade3);
            n=n+1;
        }
        catch(Exception e)
        {
            System.out.println("Wrong Input.");
        }        
        return n;
    }    
    
    public int removestudent(int n,Student s[])
    {        
        System.out.println("\nDeleting Student from list:");
        System.out.print("Enter the name of Student to delete: ");
        String s1=obj.next();
        for(int i=0;i<n;i++)
        {
            if(s[i].name.equals(s1))
            {
                s[i]=s[i+1];
            }
        }
        System.out.println("The Student record has been successfully deleted!!");
        n=n-1;
        return n;
    }
    
    public void display(int n,Student s[])
    {
        System.out.println("\nDisplaying All the Students:");
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
    
    public void avgrade(int n,Student s[])
    {
        System.out.println("\nAverage grade of "+n+" Students:");
        String avgrade="";
        double avgr=0;
        for(int i=0;i<n;i++)
        {
            double d=s[i].av;
            avgr+=d;            
        }
        double avg = avgr/n;         
        int cal=(int)Math.round(avg);        
        switch(cal)
        {
            case 10:
                avgrade+='A';
                break;
            case 9:
                avgrade+='B';
                break;
            case 8:
                avgrade+='C';
                break;
            case 7:
                avgrade+='D';
                break;
            case 6:
                avgrade+='E';
                break;
        }
        System.out.println("The Average grade of "+n+" students is:"+avgrade);
    }
}

