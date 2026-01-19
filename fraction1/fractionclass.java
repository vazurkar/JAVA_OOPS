package fraction1;

public class fractionclass {
    private int numerator;
    private int denominator;
   

    public fractionclass(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        simplify();
       // print();
    }

    private void simplify() {
       int gcd=0;
       for(int i=2;i<=Math.min(numerator,denominator);i++){
           if(numerator%i==0 && denominator%i==0){
               gcd=i;
           }
       }
       if(gcd!=0){
           numerator/=gcd;
           denominator/=gcd;
       }
    }
    public void add (fractionclass f2){
        this.numerator = this.numerator * f2.denominator +this.denominator * f2.numerator;
        this.denominator = this.denominator * f2.denominator;
        simplify();

    }
    public void print() {
        System.out.println(numerator + "/" + denominator);
    }
    public void increment(){
        numerator+=denominator;
        simplify();
        print();
    }
}
