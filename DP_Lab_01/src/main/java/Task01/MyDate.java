package Task01;

public class MyDate {
    public int year;
    public int month;
    public int day;
    public MyDate(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }
    @Override
    public String toString(){
        return this.day + "."+this.month + "." + this.year;
    }
}
