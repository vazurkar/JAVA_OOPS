public class first {
    public static void main(String[] args) {
        String greeting = "Hello, World!";  //assigning a string value to a variable
        System.out.println(greeting);


        //using new keyword
        //1 passing string literal
        String anotherGreeting = new String("Hello, Java!");

        //2 passing char array
        char[] charArray = {'H', 'e', 'l', 'l', 'o'};
        String charArrayString = new String(charArray);   
        System.out.println(anotherGreeting);
        System.out.println(charArrayString); 
        System.out.println(charArray[0]); 

        
    }
}
