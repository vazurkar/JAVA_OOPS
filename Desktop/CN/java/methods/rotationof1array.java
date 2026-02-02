import java.util.Scanner;

public class rotationof1array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rotations");
        int x = sc.nextInt();
        System.out.println("to rotate right direction press 1 and to rotate left direction press 2");
        int dir = sc.nextInt();
        int A[] = {1,2,3,4,5,6,7};
        if(dir == 1){
            reverse(A,0,A.length-1);
            reverse(A,0,x-1);
            reverse(A,x,A.length-1);
        }
        else{
            reverse(A,0,A.length-1);
            reverse(A,0,A.length-x-1);
            reverse(A,A.length-x,A.length-1);
        }
        for(int i:A){
            System.out.print(i+" ");
        }

    }
    public static void reverse(int a[],int start,int end){
        while(start<end){
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    }
}
