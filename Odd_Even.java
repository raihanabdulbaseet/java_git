import java.util.Scanner;
public class Odd_Even {  
public static void main(String[] args) {  
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter a number to be checked");  
    
    //defining a variable  
    int number=sc.nextInt();  
    //Check if the number is divisible by 2 or not  
    if(number%2==0){  
        System.out.println("even number");  
    }else{  
        System.out.println("odd number");  
    }  
}  
} 