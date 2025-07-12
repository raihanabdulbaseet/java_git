import java.util.*;
class student
{
    String Sname,Sadd;
    int Smarks;
    char grade;
    
 void input ()
    {
    System.out.println("Enter the name of the student");
        Scanner sc = new Scanner(System.in);
        Sname=sc.nextLine();
        System.out.println("Enter the student address");
        Sadd=sc.nextLine();
        System.out.println("Enter the student marks");
        Smarks=sc.nextInt();
    }
 void find()
    {
    if(Smarks>=80)
    {
        grade='A';
    }
    else if(Smarks>=60&&Smarks<80)
    {
        grade='B';
    }
    else if(Smarks>=40&&Smarks<60)
    {
        grade='C';
    }
    else
    {
        grade='D';
    }
 }
 void print()
 {
 System.out.println("Name of the student="+Sname);
 System.out.println("address="+Sadd);
 System.out.println("marks="+Smarks);
 System.out.println("grade="+grade); 
 }
 public static void main()
 {
    student Stu = new student();
            Stu.input();
            Stu.find();
            Stu.print();
    }
}