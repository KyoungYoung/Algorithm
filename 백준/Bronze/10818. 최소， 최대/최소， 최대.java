    import java.util.*;

    public class Main{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < num; i++) {
                int input = sc.nextInt();
                list.add(input);
            }
            int max = Collections.max(list);
            int min = Collections.min(list);
            System.out.println(min + " " + max);





        }
    }