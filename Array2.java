/*Write a program to store 40 number in an
 array display the highest number */
import java.util.Scanner;
class Array2
{ 
  public static void main(String[]args){
   int i,h=0;
   Scanner sc=new Scanner (System.in);
   System.out.println("Enter the number ");
   int a[]=new int[10];
   for(i=0;i<10;i++)
   { 
     a[i]=sc.nextInt();  
    }
    for(i=0;i<10;i++)
    {
        if(a[i]>h){
        h=a[i];
    }
    }
    System.out.println("highest value "+h);
}
}
