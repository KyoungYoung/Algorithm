import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int R = sc.nextInt();
            String S = sc.next();

            StringBuilder result = new StringBuilder();
            for (char ch : S.toCharArray()) {
                for (int j = 0; j < R; j++) {
                    result.append(ch);
                }
            }

       
            System.out.println(result.toString());
        }

    
    }
}
