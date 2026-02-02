import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        // if(num %2==0){
        // System.out.println("Even");

        // }
        // else{
        // System.out.println("Odd");
        // }
        System.out.println("Enter your total marks:");
        double TotalMarks = sc.nextDouble();
        if (TotalMarks >= 65) {
            System.out.println("Enter your GPA:");
            float gpa = sc.nextFloat();
            System.out.println("Enter your stars:");
            int stars = sc.nextInt();
            if (stars >= 3 || gpa >= 3.5) {
                System.out.println("You are eligible for the scholarship");
            } else {
                System.out.println("not eligible");
            }

        }
        else{
            System.out.println("not eligible");
        }

        sc.close();
    }
}
