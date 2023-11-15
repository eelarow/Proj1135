package OOP2.hachala;

public class Point {

        private double x;
        private double y;
        public Point(double x, double y)
        {
            this.x = x;
            this.y = y;
        }
//    public point()  {
//        this.x = 0;
//        this.y = 0;
//    }

        public Point()  {
            this(0,0);
        }
        public Point(Point other) {
            this(other.x, other.y);
         }

    public double getX() { return this.x; }
        public double getY() { return this.y; }
        public void setX(double x) { this.x = x; }
        public void setY(double y) { this.y = y; }

        public  String toString()
        {
            return "(" + this.x + "," + this.y +")";
        }

        public double distance(Point other)
        {
            return Math.sqrt(Math.pow(this.x - other.getX(), 2) + Math.pow(this.y - other.y, 2));
        }

        public Point Middle(Point other)
        {
            double midX = (this.x + other.x) / 2.0;
            double midY = (this.y + other.getY()) / 2.0;
            Point p = new Point(midX, midY);
            return p ;
        }
    }





