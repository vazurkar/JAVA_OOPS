import java.util.Scanner;

public class rotationofarray {
    public static void main(String[] args) {
        int A[] = {1,2,3,4,5,6,7};
        int len = A.length;
        int B[] = new int[len];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rotations");
        int x = sc.nextInt();
        System.out.println("to rotate right direction press 1 and to rotate left direction press 2");
        int dir = sc.nextInt();
        if(dir == 1){
            for(int i=0;i<len;i++){
                B[(i+x)%len] = A[i];
            }
        }
        else{
            for(int i=0;i<len;i++){
                B[(i-x+len)%len] = A[i];
            }
        }

        for(int i:A){
            //System.out.println("Array A is");
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i:B){
           // System.out.println("Array B is");
            System.out.print(i+" ");
        }
    }
}         