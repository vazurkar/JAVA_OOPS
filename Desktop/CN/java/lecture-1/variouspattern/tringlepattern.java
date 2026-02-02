package variouspattern;

import java.util.Scanner;

public class tringlepattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // for (int row = 1; row <= n; row++) {
        //     for (int space = 1; space <= n - row; space++) {
        //         System.out.print(" ");
        //     }
        //     for (int inc = row; inc < 2 * row; inc++) {
        //         System.out.print(inc);
        //     }
        //     for (int dec = 2 * row - 2; dec >= row; dec--) {
        //         System.out.print(dec);
        //     }
        //     System.out.println();
        // }

        // for(int i=1;i<=n;i++){
        //     for(int k=1;k<=n-i;k++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j);
        //     }

        //     for(int l=i-1;l>=1;l--){
        //         System.out.print(l);
        //     }
        //     System.out.println();
        // }




        for(int i=1;i<=n;i++){
            for(int j=1;j<=i-1;j++){
                System.out.print(" ");
            }
            for(int k=i;k<=n;k++){
                System.out.print(k+" ");
            }
            System.out.println( );
        }
        for(int i=n-1;i>=1;i--){
            for(int j=1;j<=i-1;j++){
                System.out.print(" ");
            }
            for(int k=i;k<=n;k++){
                System.out.print(k+" ");
            }
             System.out.println( );
        }
    }

}
