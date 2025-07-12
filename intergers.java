import java.util.Scanner;
class intergers
{ 
    public static void main () 
    { 
     int a;
     System.out.println("Enter the number ");
     Scanner sc= new Scanner(System.in);   
      a = sc.nextInt();
      if (a>100) 
      System.out.println("the integers is greater than 100");       
      else if (a<100)  
      System.out.println("the integers is less than 100");  
      else if(a==100) 
      System.out.println("the integers is equal to 100");  

    }
}