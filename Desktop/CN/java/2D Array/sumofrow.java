public class sumofrow {
    public static void main(String[] args) {
        int mat[][] = {{1,2},{3,4},{5,6}};
        int n = mat.length;
        int m = mat[0].length;
        
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=0;j<m;j++){
                sum += mat[i][j];
            }
            System.out.print(sum+" ");
        }
    }
}
