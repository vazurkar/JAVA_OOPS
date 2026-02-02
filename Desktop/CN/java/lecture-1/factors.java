import java.util.Scanner;
public class factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        boolean count=false;
        for(int i=2;i<n;i++){
            if(n%i==0){
                //count++;
                System.out.print(i + " ");
                count=true;
            }
        }
        if(!count) {
            System.out.println(-1);
        }
           
       
}
    }
