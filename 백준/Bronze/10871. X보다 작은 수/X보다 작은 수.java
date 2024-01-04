import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);;
        
        int a = sc.nextInt(); 
        int b = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        int res = 0;
        for (int i = 0; i < a; i++) {
            res = sc.nextInt();
            if (res < b) {
                sb.append(res).append(" ");
            }
        }
        System.out.println(sb);
        



    }
    }

