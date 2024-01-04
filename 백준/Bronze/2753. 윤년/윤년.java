import java.util.*;

public class Main{
    public static void main(String[] args){
        System.out.println(newYear());
    }
    
    public static int newYear(){
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if((year % 4 == 0 && !(year % 100 == 0)) || year % 400 == 0){
            return 1;
        }
            return 0;
    }
}