import java.util.Scanner;
class bill {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        int i,l,eg,p,f,tot=0,rate=0;
      System.out.println("Enter the number of frequency ");
      l=sc.nextInt();
      for(i=0;i<l;i++) 
    {
      System.out.println("enter the number of eggs");
      eg=sc.nextInt();
      System.out.println("enter the total price of eggs ");
      p=sc.nextInt();
      if(eg>0||p>0)
      {
        tot=eg+tot;
        rate=p+rate;
        }
       }
     System.out.println(tot);
     System.out.println(rate);
    }
}