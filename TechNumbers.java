public class TechNumbers
{
    public static void main(String args[]) {
        for (int i = 1000; i <= 9999; i++) {
          int secondHalf = i % 100;
            int firstHalf = i / 100;
            int sum = firstHalf + secondHalf;
            if (i == sum * sum)
                System.out.println(i);
        }
    }
}