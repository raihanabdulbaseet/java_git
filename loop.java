import java.util.Scanner;
class loop {
    public static void main(String[] args) {
        int num,i;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number:");
    
        num =sc.nextInt();
        
        System.out.println("table of " +num+ " is:");
         for(i=1;i<=10;i++) 
         System.out.println(num*i);
        
      }
}