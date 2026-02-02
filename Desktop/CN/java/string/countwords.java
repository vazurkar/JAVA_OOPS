public class countwords {
    public static void main(String[] args) {
        String sentence = "This is a sample sentence with several words are here";
        // int count = 0;
        // for(int i = 0; i < sentence.length(); i++) {    // Iterate through each character
        //     if(sentence.charAt(i) == ' ') {
        //         count++;
        //     }
        // }
        // count++; // To account for the last word

        //efficiant way
        String count[] = sentence.split(" "); //split string using spaces and stored it in array
        System.out.println("Number of words: " + count.length);
    }
}
