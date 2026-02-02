public class checkpermutation {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "cbd";
        boolean isPermutation = true;
        for(int i=0;i<str1.length();i++){
            if(!str2.contains(String.valueOf(str1.charAt(i)))){
                isPermutation = false;
                break;
            }
            else{
                isPermutation = true;
            }
            

        }
        System.out.println(isPermutation);
    }
}
