package OOP2.hachala;

public class Program {
    public static void main(String[] args) {
//1
        Point p1 = new Point(5,3);
        Circle c = new Circle(p1,2);

        p1.setX(7);
        System.out.println(c.toString());
        //2
        Point p2 = new Point(5,3);
        Circle c2 = new Circle(p2, 2);
        p2.setX(7);
        System.out.println(c2.toString());

//        Point p = new Point(1, 1);
//        Circle c = new Circle(p, 5);
//
//        System.out.println("c is  " + c.toString());
//
//        p.setX(0);
//        c.getCenter().setY(20);


    }
}
