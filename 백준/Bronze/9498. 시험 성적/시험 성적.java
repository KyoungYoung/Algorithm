import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        for(int i = 1; i < 10; i++){
//            System.out.println(n + " * " + i + " = " +n*i);
//        }
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();

        StringBuilder sb = new StringBuilder();

        if ((score >= 90 && score <= 100)) {
            sb.append("A");
        } else if ((score >= 80 && score < 90)) {
            sb.append("B");
        }else if ((score >= 70 && score < 80)) {
            sb.append("C");
        }else if ((score >= 60 && score < 70)) {
            sb.append("D");
        }else {
            sb.append("F");
        }

        System.out.println(sb);




    }
    }

