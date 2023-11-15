package OOP2.yerosha1;

public class Manager extends Employee {
    private String title;

    public Manager(String title,String nameID, Date startDate, double salary){
         super(nameID,startDate,salary);
        this.title = title;

    }
    public Manager(String title,String nameID, Date startDate){
        super(nameID,startDate);
        this.title = title;
    }

    public void add2Salary(double amount){
        super.salary += amount;
    }

    @Override
    public double bonus() {
       // return super.bonus() * 3;
        return super.salary * 3 ;
    }

    @Override
    public String toString() {
        return this.title + " " + super.toString();
    }
}
