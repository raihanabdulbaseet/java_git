import java.util.Scanner;
class series{ 
    public static void main(String[] args){ 
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int i,f=1,s=0,j;
        for(i=1;i<=n;i++)
        {    
            for (j=1;j<=i;j++)
            f=f*j;
            s=s+f;
            f=i;
        }
    
    System.out.println(s);
    
}
}