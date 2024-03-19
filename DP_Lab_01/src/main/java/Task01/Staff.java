package Task01;

public class Staff extends Employee{

    public String title;
    public Staff(String name, String address, String phoneNumber, String emailAddress,String office,double salary, MyDate dateHired, String title){
        super(name, address, phoneNumber, emailAddress, office, salary, dateHired);
        this.title = title;
    }

//    public double getSalary(){
//        return this.salary;
//    }
    @Override
    public String toString(){
        return name + " is an Object of Staff class.";
    }

}
