/*write a program to accept a string a
the upper to lower case and vice-verca*/
import java.util.*;
class STR_upper
{
  public static void main ()
  {
    Scanner sc= new Scanner(System.in); 
    int i,l=0,b=0;
    String s;
    char c;
    System.out.println("enter the sentance");
    s=sc.nextLine();
    l=s.length();
   for(i=l-1;i>=0;i--)
   {
    c=s.charAt(i);
    b=b+(int)c;
    if (b>=65&&b<=90)
    {  
        b=b+32;
    } 
}
    System.out.println((char)b);
}
}