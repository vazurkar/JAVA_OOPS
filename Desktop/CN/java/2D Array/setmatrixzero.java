public class setmatrixzero {
    public static void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        boolean zerorows [] = new boolean[n];
        boolean zerocolumns [] = new boolean[m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0){
                    zerorows[i] = true;
                    zerocolumns[j]=true;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(zerorows[i] == true || zerocolumns[j]==true){
                    matrix[i][j]=0;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }


    }
       
    public static void main(String[] args) {
        int [][] matrix = {{7,19,3},{4,21,0}};
        setZeroes(matrix);
    }
}
