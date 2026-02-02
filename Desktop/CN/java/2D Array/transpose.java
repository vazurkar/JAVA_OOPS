public class transpose {
    public static void main(String[] args) {
        int a [][]={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int n=a.length;
        int m = a[0].length;
        int[][] transpose = new int[m][n];
         for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                transpose[j][i]=a[i][j];
            }
           
        }
        for (int[] row : transpose) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
