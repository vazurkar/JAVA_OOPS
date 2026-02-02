public class pushzerotoend {
    public static void main(String[] args) {
        int arr[] ={2,3,-1,-5,-3,4,9,-5};
        pushpositive(arr);
        
    }

    public static void pushpositive(int arr[]){
        int p=0; int n=0;
        while(n<arr.length){
            if(arr[n]<=0){
                int temp = arr[p];
                arr[p] = arr[n];
                arr[n] = temp;
                p++;
                n++;
            }
            else{
                n++;
            }
        }
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    // public static void pushzeros(int arr[]){
    //     int nz=0;int z=0;
    //     for(int i=0;i<arr.length;i++){
    //         if(arr[z] !=0){
    //             int temp = arr[nz];
    //             arr[nz] = arr[z];
    //             arr[z] = temp;
    //             z++;
    //             nz++;
    //         }
    //         else{
    //             z++;
    //         }

    //     }
    //     for(int i:arr){
    //         System.out.print(i+" ");
    //     }
        
    // }
}
