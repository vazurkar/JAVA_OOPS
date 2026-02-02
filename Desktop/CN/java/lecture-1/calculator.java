import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // float totalMarks = sc.nextFloat();
        // int score = sc.nextInt();
        // // float totalMarks = 800;
        // // int score =540;
        // double percentage = (score / totalMarks)  * 100;
        // System.out.println("Percentage " + percentage + "%");
        // sc.close(); // when we are done with the scanner, we close it to free resources

        //average of 3 numbers
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b =sc.nextInt();
        int c=sc.nextInt();
        System.out.println((a+b+c)/3);1
        sc.close();
    }
}
