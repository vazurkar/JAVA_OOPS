import java.util.Scanner;

public class arrangearray {
    public static void main(String[] args) {
       // Scanner sc = new Scanner(System.in);
       int arr[] = new int[11];
       int ptnA = 0;
       int ptnB = arr.length-1;
       int element=1;
       while(ptnA < ptnB){
        arr[ptnA++] = element++;
        arr[ptnB--] = element++;
       }
       if (ptnA == ptnB){
        arr[ptnA] = element;
        

        
        }
         for(int i:arr){
            System.out.print(i+" ");
    }
}
}