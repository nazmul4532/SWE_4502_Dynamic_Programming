package Task01;

public class Main {
    public static void main(String[] args) {
        MyDate date = new MyDate(2023,8, 18 );

        FullTimeStaff nazmul = new FullTimeStaff("Nazmul Hossain",
                "20A-20D, Begum Rokeya Sharani, Shewrapara, Agargaon, Dhaka - 1207",
                "01533074249", "nazmulhossain@iut-dhaka.edu","AC 1", 75000, date,
                "Assistant General Manager");
        PartTimeStaff akash = new PartTimeStaff("Mashrur Ahsan Akash",
                "Kallyanpur", "01727222896", "mashrurahsan@iut-dhaka.edu","AC 2", date,
                "Assistant to the General Manager",
                5000);
        akash.setWorkedHours(14);

        Student shanta = new Student("Shanta Maria", "Banani","01743969076",
                "shantamaria@iut-dhaka.edu", StudentStatus.JUNIOR);
        Faculty nafisa = new Faculty("Nafisa Maliyat", "Taltola", "01713015432",
                "nafisamaliyat@iut-dhaka.edu","AC 3", 90000, date, "9-5",
                "Professor");

        //toString method Override
        System.out.println(nazmul.toString());
        System.out.println(akash.toString());
        System.out.println(shanta.toString());
        System.out.println(nafisa.toString());

        //The different types of salary calculation
        System.out.println("A Full Time Staff " + nazmul.name + " makes a fixed Salary of " + nazmul.getSalary());
        System.out.println("A Part Time Staff " + akash.name + " makes a variable Salary of " + akash.getSalary()+
                " based on working for " + akash.workedHours +" hours.");
    }
}
