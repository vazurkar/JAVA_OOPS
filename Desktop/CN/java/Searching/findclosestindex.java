public class findclosestindex {
    public static int findClosestIndex(int[] arr ,int target){
        int l=0;
        int r=arr.length-1;
        while(l + 1<r){
            int mid = l+(r-l)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] < target){
                l = mid;
            }
            else{
                r = mid;
            }
        }
        if(arr[l] - target < arr[r] - target){
            return l;
        }
        return r;
    }
    public static void main(String[] args) {
        int[] arr = {10, 22, 14, 3, 76, 54, 32};
        int target = 4;
        
        int closestIndex = findClosestIndex(arr, target);
        
        System.out.println("Index of the closest element to " + target + " is: " + closestIndex);
    }
}
