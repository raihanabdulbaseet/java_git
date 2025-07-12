import java.util.Scanner;
class fruquency
{ 
    public static void main () 
    { 
     int i,x=0,cp=0,n,mod;
     Scanner sc= new Scanner(System.in);
     System.out.println("Enter the number ");
     n=sc.nextInt();
     
     for(i=0;i<=9;i++)
     {
       cp=n;
    }
       while (cp!=0)
    {
      mod=cp%10;
      
      if (mod==i)
      {
          x=x-1;
         cp=cp/10;
         if(x>0)
         {
         
         }
        }
    }
             System.out.println(i+"."+x); 

     }
    }
