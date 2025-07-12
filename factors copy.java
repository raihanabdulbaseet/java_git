import java.util.Scanner;
class factors {
    public static void main(String[] args) {
    System.out.println("Enter the number");
    Scanner sc =new Scanner(System.in);
    int no =sc.nextInt();
    for (int i =1;i<=no/2;i++)
    {if (no%i==0)
        { System.out.println(i+" is a factor of "+no);
    
        }
    } 
  }
}