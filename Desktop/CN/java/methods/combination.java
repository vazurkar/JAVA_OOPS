import java.util.Scanner;
public class combination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        if(n<0 || r<0 || r>n){
            System.out.println("Invalid numbers ");
            return;
        }
        else{
            System.out.println((fact(n))/(fact(r)*fact(n-r)));
        }
        
    }
     public static int fact(int n) {
		// Write your code here
		int facto = 1;
		for(int i=n;i>=1;i--){
			facto = facto*i;
		}
		return facto;
	}
    
}
