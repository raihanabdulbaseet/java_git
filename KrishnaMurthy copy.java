/*Q3)that determines whether a given number is a Krishna
Murthy number or not? A Krishna Murthy number is defined
as a number whose sum of the factorials of its digits is
equal to the number itself. Implement the program to take
a number as input, calculate the sum of the factorials of
its digits, and then determine and output whether the number
is a Krishna Murthy number or not.*/
import java.util.Scanner;
public class KrishnaMurthy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input number
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();
        int sum = 0;
        int temp = num;
        // Calculate the sum of factorials of digits
        while (temp > 0) {
            int digit = temp % 10;
            int fact = 1;
            // Calculate factorial of the digit
            for (int i = 1; i <= digit; i++) {
                fact *= i;
            }
            sum += fact;
            temp /= 10;
        }
        // Check if the number is a Krishna Murthy number
        if (num == sum) {
            System.out.println(num + " is a Krishna Murthy number");
        } else {
            System.out.println(num + " is not a Krishna Murthy number");
        }
    }
}
