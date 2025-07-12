/*Q.)Write a program to accept a sentence and a word . Find the
number of times the word close in the sentence*/ 
import java .util.*;
public class STR_sentence
{
 public static void main ()
 {
    Scanner sc= new Scanner (System.in);
    int i,l=0,x=0;
    String s,st=" ",w=" ";
    char c=' ',ch;
    System.out.println("enter the sentance");
    s=sc.nextLine();
        s=st+" ";
    l=s.length();
   for(i=l-1;i>=0;i--)
   {
    c=s.charAt(i);
}
    if (c!=' ')
    {  
     st=st+c;
    } 
    else
    {
    if(st.equals(w))
    {
     x=x+1;
     st=" ";
    }
    }
System.out.println(x);
System.out.println(st);

}
}
