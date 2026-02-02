package GenericsType;

public class Vehical implements PrintInterface {
    int maxspeed;
    String company;
    public Vehical(int maxspeed, String company) {
        super();
        this.maxspeed = maxspeed;
        this.company = company;
    }
    public void print(){
        System.out.println("Max Speed: " + maxspeed + ", Company: " + company);
    }
}
