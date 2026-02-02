import java.util.Scanner;
public class fartocel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int step = sc.nextInt();

        for( int i = start; i <= end; i += step){

            int cel = (int)((i - 32) * 5.0 / 9.0);
            System.out.println(i + " " + cel);
        }



    }
}
