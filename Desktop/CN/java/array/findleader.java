public class findleader {
    public static void main(String[] args) {
        int input [] = {13,17,5,4,6};
        int n = input.length;
        int leader = input[n - 1];
        System.out.print(leader+" ");
        for(int i = n - 2; i >= 0; i--){
            if(input[i] > leader){
                leader = input[i];
                System.out.print(leader+" ");
            }
        }
    }
}
