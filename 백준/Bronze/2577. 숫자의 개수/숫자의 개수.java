import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int total = a * b * c;

        String totalStr = String.valueOf(total);

        int[] digitCounts = new int[10];

        for (char digitChar : totalStr.toCharArray()) {
            int digit = Character.getNumericValue(digitChar);
            digitCounts[digit]++;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(digitCounts[i]);
        }
    }
}
