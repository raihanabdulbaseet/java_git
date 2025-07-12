import java.util.Scanner;
public class number_co
{ 
    public static void main(String [] args)
    {   
        int a;
        int b;
        int c;
        System.out.println("Enter the number");
        Scanner sc= new Scanner(System.in);   
        a = sc.nextInt();
        System.out.println("Enter the second number");
        b = sc.nextInt(); 
        System.out.println("Enter the third number");
        c = sc.nextInt();
        
        if ((a == b) && (b == c) && (a == c))
        System.out.println("The number are equal");
        if ((a > c) && (a > b))
        System.out.println("The greatest no:"+a);
        if ((c>a) && (c>b))
        System.out.println("The geratest no:"+c);
        if ((b>c) && (b>a))
        System.out.println("The greatest no:"+b);
   }
 }


