import java.util.Scanner;

public class runtimeinput {
    public static int[][] takeinput(){
         Scanner sc = new Scanner (System.in);
        System.out.println("Enter number of rows");
        int rows = sc.nextInt();
        System.out.println("Enter number of columns");
        int columns = sc.nextInt();
        int arr [][]= new int [rows][columns];
        System.out.println("Enter the elements of array");

        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                arr[i][j]= sc.nextInt();
            }
        }
        return arr;
    }
    public static void printinput(int[][] arr){
        System.out.println("The elements of array are:");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] arr = takeinput();
        printinput(arr);
    }
}
