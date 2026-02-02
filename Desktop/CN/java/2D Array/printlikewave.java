public class printlikewave {
    public static void main(String[] args) {
        int a [][]={
            {1,2,3},
            {4,5,6},
            {7,8,9}
            
        };
        int n=a.length;
        int m = a[0].length;
        for(int j=0;j<m;j++){
            if(j%2==0){
                for(int i=0;i<n;i++){
                    System.out.print(a[i][j] + " ");
                }
            }else{
                for(int i=n-1;i>=0;i--){
                    System.out.print(a[i][j] + " ");
                }
            }
        }
    }
}
