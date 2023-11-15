package OOP2.mfgash2;

public class Program {
    public static void main(String[] args) {
//        point p1 = new point(3, 4);
//        System.out.println(p1);
//        point p2 = new point();
//        System.out.println(p2);
//       // point p3 = new point(3,4);
//        point p3 = p1;
//        if (p1 == p3)
//            System.out.println("Same");
//        else
//        System.out.println("Not the same");
//        p3.setX(7);
//        System.out.println(p1);
//        point p8 = new point(p3);
//        System.out.println(p8);
//
//        if(p3.isEquells(p8))
//            System.out.println("same");
//        else
//            System.out.println("not the same");
//
//        double dist = p2.distance(p1);
//        System.out.println(dist);
//        dist = p1.distance(p2);
//        System.out.println(dist);
//
//        point p4 = p1.Middle(p2);
//        System.out.println(p4);
//        // פעולה בונה מעתיקה

        Point p = new Point(1, 1);
        Circle c = new Circle(p, 5);

        System.out.println("c is  " + c.toString());

        p.setX(0);
        c.getCenter().setY(20);

        System.out.println("c is  " + c.toString());

    }
}
