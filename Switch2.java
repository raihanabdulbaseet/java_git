import java.util.Scanner;
public class Switch2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
      System.out.println("enter week no:");
        int day = sc.nextInt();
        String dayString;
        switch (day) {
        case 1:
            dayString = "Monday";
            break;
        case 2:
            dayString = "Tuesday";
            break;
        case 3:
            dayString = "Wednesday";
            break;
        case 4:
            dayString = "Thursday";
            break;
        case 5:
            dayString = "Friday";
            break;
        case 6:
            dayString = "Saturday";
            break;
        case 7:
            dayString = "Sunday";
            break;
        default:
            dayString = "Invalid day";
        }
        System.out.println(dayString);
    }
}
