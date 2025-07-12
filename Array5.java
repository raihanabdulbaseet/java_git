import java.util.Scanner;
class Array5 
{ 
    public static void main () 
    {
        int i,s,x=0,j=0;
      Scanner sc = new Scanner (System.in);
      System.out.println("Enter the size of the array");
      s =sc.nextInt();
      int a[] =new int [s];
      System.out.println("Enter the no.");
    for(i=0;i<s;i++)
      {
        a[i]=sc.nextInt();
    } 
    for(i=0;i<a.length-1;i++)
      {  
        for(j=0;j<a.length-1;j++)
        {
              if (a[i]!=x)
        {
          if (a[i]==a[j])
          {
            x=x+1;
            }
        }
    }
    }
    System.out.println(" "+x);
        }
    }
