public class Rectangle {
    private final double length,breadth;

    Rectangle(double length,double breadth) {
        this.length = length;
        this.breadth= breadth;
    }

    public double area(){
        return length*breadth;
    }
}
