/*Q.)WAP to accept the string and replace the character 'A' with 's' . 
display the orignal string and new string form */
import java.util.*;
class STR_character
{
public static void main()
{
    Scanner sc= new Scanner (System.in);
    int i,l=0;
    String s,st=" ";
    char c;
    s=st+" ";
    System.out.println("enter the string");
    s=sc.nextLine();
    l=s.length();
        System.out.println("original string ="+s);
   for(i=0;i<l;i++)
   {
    c=s.charAt(i);
    if (c=='A')
    {  c='S';
    } 
    st=st+c;
}
    System.out.println("New stream from . "+st);
}
}