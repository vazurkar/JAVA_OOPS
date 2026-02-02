
package variouspattern;
import java.util.Scanner;
public class tringle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // for(int i =1;i<=n;i++){
        //     for( int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();

        // }

       // int p=1;
        // for(int i=1;i<=n;i++){
        //     p = i;
        //     for(int j =1;j<=i;j++){
                
        //         System.out.print(p);

        //         p++;

        //     }
        //     System.out.println();
        // }


        for (int i=1;i<=n;i++){
            int p=n;
            for (int j=1;j<=i;j++){
                System.out.print(p);
                p--;
            }
            System.out.println();
        }

    }
}
