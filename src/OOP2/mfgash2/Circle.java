package OOP2.mfgash2;

    public class Circle {
        private Point center;
        private int radius;

        public Circle(Point center,
                      int radius) {
            this.center = center;
            this.radius = radius;
        }
        public String toString() {
            return "center: "
                    + center.toString()
                    + ", radius: " + radius;
        }
        public int   getRadius() {return radius;}
        public Point getCenter() {return center;}
    } // class Circle


