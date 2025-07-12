/*Q.)Write a program to except 50 numbers
and find the sum of 
i)positive even number
ii)positive odd number
iii)nagative even 
 */
import java.util.*;
class sum
{
public static void main ()
{
Scanner sc = new Scanner (System.in);
int s,i,e=0,o=0,n=0;
System.out.println("Enter the size of the number");
s=sc.nextInt();
int a[]=new int [s];
System.out.println("Enter the numbers ");
for(i=0;i<s;i++)
{
  a[i]=sc.nextInt();
}
for(i=0;i<s;i++)
{if(a[i]%2==0&&a[i]>0)
{
    e=e+a[i];
}
else if(a[i]%2!=0&&a[i]>0)
{
    o=o+a[i];
}
else if(a[i]%2==0&&a[i]<0)
{
    n=n+a[i];
}
}
System.out.println("positive even no="+e);
System.out.println("positive odd no="+o);
System.out.println("negative even no="+n);
}
}