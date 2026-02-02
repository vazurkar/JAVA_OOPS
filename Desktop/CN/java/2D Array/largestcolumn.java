public class largestcolumn {
    public static void main(String[] args) {
        int [][]a = {
            {1, 2, 3,9 },
            {4, 5, 6,8 },
            {7, 8, 9,3 },
            {1, 0, 2,4 }
        };
        int n=a.length;
        int m=a[0].length;
        int largest = Integer.MIN_VALUE;

        int columnindex = -1;
        for(int i=0;i<m;i++){
            int sum=0;
            for(int j=0;j<n;j++){
                sum+=a[j][i];
            }
            if(sum > largest){
                largest = sum;
                columnindex = i;
            }
        }
        System.out.println("Largest column sum is " + largest + " at column index " + columnindex);
    }
}
