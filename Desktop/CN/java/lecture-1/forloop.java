public class forloop {
    public static void main(String[] args) {
        // int n=10;
        // int sum=0;
        // for(int i=1;i<=n;i++){
        // sum=sum+i;
        // }
        // System.out.println("Sum of first " + n + " natural numbers is: " + sum);
        // }

        // PRIME OR NOT

        // int n=13;
        // boolean isPrime = false;
        // for(int i=2;i<n;i++){
        // if(n%i==0){
        // isPrime = true;
        // break;
        // }
        // }
        // if(isPrime){
        // System.out.println(n + " is not a prime number.");
        // }else{
        // System.out.println(n + " is a prime number.");
        // }

        // N is given print first 4 even numbers

        int n = 50;

        for (int i = 1, j = 0; i <= n && j < 4; i++) {
            if (i % 2 == 0) {

                System.out.println(i);
                j++;

            }
        }

    }
}
