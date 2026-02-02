public class practise {
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
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
