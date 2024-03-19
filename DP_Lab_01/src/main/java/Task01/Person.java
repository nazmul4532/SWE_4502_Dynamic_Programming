package Task01;

public class Person {
    public String name;
    private String address;
    public String phoneNumber;
    public String emailAddress;

    public Person(String name, String address, String phoneNumber, String emailAddress){
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }
    public String getAddress(){
        return this.address;
    }
    public void setAddress(String address){
        this.address = address;
    }

    @Override
    public String toString(){
        return name + " is an Object of Person class.";
    }

}
