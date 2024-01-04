import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);;
        int[] arr = new int[sc.nextInt()];

        int b = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] < b) {
                sb.append(arr[i]).append(" ");
            }
        }
        System.out.println(sb);
        



    }
    }

