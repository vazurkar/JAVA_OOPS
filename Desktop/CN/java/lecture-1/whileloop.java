import java.util.Scanner;

public class whileloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //REVERSE A NUMBER
        // int n = sc.nextInt();
        // int reverse = 0;

        // while (n != 0) {
        //     int digit = n % 10;
        //     reverse = reverse * 10 + digit;
        //     n = n / 10;

        // }
        // System.out.println(reverse);
        // sc.close();


        //FIBONACCI SERIES
    //     int a=0;
    //     int b=1;
    //     System.out.print(a);
    //     System.out.print(b);
    //    // int n=sc.nextInt();
    //     int count=8;
    //     while(count>0){
    //         int c=a+b;
    //         System.out.print(c);
    //         a=b;
    //         b=c;
    //         count--;
    //     }

        //PRIME NUMBER
        int n = sc.nextInt();
        boolean isPrime = true;
        for(int i=1;i<=n;i++){
            if(i%i !=0){
                System.out.println(i);
        }
    }
}
    }

