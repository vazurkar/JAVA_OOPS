import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        // int arr[] = new int[5]; //declaration and memory allocation
        // arr[0] = 10; //initialization
        // arr[1] = 20;
        // arr[2] = 30;
        // System.out.println(arr[0]); //accessing elements
        // System.out.println(arr[1]);
        // int arr[] = {10,20,30,40,50}; //declaration, memory allocation and
        // initialization

        // for(int i=0;i<=arr.length-1;i++){
        // System.out.print(arr[i]+" ");
        // }
        // System.out.println(arr.length);
        // int arr[] = {6,4,3,8,9};
        // int small=arr[0];
        // for(int i=1;i<arr.length;i++){
        // if(arr[i] < small){
        // small = arr[i];
        // }

        // }
        // System.out.println(small);

        // get values from user and print them
        // Scanner sc = new Scanner(System.in);
        // int arr[] = new int [5];
        // for(int i=0;i<arr.length;i++){
        // arr[i] = sc.nextInt();
        // }
        // for (int i : arr) {
        // System.out.print(i+" ");
        // }
        // sc.close();

        // sum of element in array
        // Scanner sc = new Scanner(System.in);
        // int arr[] = new int [5];
        // for(int i=0;i<arr.length;i++){
        // arr[i] = sc.nextInt();
        // }
        // int sum = 0;
        // for (int i : arr) {
        // sum += i;
        // }
        // System.out.println(sum);
        // sc.close();

        // largest number in array
        // Scanner sc = new Scanner(System.in);
        // int arr[] = new int [5];
        // for(int i=0;i<arr.length;i++){
        // arr[i] = sc.nextInt();
        // }
        // int large =Integer.MIN_VALUE;
        // for(int i : arr){
        // if(i>large)
        // {
        // large = i;
        // }
        // }
        // System.out.println("maximum number is "+large);
        // sc.close();

        // smallest number in array
        // Scanner sc = new Scanner(System.in);
        // int arr[] = new int [5];
        // for(int i=0;i<arr.length;i++){
        // arr[i]= sc.nextInt();
        // }
        // int small = Integer.MAX_VALUE;
        // for(int i: arr){
        // if(i<small){
        // small = i;

        // }
        // }
        // System.out.println("minimum number is "+small);
        // sc.close();

        // second largest in array
        // Scanner sc = new Scanner(System.in);
        // int arr[] = new int [7];
        // for(int i=0;i<arr.length;i++){
        // arr[i]= sc.nextInt();
        // }
        // for(int i: arr){
        // System.out.print(i+" ");
        // }
        // int max =arr[0];
        // int max2 =max;
        // for(int i: arr){
        // if(i>max){
        // max2 = max;
        // max =i;
        // }
        // else if(i>max2 && i!=max){
        // max2 = i;
        // }
        // }
        // System.out.println("\nsecond largest is "+max2);
        // sc.close();

        // insertion ina rray
        // Scanner sc = new Scanner(System.in);
        // int size = sc.nextInt();
        // int arr[] = new int[10];
        // for(int i=0;i<=size;i++){
        // arr[i] = sc.nextInt();
        // }
        // for(int i:arr){
        // System.out.print(i+" ");
        // }
        // System.out.println();
        // int pos =2;
        // int element = 25;
        // for(int i=size;i>=pos;i--){
        // arr[i+1] = arr[i];
        // }
        // arr[pos] = element;
        // for(int i:arr){
        // System.out.print(i+" ");
        // }

        // updation in array
        int capacity = takeinput("Enter the size of array");
        int arr[] = new int[capacity];
        for (int i = 0; i < capacity - 1; i++) {
            arr[i] = takeinput("Enter the element at index " + i + ": ");
        }
        int key = takeinput("Enter the element to be updated: ");
        int newkey = takeinput("Enter the new element: ");
        updateelement(arr, key, newkey);
        printelements(arr);

    }
    public static void printelements(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void updateelement(int arr[], int key, int newkey) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                arr[i] = newkey;
                return;

            }
        }

    }

    public static int takeinput(String str) {
        Scanner sc = new Scanner(System.in);
        System.out.print(str);
        int input = sc.nextInt();
        return input;
    }
}
