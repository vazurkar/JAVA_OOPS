package inhertitance;

public class car extends vehical {
    int doors;
    public void print(){
        super.print();  //calling parent class print function
        System.out.println("car class called");
        System.out.println("maxspeed: " + maxspeed + ", color: " + getter() + ", doors: " + doors);
    // use getter to access private variable color from parent class
    }
}
