package OOP2.yerosha1;

public class Employee {
    private final double DEF_SALARY = 10000;
    private String nameID;
    private Date startDate;
  //  private double salary;
    protected double salary;

    public Employee(String nameID, Date startDate, double salary)
    {
        this.nameID = nameID;
        this.startDate = startDate;
        if (salary > 0)
            this.salary = salary;
        else this.salary = DEF_SALARY;
    }
    public Employee(String nameID, Date startDate) {
           this(nameID, startDate, 10000) ; }

    public double bonus() { return this.salary * 1.5; }

    public  String toString()
    {
        String s = this.nameID + " started working at " + this.startDate.toString() +
                   " with salary of " +  this.salary  + " Annual bonus is " + this.bonus() + "!";
        return s;
    }

    public String getNameID() {
        return nameID;
    }



    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
}
