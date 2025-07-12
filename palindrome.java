import java.util.*;
/**
 * GOLDBACH NO
 * @author (Raihan Abdul Baseet)
 * @version (11/07/2024)
 */
class palindrome
{
   public static void main()
   {
       int i, j,z = 0,m = 0,k,b = 0,l = 0, n, p =0;
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter a number to check whether the no is goldbach number");
       n = sc.nextInt();
       System.out.println("INPUT:");
       System.out.println("N = " + n);
       System.out.println("OUTPUT:");
       System.out.println("PRIME PAIRS ARE: ");
       if ( n > 9 && n < 50)
       {
       for ( i = 0; i <= (n/2); i++)
       {
          z = i;
          for ( j = 1; j <= i; j++)
          {
              if ( i % j == 0)
              {
                  l = l + 1;
              }
          }
          if ( l == 2 && i!= 2)
          {           
              m = n - i;
              for (k = 1; k <= m; k++)
              {
                  if ( m % k == 0)
                  {
                      b = b +1;
                  }
              }
              if ( b == 2 )
              {
                  p = p+1;
                  System.out.println(z + "," + m);
              }
          }
          else
          {
              l = 0;
              m = 0;
              z = 0;
              b = 0;
          }
       }
       if ( p == 0 )
       System.out.println("INVALID INPUT, NUMBER IS ODD");
       }     
       else
       {
         System.out.println("Enter the number within range");
        }
}
}