/*Q.)Write a program to except string and 
check weather is a palindrome*/
import java.util.*;
class STR_palin
{
  public static void main ()
  {
    Scanner sc= new Scanner(System.in); 
    int i,l=0,x=0;
    String s,st="";
    char c;
    System.out.println("enter the sentance");
    s=sc.nextLine();
    l=s.length();
   for(i=l-1;i>=0;i--)
   { 
    c=s.charAt(i);
     st=st+c;
    }
    if (st.equals(s))
    {  
    System.out.println("palindrome");
    }
    else
    {
    System.out.println("Not a palindrome");
    }
    } 
    }

