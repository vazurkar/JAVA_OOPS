public class student{
    private int rollno;
    String name;
    static int count=0;

    public student(String n){
        this.name = n;
        count++;
        this.rollno = count;
        
       // displaycount();

    }
    // public void displaycount(){
    //     System.out.println("Number of objects created: " + count);
    // }
    // public int getrollno(){  //getter
    //     return rollno;
    // }
    // public void setrollno(int r){ //setter
    //     rollno = r;
    // }
}