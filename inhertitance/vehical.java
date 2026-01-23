package inhertitance;

public class vehical {
    int maxspeed;
    private String color;

    public void print(){
        System.out.println("vehical class called");
        System.out.println("maxspeed: " + maxspeed + ", color: " + color);
    }
    public void setter(String color){
        this.color = color;
    }
    public String getter(){
        return color;
    }
}
