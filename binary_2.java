  import java.util.*;
class binary_2
{
public static void main ()
{
Scanner sc = new Scanner (System.in);
int f=0,l=0,u=5,n,mid=0;
int a []={5,9,15,20,25,32};
n=sc.nextInt();
while(l<=u)
{
mid =(l+u)/2;
if(n==a[mid])
{
 f=1;
break;
  }
else if(n>a[mid])
{
   l=mid+1; 
    }
else if(n<a[mid])
{
  u=mid-1;
}
}
if(f==0)
{
System.out.println("Unsuccessful");
}
else
{
System.out.println("successful");
}
  }
 }


