package variouspattern;
import java.util.Scanner;
public class CharPattern {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // for(int i=1;i<=n;i++){
        //     char p =(char)('A'+i-1);
        //     for(int j=1;j<=n;j++){
                
        //         System.out.print(p); //print char
        //         p=(char)(p+1);
        //     }
        //     System.out.println(); //new line after each row
        // }

        // char lastchar = (char)('A'+n-1);
        // for(int i=0;i<n;i++){
        //     for(char ch = (char)(lastchar-i);ch<=lastchar;ch++){
        //         System.out.print(ch); //print char
        //     }
        //     System.out.println(); //new line after each row
        // }

        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n-i+1;j++){
        //         System.out.print("x");
        //     }
        //     System.out.println(); //new line after each row
        // }



        // for(int i=n;i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(i);
        //     }
        //     System.out.println(); //new line after each row
        // }

        for(int i=1;i<=n;i++){
            for(int k=1;k<=n-i;k++){
                System.out.print(" "); //print space
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(); //new line after each row
        }
    }
}
