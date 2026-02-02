public class palindrone {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        str = str.toLowerCase().replaceAll("[^a-z0-9]", "");
        System.out.println(str);
    }
}
