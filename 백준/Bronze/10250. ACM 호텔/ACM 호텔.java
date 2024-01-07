    import java.util.*;

    public class Main{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int T = sc.nextInt();

                int hotelRoomFloor = 0;
                int hotelRoomHosu = 0;
            for (int i = 0; i < T; i++) {
                int H = sc.nextInt();
                int W = sc.nextInt();
                int N = sc.nextInt();
                if (H < N) {
                    hotelRoomFloor = N % H ;
                    hotelRoomHosu = (N / H) + 1;
                    if (hotelRoomFloor == 0) {
                        hotelRoomFloor = H;
                        hotelRoomHosu = N / H;
                    }
                } else if (H == N) {
                    // 꼭대기층
                    hotelRoomFloor = H;
                    hotelRoomHosu = 1;
                } else {
                    hotelRoomFloor = N % H;
                    hotelRoomHosu = 1;
                }

            System.out.println(hotelRoomFloor+String.format("%02d",hotelRoomHosu));
            }



        }
    }