/*Q.)Write a program to store 40 students in array display
 the rest mark alone with position */
import java.util.Scanner;
class Array3
{ 
  public static void main (String[]args){
    int i,p,h=0;
    Scanner sc=new Scanner (System.in);
    int a[]=new int [40];
    for(i=0;i<40;i++)
    {
      a[i]=sc.nextInt();
    }
    for(i=0;i<40;i++)
    {
     if(a[i]>h)
     {
       h=a[i];  
        }
    }
     p=i;
     System.out.println("highest value"+p +h);
    }
}