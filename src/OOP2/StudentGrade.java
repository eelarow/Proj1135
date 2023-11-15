package OOP2;

public class StudentGrade {
   private String name;
   private int projGrade;
    private int magenGrade;
   private int bagrutGrade;

    public StudentGrade(int projGrade,int magenGrade,int bagrutGrade, String name)
    {
       this.projGrade = projGrade;
       this.magenGrade = magenGrade;
       this.bagrutGrade = bagrutGrade;
       this.name = name;
    }

    public StudentGrade(int projGrade,int bagrutGrade, String name)
    {
        this.projGrade = projGrade;
        this.magenGrade = 100;
        this.bagrutGrade = bagrutGrade;
        this.name = name;
    }
    public StudentGrade()
    {

        this.name = "name";
    }
    public void setProjGrade(int projGrade) {
        if (projGrade >=0 && projGrade<=100) {
            this.projGrade = projGrade;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMagenGrade(int magenGrade) {
        if (magenGrade >=0 && magenGrade<=100) {
            this.magenGrade = magenGrade;
        }
    }

    public void setBagrutGrade(int bagrutGrade) {
        if (bagrutGrade >=0 && bagrutGrade<=100) {
            this.bagrutGrade = bagrutGrade;
        }
    }

    public String getName() {
        return name;
    }

    public int getProjGrade() {
        return projGrade;
    }

    public int getMagenGrade() {
        return magenGrade;
    }

    public int getBagrutGrade() {
        return bagrutGrade;
    }

    public int finalGrade()
    {
        double fGrade = (this.projGrade* 0.24 + this.magenGrade *0.38 + this.bagrutGrade * 0.38);
        return (int)(fGrade + 0.5);
    }
   public String print(){
        String s = "The final Grade of " + this.name + " is: " + finalGrade();
        return  s;
    }
    public String toString(){
        String s = "The final Grade of (toString)" + this.name + " is: " + finalGrade();
        return  s;
    }


}
