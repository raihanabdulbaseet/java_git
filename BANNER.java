import java.util.*;
class BANNER
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int i,n,len,j;
        String a[];
        System.out.println(" No of teams ");
        n = sc.nextInt();
        a = new String [n];
        for(i = 0; i < n; i++)
        {
            a[i] = sc.nextLine();
            System.out.println("Team");
        }
        len = a[0].length();
        for( i = 0; i < a.length; i++)
        {
            if ( len < a[i].length())
            len = a[i].length();
        }
        for ( i = 0; i < len; i++)
        {
            for (j = 0; j< a.length; j++)
            {
                if( i < a[j].length())
                System.out.print(a[j].charAt(i) + "\t");
                else
                System.out.println("\t");
        }
        System.out.println();
    }
}
}