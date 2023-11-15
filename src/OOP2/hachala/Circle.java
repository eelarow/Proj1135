package OOP2.hachala;

public class Circle {
    private Point center;
    private int radius;

    public Circle()
    {
        this.center = new Point();
        this.radius =1;
    }

    public Circle(Point center,
                  int radius) {
        this.center = center;
        this.radius = radius;
    }

//    public Circle(Point center,
//                  int radius) {
//        this.center = new Point(center);
//        this.radius = radius;
//    }

    public String toString() {
        return "center: "
                + this.center.toString()
                + ", radius: " + this.radius;
    }
    public int   getRadius() {return radius;}



    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Point getCenter() {return center;}

    public void setCenter(Point center) {
        this.center = center;
    }

}
