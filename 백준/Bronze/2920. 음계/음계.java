import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            int num = sc.nextInt();
            arr[i] = num;

        }
        String result = "";
        boolean ascending = true;
        for (int i = 0; i < 7; i++) {
            if (arr[i] >= arr[i + 1]) {
                ascending = false;
                break;
            }
        }

        if (ascending) {
            result = "ascending";
        }

        boolean descending = true;
        for (int i = 0; i < 7; i++) {
            if (arr[i] <= arr[i + 1]) {
                descending = false;
                break;
            }
        }
        if (descending) {
            result = "descending";
        }
        if (!ascending && !descending) {
            result = "mixed";
        }
        System.out.println(result);
    }
}
