import java.util.*;
public class discount
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
double d= 0, amt= 0, tp= 0;
String g ;
System.out.println("Enter the total cost");
tp= sc.nextDouble();
if(tp<=2000)
{
d= 5;
g= "Calculator";
}
if(tp<=5000 && tp>2000)
{
d= 10;
g= "School Bag";
}
if(tp<=10000 && tp>5000)
{
d= 15;
g= "Wall Clock";
}
if(tp>10000)
{
d= 20;
g = "Wrist Watch";
}
amt= tp-d;

System.out.println("Amount to be paid= " +amt);
System.out.println("Gift= ");
}
}