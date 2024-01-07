import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Integer> numSet = new HashSet<>();
        int count = 0;
        for (int i = 0; i < 10; i++) {
            int input = sc.nextInt();
            numSet.add(input % 42);
        }

        for (int a :
                numSet) {
            count++;
        }
            System.out.println(count);

    }
}
