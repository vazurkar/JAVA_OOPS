package variouspattern;
import java.util.Scanner;
public class pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // for(int i=1;i<=n;i++){  //row
        //     for(int j=1;j<=n-i;j++){ //space
        //         System.out.print(" "); //print space
        //     }
        //     for(int j=1;j<=2*i-1;j++){
        //         System.out.print(j); //print star
        //     }
        //     System.out.println(); //new line after each row
        // }


        // for(int i=1;i<=n;i++){  //row
        //     for(int j=1;j<=n-1;j++){ //space
        //         System.out.print(" "); //print space
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print(i+" "); //print star
        //     }
        //     System.out.println();


        // for(int i=1;i<=n;i++){
        //     int p=i;
        //     for(int j=1;j<=i;j++){
        //         System.out.print(p+" "); //print number
        //         p--;
        //     }
        //     System.out.println(); //new line after each row
        // }


        // for(int i=0;i<n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(" "); //print space
        //     }

        //     for(int k=0;k<n-i;k++){
        //         System.out.print("* "); //print star
        //     }
        //     System.out.println(); //new line after each row
        // }



        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         int p = (i+j)%n+1;
        //         System.out.print(p);
        //     }
        //     System.out.println(); //new line after each row
        // }


        // for(int i=0;i<n;i++){
        //      for(int j=1;j<=i;j++){
        //          System.out.print(" "); //print space
        //      }

        //      for(int k=0;k<n-i;k++){
        //          System.out.print("* "); //print star
        //      }
        //      System.out.println(); //new line after each row
        //  }


        for(int i=0;i<n;i++){
            for (int j=1;j<=n;j++){
                if(i==0 ||i==n-1){
                    System.out.print(j);
                }
                else{
                    if(j==1){
                        System.out.print("1");
                    }
                    else if(j==n){
                        System.out.print("2");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                
            }
            System.out.println();
        }


    }
}


