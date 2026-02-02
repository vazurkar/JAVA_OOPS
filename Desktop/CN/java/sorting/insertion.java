public class insertion {
    public static void main(String[] args) {
        int []arr = {5,2,8,12,1};
        for(int i=1; i<arr.length; i++){
            int current = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > current){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
        System.out.println(arr[arr.length-2]);
    }
}
