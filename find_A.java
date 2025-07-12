import java.util.*;
class find_A
{
public static void main ()
{
Scanner sc = new Scanner (System.in);
int i,l=0;
String s,st=" ";
char c;
System.out.println("Enter the sentance");
s=sc.nextLine();
s=st+" ";
l=s.length();
for(i=0;i<l;i++)
{
c=s.charAt(i);
if(c!=' ')
{
st=st+c;
}
else
{
if(st.charAt(0)=='A')
{
System.out.println(st);
st=" ";
}
}
}
}
}
