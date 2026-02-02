public class stringcontainornot {
    public static void main(String[] args) {
        String str = "aabccbaa";
        String finalstring = "";
        for(int i=0;i<str.length()-1;i++){
            if(finalstring.contains(String.valueOf(str.charAt(i)))){
                continue;
            }
            else{
                finalstring = finalstring + str.charAt(i);
                
            }
        }
        System.out.println(finalstring);
    }
}
