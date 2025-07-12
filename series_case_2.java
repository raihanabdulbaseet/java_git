import java.util.Scanner;
class series_case_2
{ 
    public static void main () 
    {
        Scanner sc =new Scanner (System.in);
        int n,i,s=0;
        System.out.println("enter the number =");
        n=sc.nextInt();
        
        for(i=1;i<=n;i++)
        {
         s=s+(int)Math.pow(i,3)-1;
         System.out.println("sum="+s);
        }
    }
}