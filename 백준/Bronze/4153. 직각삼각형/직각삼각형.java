import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if (a == 0 && b == 0 && c == 0) {
                break;
            }
            boolean triangle = checkTriangle(a, b, c);
            System.out.println(triangle ? "right" : "wrong");
        }
    }

    private static boolean checkTriangle(int a, int b, int c) {
        int[] sides = {a, b, c};
        Arrays.sort(sides);
        boolean test = sides[0] * sides[0] + sides[1] * sides[1] == sides[2] * sides[2];
        return test;
    }
}
