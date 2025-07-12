import java.util.Scanner;
public class Age_Cal {
public static void main(String[] args) 
{     
  Scanner sc = new Scanner(System.in);
 
System.out.println("\nEnter your age:");
  int age = sc.nextInt();

if (age < 13)
  System.out.print("Child");
else if ((age >= 13) && (age <= 19))
  System.out.print("Teen");
else if ((age >= 18) && (age <= 60))
  System.out.print("Adult");
else if (age >= 60)
  System.out.print("Senior");
else
  System.out.print("Invalid age");
 }
}