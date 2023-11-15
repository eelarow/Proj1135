package OOP2.exec2;

public class Main {
    public static void main(String[] args) {

        Pupil p1 = new Pupil("Abed",3);
        p1.addSubject("mdnyat");
        p1.addSubject("Java");
        p1.addSubject("Eng");
        p1.addSubject("Hebrew");
        System.out.println(p1.toString());

        Pupil p2 = new Pupil(p1);
        System.out.println(p2.toString());
        p2.updateSubject("mdnyat","Math");
        System.out.println(p2.toString());
        System.out.println(p1.toString());







    }
}
