/*Q.)Write a program to accept a sentence and print number 
of words that starts with vowels */
import java .util.*;
public class STR_vawels
{
 public static void main ()
 {
     
    Scanner sc= new Scanner (System.in);
    int i,l=0,x=0;
    String s,st=" ",w;
    char c,ch;
    System.out.println("enter the sentance");
    s=sc.nextLine();
        s=st+" ";
    l=s.length();
   for(i=l-1;i>=0;i--)
   {
    c=s.charAt(i);
    if (c!=' ')
    {  
        st=st+c;
    } 
    else
    {ch=st.charAt(0);
    if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
     {
       x=x+1;
       st=" ";
     }
    }
}
    System.out.println(x);
}
}
