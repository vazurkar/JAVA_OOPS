public class findpair {
    public static void main(String[] args) {
        int arr1[] = {10,20,30};
        int arr2[] = {17,15};
        int diff = Integer.MAX_VALUE;
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(diff > Math.abs(arr1[i]-arr2[j])){
                    diff = Math.abs(arr1[i]-arr2[j]);
                    
                }
            }
        }
        System.out.println(diff);
    }
}
