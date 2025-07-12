import java.util.Scanner;
class area 
{ 
    public static void main () 
    {
       Scanner sc =new Scanner (System.in);
       
       int c,s,as,r,l,b,ar; 
       double ac ;
       
       System.out.println("1 area of square");
       System.out.println("2 area of circle");
       System.out.println("3 area of rectangle");
       System.out.println("choose any option");
          c =sc.nextInt();
       
       switch (c)
       { 
        case 1 -> {
            System.out.println("Enter side");
            s = sc.nextInt();
            as=s*s ;
            System.out.println(" area of square = "+as);
            }
        
        case 2 -> {
            System.out.println("Enter radius");
            r= sc.nextInt();
            ac=3.14*r*r;
            System.out.println("area of circle = "+ac);
            }
         
         case 3 -> {
             System.out.println("Enter the length and breath");
             l=sc.nextInt();
             b=sc.nextInt();
             ar=l*b;
             System.out.println("area of a rectangale = "+ar);
            }
         
         default -> System.out.println("wrong choice");

        }     
    }
}