package fraction1;

public class fractionmain {
    public static void main(String[] args) {
        fractionclass f1 = new fractionclass(4,6);
        //f1.increment();
        fractionclass f2 =new fractionclass(4,8);
        f1.add(f2);
        f1.print();
        //f1.print();
    }
}
