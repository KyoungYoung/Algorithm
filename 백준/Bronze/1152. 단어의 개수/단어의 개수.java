import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputLine = sc.nextLine();
        System.out.println(input(inputLine));
    }
    public static int input(String inputLine){
        String[] arrInput = inputLine.trim().split(" ");
        int num = 0;
        if (!inputLine.trim().isBlank()) {
             num = arrInput.length;
        }
        return  num;
    }
}