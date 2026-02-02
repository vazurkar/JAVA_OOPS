public class mergetwoarray {
    public static void main(String[] args) {
        int []a = {1,3,5,9,13,23};
        int b[] = {2,4,6,8};
        int c[] = new int [a.length + b.length];
        int i=0;int j=0; int k=0;
        while(i<a.length && j<b.length){
            if(a[i] < b[j]){
                c[k] = a[i];
                k++; i++;
            }
            else{
                c[k] = b[j];
                k++; j++;
            }
        }
        while(i<a.length){
            c[k] = a[i];
            k++; i++;
        }
        while(j<b.length){
            c[k] = b[j];
            k++; j++;
        }
        for(int index=0; index<c.length; index++){
            System.out.print(c[index] + " ");

    }
}
}
