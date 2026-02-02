import java.util.Scanner;
public class power {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n =sc.nextInt();
		long result=1;                        //5 9
		if( n==0){
			result=1;
		}else{
			for(int i=0;i<n;i++){
			result=result*x;
		}
		}
		
		System.out.print(result);
    }
    }

