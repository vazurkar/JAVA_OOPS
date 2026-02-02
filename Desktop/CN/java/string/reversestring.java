public class reversestring {
    public static void main(String[] args) {
        String s1="Hello";
        String reversedString="";
        for(int i=0;i<s1.length();i++){
            reversedString=s1.charAt(i)+reversedString;
        }
        System.out.println("Reversed String: "+reversedString);
    }
}
