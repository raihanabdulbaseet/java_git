/*Q.)Create 2 separate arrays to store 20 countries and their
 capitals. Search for country name given by the user
 and print corresponding capital */
import java.util.*;
class Array7
{
public static void main()
{
    Scanner sc= new Scanner (System.in);
    int i,p=0,f=0;
    String n;
    String a[]= new String[5];
    String b[]= new String[5];
    for (i=0;i<5;i++)   
{
    a[i]=sc.nextLine();
    b[i]=sc.nextLine();
} 
System.out.println("enter the country name to find ");
       n=sc.nextLine();
if(n.equals(a[i]))
{
   f=1;
   p=i;
}
if (f==0)
{
    System.out.println("not found ");
}
else
{
System.out.println("found and the capital ="+b[p]);
}
}
}