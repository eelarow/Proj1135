package OOP2.exec48;

public class A {
    public int a1;
    private int a2;

    public A() {

        this.a2 = 20;
        this.a1 = 10;
    }

    public A(int a1, int a2) {
        this.a2 = a2;
        this.a1 = a1;
    }

    public int getA2() {
        return this.a2;
    }

    public void setA2(int x) {

        this.a2 = x;

    }

    public int Calc1() {

        return a1 + a2;

    }

    public int Calc2() {
        int sum = 0;

        int i;
        for (i = a1; i <= a2; i++) sum += i;

        return sum;

    }
}