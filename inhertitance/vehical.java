package inhertitance;

public class vehical {
    int maxspeed;
    private String color;
    // public vehical(){
    //     System.out.println("vehical constructor called");
    // }
    public vehical(){
        System.out.println("vehical constructor called");
        //this.maxspeed = max;

    }

    public void print(){
        // System.out.println("vehical class called");
        // System.out.println("maxspeed: " + maxspeed + ", color: " + color);
        System.out.println(" VEHICAL   maxspeed: " + maxspeed  );
    }
    public void setter(String color){
        this.color = color;
    }
    public String getter(){
        return color;
    }
}
