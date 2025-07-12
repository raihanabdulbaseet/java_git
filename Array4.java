/*Write a program to count the odd and even in an array */ 
import java.util.Scanner;
class Array4 
{ 
    public static void main () 
    {
        int i,s,v=0,n=0;
      Scanner sc = new Scanner (System.in);
       System.out.println("Enter the size of the array");
      s =sc.nextInt();
      int a[] =new int [s];
      System.out.println("Enter the no."); 
      for(i=0;i<s;i++)
      {
       a[i]=sc.nextInt();
       if (a[i]%2==0)
       { 
           n=n+1;
        }
        else
        { 
           v=v+1; 
        }  
        
    }
    System.out.println(" the even numbers"+n);

    System.out.println(" the odd numbers"+v);

    }
    }
