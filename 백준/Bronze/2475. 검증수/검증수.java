import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int total = 0;
        for(int i = 0; i < 5; i++){
            int inputNum = sc.nextInt();
            total += Math.pow(inputNum, 2);
        }
        int res = total % 10;
        System.out.println(res);
    }
}