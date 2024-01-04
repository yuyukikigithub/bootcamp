public class Staff {

    private double salary;

    private String name;

    public Staff(String name, double salary){
        this.name=name;
        this.salary=salary;
    }
    public String getName(){
        return this.name;
    }
    public double getSalary(){
        return this.salary;
    }
    public String toString(){
        return "Staff(Name: "+this.name+",Salary: "+this.salary+")";
    }
}
