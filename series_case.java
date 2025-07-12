import java.util.Scanner;
class series_case
{ 
    public static void main () 
    {
        Scanner sc =new Scanner (System.in);
        int x,n,i,s=0;
        System.out.println("enter the number ");
        x=sc.nextInt();
        System.out.println("enter the power =");
        n=sc.nextInt();
        
        for(i=1;i<=n;i++)
        {
         s=s+(int)Math.pow(x,i);
        }
          System.out.println("sum="+s);
    }
}