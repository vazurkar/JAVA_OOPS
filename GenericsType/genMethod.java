package GenericsType;

public class genMethod {
    public static <E extends PrintInterface> void printArray(E[] array) {
        for (E element : array) {
            element.print();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // Integer[] intArray = {1, 2, 3, 4, 5};
        // String[] strArray = {"Hello", "World", "Generics", "in", "Java"};

        // System.out.println("Integer Array:");
        // printArray(intArray);

        // System.out.println("\nString Array:");
        // printArray(strArray);

        Vehical v[] = new Vehical[5];
        for(int i=0;i<5;i++){
            v[i] = new Vehical(100 + i*10, "Company" + (i+1));
        }
        printArray(v);
    }
}
