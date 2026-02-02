import java.util.Scanner;

public class tearmsofAP {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int result = 0;
        int limit = n;
        for(int i=1;i<=limit;i++){
            result = (3 * i) + 2;
            if(result % 4 != 0) {
                System.out.print(result + " ");
            }
            else{
                limit++; // Increment limit to ensure we get n valid terms
            }
        }
    }
}
