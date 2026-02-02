public class palindrome {
    public static void main(String[] args) {
        String str = "madam";
        String reversedStr = "";
        
        // Reversing the string using 2 string
        for(int i = str.length() - 1; i >= 0; i--) {
            reversedStr += str.charAt(i);
        }
        
        // Checking if the original string is equal to the reversed string
        if(str.equals(reversedStr)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }


        // Reversing the string using single string using 2 pointer approach
        if(isPalindrome(str)){
        int s=0;
		int l=str.length()-1;
		while(s < l){
			if(str.charAt(s)!=str.charAt(l)){
				return false;
			}
			s++;
			l--;
		}
		return true;
    }
}
