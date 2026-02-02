package variouspattern;

import java.util.Scanner;

public class numberpattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    // for(int i =1;i<=n;i++){
    //     for(int j=1;j<=n;j++){
    //         System.out.print(i);
    //     }
    //     System.out.println();
    // }

    // for(int i =1;i<=n;i++){
    //     for(int j=1;j<=n;j++){
    //          System.out.print(j);
    //      }
    //      System.out.println();
    //  }


        for(int i =1;i<=n;i++){
        for(int j=n;j>=1;j--){
             System.out.print(j);
         }
         System.out.println();
     }

    }
    
}
