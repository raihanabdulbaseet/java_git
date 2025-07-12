import java.util.*; 
class loop4
{ 
 public static void main (String[]args) 
 { 
     long a=0; 
     Scanner sc=new Scanner(System.in); 
     System.out.println("Enter the number of terms you want"); 
     int n=sc.nextInt(); 
     for(int i=1;i<=n;i++) 
         { 
             a=(a*10)+3; 
             System.out.print(a); 
             if(i<n) 
                 System.out.print("+"); 
         } 
} 
}