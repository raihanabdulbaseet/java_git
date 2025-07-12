import java.util.Scanner;
class loop3 {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
while (true) {
    int ones = 0;
    System.out.println("Input a number (0 exits): ");
    int number = Integer.valueOf(scanner.nextLine());
    if (number == 0) {
        break;
    }
    if (number == 1) {
        ones = ones + 1;
    }
System.out.println("The total of ones: " + ones);
  }
 }
}
