package variouspattern;

import java.util.Scanner;

public class morepattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // for(int i=0;i<n;i++){

        // for(int j=1;j<n-i;j++){
        // System.out.print("_");
        // }
        // for(int j=1;j<=2*i+1;j++){
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // for(int i=0;i<n;i++){
        // char lastchar = (char)('A'+n-1);
        // for(char ch =lastchar;ch>= (char)(lastchar-i);ch--){
        // System.out.print(ch); //print char
        // }
        // System.out.println(); //new line after each row
        // }

       
    //     int mid = n / 2;
    //  // Top half including middle
    //     for (int i = 0; i <= mid; i++) {
    //         for (int j = 0; j < mid - i; j++)
    //             System.out.print(" ");
    //         for (int j = 0; j < 2 * i + 1; j++)
    //             System.out.print("*");
    //         System.out.println();
    //     }

    //    // Bottom half
    //     for (int i = mid - 1; i >= 0; i--) {
    //         for (int j = 0; j < mid - i; j++)
    //             System.out.print(" ");
    //         for (int j = 0; j < 2 * i + 1; j++)
    //             System.out.print("*");
    //         System.out.println();
    //     }

    //     int mid = n/2;
    // for(int i=0;i<n;i++){
    //     for(int j=n-i;j>=1;j--){
    //         System.out.print(j);
    //     }
    //     System.out.println();
    // }
    // for(int i=0;i<=mid;i++){
    //     for(int j=mid+i;j>=1;j--){
    //         System.out.print(j);
    //     }
    //     System.out.println();
    // }
        
        // for(int i=n;i>=1;i--){
        //     for(int j=i;j>=1;j--){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }
        // for(int i=2;i<=n;i++){
        //     for(int j=i;j>=1;j--){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        // for (int i = 0; i < n; i++) {
        //     int number = 1;

        //     // Print leading spaces
        //     for (int j = 0; j < n - i; j++) {
        //         System.out.print(" ");
        //     }

        //     // Print row values
        //     for (int j = 0; j <= i; j++) {
        //         System.out.print(number + " ");
        //         number = number * (i - j) / (j + 1);
        //     }
        //     System.out.println();
        // }



        for(int i=0;i<n;i++){
			for(int j=1;j<=n-i-1;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=2*i+1;k++){
				System.out.print("*");
			}
			System.out.println();
		} 
    }
}
