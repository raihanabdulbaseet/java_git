/*Store 10 element in an array and print the average of the elements */
import java.util.Scanner;
class Array1 
{ 
    public static void main () 
    {
      Scanner sc = new Scanner (System.in);
      int i,s=0;
      int a[] =new int [5];
      
      for(i=0;i<5;i++)
      {
        System.out.println("Enter the marks of sub : "+(i+1));
       a[i]=sc.nextInt();
        s=s+a[i];
    }
    System.out.println("percentage="+s/5);
    
    }
    }
