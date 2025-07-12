import java.util.*;
class degree90
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int m,n,r,c;
        m=sc.nextInt();
        n=sc.nextInt();
        
        int ar[][]=new int[m][n];
        for(r=0;r<m;r++)
        {
            for(c=0;c<n;c++)
            {
                ar[r][c]=sc.nextInt();
            }
        }
        for(r=0;r<m;r++)
        {
            for(c=0;c<n;c++)
            {
                System.out.print(ar[r][c]+" ");
            }
            System.out.println();
        }
        int dg[][]=new int[n][m];
        
        
        for(r=0;r<n;r++)
        {
            int x=n;
            for(c=0;c<m;c++)
            {
                dg[r][c]=ar[x][r];
                x=x-1;
               
            }
            
        }
        
          System.out.println();
        
        for(r=0;r<n;r++)
        {
            for(c=0;c<m;c++)
            {
                System.out.print(dg[r][c]+" ");
            }
            System.out.println();
        }
    }
}