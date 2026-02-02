public class rowwisetraversal {
    public static void main(String[] args) {
        int[][] a = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int n = a.length;
        int m = a[0].length;
        int result[] = new int [n*m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                result[j+i*m] =a[i][j]; 
            }

        }
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }}}
