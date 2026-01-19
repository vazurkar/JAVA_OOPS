package Complesproblem;

public class complexmain {
    public static void main(String[] args) {
        int real1 = 4;
		int imaginary1 = 5;

		int real2 = 1;
		int imaginary2 = 2;

		complexclass c1 = new complexclass(real1, imaginary1);
		complexclass c2 = new complexclass(real2, imaginary2);
        //c1.print();
        c1.multiply(c2);
        c1.print();
        c2.print();

    }
}
