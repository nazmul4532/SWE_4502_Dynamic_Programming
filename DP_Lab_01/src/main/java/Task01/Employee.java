package Task01;

public class Employee extends Person{
    public String office;
    protected double salary;
    public MyDate dateHired;
    public Employee(String name, String address, String phoneNumber, String emailAddress,String office, double salary, MyDate dateHired){
        super(name,address,phoneNumber,emailAddress);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    public double getSalary(){
        return this.salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public String toString(){
        return name + " is an Object of Employee class.";
    }

}
