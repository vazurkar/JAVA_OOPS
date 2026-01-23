package classcast;

public class main {
    public static void main(String[] args) {
        vehical v1 = new car(); //upcasting
        car c1 = (car)v1; //downcasting
       // v1.doors = 4;         //assigning value to child class variable
        c1.doors = 4; //by using downcasting we can access child class variable
    }
}
