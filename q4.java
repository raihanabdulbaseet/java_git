import java.util.*;
class q4
{
public static void main(String[] args) {
Scanner sc = new Scanner (System.in);
 double ap=0.0, d=0.0;
int p=0;
System.out.println("Enter amount purchased: ");
p = sc.nextInt( ); //input
if (p < 1100) 
{
d= (5*p)/100.0; // calculation
System.out.print ("The gift is a wallet");
}
else if (p < 5100)
{
d= (10*p)/100.0;
System.out.print("The gift is a wrist watch");
}
else if (p < 10100)
{
d= (15*p)/100.0;
System.out.print("The gift is a wall clock");
{
d= (20*p)/100.0;
System.out.print("The gift is a travel kit");
}
ap = p - d; 
System.out.print("The amount payable is" + ap); //result printing
}
}
}