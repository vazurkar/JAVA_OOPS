public class largestcolumnorrow {
    public static int[] largestcolumn(int [][] a){
        int n = a.length;
        int m = a[0].length;
        int maxsum = Integer.MIN_VALUE;
        int columnindex = -1;
        for(int j=0;j<m;j++){
            int sum =0;
            for(int i=0;i<n;i++){
                sum += a[i][j];
            }
            if (sum > maxsum){
                maxsum = sum;
                columnindex = j;
            }
        }
      //  System.out.println("Largest column index: " + columnindex + " with sum: " + maxsum);
        return new int[]{columnindex, maxsum};
    }
    public static int[] largestrow(int [][] a){
        int n = a.length;
        int m = a[0].length;
        int maxsum = Integer.MIN_VALUE;
        int rowindex = -1;
        for(int i=0;i<n;i++){
            int sum =0;
            for(int j=0;j<m;j++){
                sum += a[i][j];
            }
            if (sum > maxsum){
                maxsum = sum;
                rowindex = i;
            }
        }
       // System.out.println("Largest row index: " + rowindex + " with sum: " + maxsum);
        return new int[]{rowindex, maxsum};
    }
    public static void main(String[] args) {
        int [][]a = {
            {1, 2, 3,9 },
            {4, 5, 6,8 },
            {7, 8, 9,3 },
            {1, 0, 2,4 }
        };
        largestcolumn(a);
        largestrow(a);
        if(largestcolumn(a)[1] > largestrow(a)[1]){
            System.out.println("Column " + largestcolumn(a)[0] + " has the largest sum of " + largestcolumn(a)[1]);
        } else {
            System.out.println("Row " + largestrow(a)[0] + " has the largest sum of " + largestrow(a)[1]);
        }
    }
}
