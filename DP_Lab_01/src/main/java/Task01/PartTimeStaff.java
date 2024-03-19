package Task01;

public class PartTimeStaff extends Staff{
    public int workedHours;
    public double hourlySalary;

    public PartTimeStaff(String name, String address, String phoneNumber, String email, String office,
                         MyDate dateHired, String title, double hourlySalary)
    {
        super(name, address, phoneNumber, email, office, 0, dateHired, title);
        this.hourlySalary = hourlySalary;
        this.workedHours = 0;
    }
    public void setWorkedHours(int hours){
        this.workedHours = hours;
    }
    public void setSalary (){
        this.salary = this.hourlySalary*this.workedHours;
    }


    @Override
    public String toString(){
        return name + " is an Object of PartTimeStaff class.";
    }

    @Override
    public double getSalary (){
        this.setSalary();
        return this.salary;
    }

}
