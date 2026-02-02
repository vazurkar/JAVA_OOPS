import java.util.Scanner;
public class binarytodecimal {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner sc = new Scanner(System.in);
		int decimal = 0;
		int power=0;
		String binary = sc.nextLine(); 
		for(int i= binary.length()-1;i>=0;i--){
			char bit = binary.charAt(i);
			if(bit == '1'){
				decimal += Math.pow(2,power);
			}
			power++;
		}
		System.out.println(decimal);

	}
}
