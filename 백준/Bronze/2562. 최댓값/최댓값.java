    import java.util.*;
    import java.util.stream.Stream;

    public class Main{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int[] arr = new int[9];
            int findNum = 0;
            int count = 0;

            for (int i = 0; i < arr.length; i++) {
                int num = sc.nextInt();
                arr[i] = num;
                if (findNum < arr[i] ) {
                    findNum = arr[i];
                    count = i+1;
                }

            }
            System.out.println(findNum);
            System.out.println(count);






            }
    }