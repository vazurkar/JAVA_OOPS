import java.util.Scanner;
public class reversearray {
    public static void main(String[] args) {
        int length = takeinput("Enter capacity of array");
        int arr[] = new int[length];
        for(int i=0;i<length;i++){  
            arr[i] = takeinput("Enter the element at index "+i+": ");
        }
        printarray(arr);
        System.out.println();
        reverse(arr);
    }
    public static void reverse(int arr[]){
        int start = 0;
        int last = arr.length-1;
        int temp=0;
        while(start < last){
            temp = arr[start];
            arr[start] = arr[last];
            arr[last] = temp;
            start++;
            last--;
        }
        printarray(arr);
        
        
    }
    public static void printarray(int arr[]){
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    public static int takeinput(String str){
        Scanner sc = new Scanner (System.in);
        System.out.println(str);
        int input = sc.nextInt();
        return input;
    }
}
