package OOP2.exec48;

public class Program {
    public static void main(String[] args) {

        A obj1 = new A();
        A obj2 = new A(4, 9);

        int y = obj1.Calc2() + obj2.Calc2();

        System.out.println(y);

    }
}
