package Task01;

public class Faculty extends Employee{
    String officeHours;
    String rank;
    public Faculty(String name, String address, String phoneNumber, String emailAddress,String office,double salary, MyDate dateHired, String officeHours, String rank){
        super(name, address, phoneNumber, emailAddress, office, salary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }
    @Override
    public String toString(){
        return name + " is an Object of Faculty class.";
    }

}
