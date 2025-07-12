/*WAP to Using switch case check whether
   i)automorphic no.(if the no occupies on the Extreme right)
  ii)special no.(if the sum of the factorial of each digit is = or not)
 iii)armstrong no.(if the sum of the cube of each digit is = to the no.) */
 import java.util.*;
 class typeno_all
 {
  public static void main ()
  {
  Scanner sc = new  Scanner (System.in);
  int n,c,cp=0,mod,x=0,sq=0,i,f=0,s=0;
  double l=0.0;
  System.out.println("Enter the number");
  n=sc.nextInt();
  System.out.println("for automorphic no. press 1");
  System.out.println("for special no. press 2");
  System.out.println("for armstrong no. press 3"); 
  System.out.println("choice any one option from it");
  c=sc.nextInt();
  switch(c)
  {
    case 1:
    n=cp;
    while (cp!=0)
    {
     mod = cp%10;
     x=x+1;
     cp=cp%10;
    }
    sq=n*n;
    l=sq%Math.pow(10,x);
    if(n==l)
    {
     System.out.println("it is a automorphic no.");  
   }
   else
   {
    System.out.println("it is not an automorphic no.");
   }
   break;
   case 2:
    cp=n;
    while(cp!=0)
    {
    mod=cp%10;
    for(i=0;i<=mod;i++)
   {
    f=f*i;
    s=s+f;
    cp=cp/10;
    f=1;
    }
   }
   if(s==n)
    {
     System.out.println("is a special no.");
    }
   else
    {
    System.out.println("not a special no.");
    }
   
   case 3:
    cp=n;
   while (cp!=0)
   {
    mod=cp%10;
    s=s+(mod*mod*mod);
    if(s==n)
    {
     System.out.println("is a armstrong no.");
    }
    else
    {
    System.out.println("is not an armstrong no.");
    }
   }
  }
 }    
}