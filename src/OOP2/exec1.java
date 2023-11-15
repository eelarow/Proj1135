package OOP2;

public class exec1 {
    public static void main(String[] args) {
        StudentGrade std1;
        std1 = new StudentGrade(100,93,91,"omar");
//        std1.projGrade = 100;
//        std1.magenGrade = 90;
//        std1.bagrutGrade = 91;
//        std1.name = "omar";
        std1.setProjGrade(80);
        System.out.println(std1.finalGrade());
        System.out.println(std1.print());
        std1.setProjGrade(-80);
        System.out.println(std1.print());
        System.out.println(std1.getBagrutGrade());

        System.out.println(std1.toString());

        //System.out.println(std1.toString());



    }

}
