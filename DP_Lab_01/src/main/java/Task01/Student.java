package Task01;

public class Student extends Person{
    public StudentStatus status;
    public Student(String name, String address, String phoneNumber, String emailAddress, StudentStatus status){
        super(name, address, phoneNumber, emailAddress);
        this.status =status;
    }

    @Override
    public String toString(){
        return name + " is an Object of Student class.";
    }

}
