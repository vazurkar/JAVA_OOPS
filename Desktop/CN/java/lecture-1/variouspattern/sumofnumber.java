
package variouspattern;
import java.util.Scanner;
public class sumofnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int even=0,odd=0,num=0,length=String.valueOf(n).length();
        for(int i=1;i<=length;i++){
            num = n%10;
            n=n/10;
            if(num%2==0){
                even = even + num;
            }
            else{
                odd = odd + num;
            }
        }
        System.out.print(even + " " + odd);
    }
}
