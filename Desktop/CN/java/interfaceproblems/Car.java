package interfaceproblems;

public class Car implements VehicalInerface {
    private int speed;  // state belongs in the class

    @Override
    public void start() {
        speed = 20;
        System.out.println("Car started. Speed: " + speed);
    }

    @Override
    public void stop() {
        speed = 0;
        System.out.println("Car stopped. Speed: " + speed);
    }
}