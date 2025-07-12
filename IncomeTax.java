import java.util.Scanner;

public class IncomeTax
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Gender(male/female): ");
        String gender = in.nextLine();
        System.out.print("Enter Age: ");
        int age = in.nextInt();
        System.out.print("Enter Taxable Income: ");
        double ti = in.nextDouble();
        double tax;

        if (age > 65 || gender.equalsIgnoreCase("female")) {
            System.out.print("Wrong Category");
        }
        else {
            if (ti <= 160000)
                tax = 0;
            else if (ti <= 500000)
                tax = (ti - 160000) * 10 / 100;
            else if (ti <= 800000)
                tax = 34000 + ((ti - 500000) * 20 / 100);
            else
                tax = 94000 + ((ti - 800000) * 30 / 100); 
            System.out.println("Tax Payable: " + tax);
        }      
    }
}