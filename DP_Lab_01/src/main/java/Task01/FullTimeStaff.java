package Task01;

public class FullTimeStaff extends Staff{
    public FullTimeStaff(String name, String address, String phoneNumber, String email, String office, double salary,
                         MyDate dateHired, String title)
    {
        super(name, address, phoneNumber, email, office, salary, dateHired, title);
    }
    @Override
    public String toString(){
        return name + " is an Object of FullTimeStaff class.";
    }

}
