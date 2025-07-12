import java.util.*;
class ASCII
{
 public static void main ()
 {
    Scanner sc = new Scanner (System.in);
    int i,l,x=0;  
    String s;
    char c = ' ';
    System.out.println("enter the string");
      s=sc.nextLine();
     //l=s.length();
    for(i=0;i<s.length();i++)
      {
        c=s.charAt(i);
         if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'||c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
        {
            x++;
            System.out.println("vowels are "+c);
        }
      }
      System.out.println("No of vowels are "+x);
      //System.out.println("No of vowels are "+s);
      //System.out.flush();  
    }
}