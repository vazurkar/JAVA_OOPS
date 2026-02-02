import java.util.Scanner;
public class method {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();

        int n = sc.nextInt();
        
        
         System.out.println(palindrome(n));
    }
    public static boolean palindrome(int n){
        int rev = 0;
        int temp = n;
        while(n>0){
            int lastdigit = n%10;
            rev = rev*10 + lastdigit;
            n = n/10;
        }
        if(rev == temp){
            return true;
        }
        else{
            return false;
        }
    }

    // public static int add(int x, int y, int z){

    //     return x+y+z;
    // }
    // public static int fact(int n) {
	// 	// Write your code here
	// 	int facto = 1;
	// 	for(int i=n;i>=1;i--){
	// 		facto = facto*i;
	// 	}
	// 	return facto;
	// }
       


}
