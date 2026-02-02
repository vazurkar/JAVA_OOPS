import java.util.Scanner;
public class arrayquestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // for(int i=0;i<arr.length;i++){
        //     arr[i] = sc.nextInt();
        // }

        // int unique = 0;
        // for(int i=0;i<arr.length;i++){
        //     for(int j=i+1;j<arr.length;j++){
        //         if(arr[i] == arr[j]){
        //             unique = arr[i];
        //         }
                
        //     }
        // }
        // System.out.println(unique);
        // sc.close();

        // int arr1[] = {2,6,1,2};
        // int arr2[] = {1,2,3,4,2};

        // for (int i = 0; i < arr1.length; i++) {
        //     for (int j = 0; j < arr2.length; j++) {
        //         if (arr1[i] == arr2[j]) {
        //             System.out.print(arr1[i] + " ");
        //             arr2[j] = -1; // mark as used
        //             break; // move to next element in arr1
        //         }
        //     }
        // }
        // sc.close();
        


        int arr[] = {0,1,1,0,1,0,1};
        int placezero =0;
        int temp=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] ==0){
                temp = arr[i];
                arr[i] = arr[placezero];
                arr[placezero] = temp;
                placezero++;
            }
        }
        for (int i : arr) {
            System.out.print(i+" ");
        }

    }
}
