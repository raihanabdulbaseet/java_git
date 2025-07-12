import java.util.*;
class electric_bill  
{ 
    public static void main (String[] args) 
    { 
        Scanner sc= new Scanner (System.in);
        int uc,n;
        double a=0;
        String str;
        System.out.println("enter consumer name=");
          str =sc.nextLine();
        System.out.println("enter Unit consumed=");
        uc =sc.nextInt();
        System.out.println("enter consumer no:=");
        n =sc.nextInt();
        if (uc<=100)
        {
          a =uc*1.25;
        }
        else if (uc>100&&uc<=200)
        {
            a=(100*1.25)+(uc-100*1.50);
        }
        else
        {
         a=(100*1.25)+(100*1.50)+(uc-200)*1.80;
        }
        System.out.println("unit consumed="+uc);
        System.out.println("consumer no:="+n);
        System.out.println("name="+str);
        System.out.println("amount="+a);
    }
}
