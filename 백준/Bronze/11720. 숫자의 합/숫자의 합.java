import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int total = 0;
        String count = sc.nextLine();
        String findNum = sc.nextLine();
        int addNum = 0;
        for (int i = 0; i < Integer.parseInt(count); i++) {
            addNum = Integer.parseInt(String.valueOf(findNum.charAt(i)));
            total += addNum;

        }
        System.out.println(total);


        }
}