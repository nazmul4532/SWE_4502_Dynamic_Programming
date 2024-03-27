package org.example;

// Strategy Pattern
interface EnrollmentStrategy {
    double calculateTuition();
}

class SelfFinancedEnrollmentStrategy implements EnrollmentStrategy {
    public double calculateTuition() {
        return 3000.0;
    }
}

class ScholarshipEnrollmentStrategy implements EnrollmentStrategy {
    public double calculateTuition() {

        return 0.0;
    }
}

interface EnrollmentStrategyDecorator extends EnrollmentStrategy {
}

class DiscountDecorator implements EnrollmentStrategyDecorator {
    private EnrollmentStrategy strategy;
    private double discount;

    public DiscountDecorator(EnrollmentStrategy strategy, double discount) {
        this.strategy = strategy;
        this.discount = discount;
    }

    public double calculateTuition() {
        double originalTuition = strategy.calculateTuition();
        return originalTuition * (1 - discount);
    }
}

class AdditionalFeeDecorator implements EnrollmentStrategyDecorator {
    private EnrollmentStrategy strategy;
    private double residentialFee;

    public AdditionalFeeDecorator(EnrollmentStrategy strategy, double residentialFee) {
        this.strategy = strategy;
        this.residentialFee = residentialFee;
    }

    public double calculateTuition() {
        double originalTuition = strategy.calculateTuition();
        return originalTuition + residentialFee;
    }
}




abstract class Student implements EnrollmentStrategy {

    protected EnrollmentStrategy enrollmentStrategy;

    public void setEnrollmentStrategy(EnrollmentStrategy strategy) {
        this.enrollmentStrategy = strategy;
    }

    public double calculateTuition() {
        return enrollmentStrategy.calculateTuition();
    }
    public EnrollmentStrategy getEnrollmentStrategy(){
        return this.enrollmentStrategy;
    }
    public abstract void type();
}

class ComputerScienceStudent extends Student {
    public void type(){
        System.out.println("I am a Computer Science student");
    }
}

class ElectronicsStudent extends Student {
    public void type(){
        System.out.println("I am an Electronics student");
    }
}

class MechanicalEngineeringStudent extends Student {
    public void type(){
        System.out.println("I am a Mechanical Engineering student");
    }
}


// Factory Pattern
class DepartmentFactory {
    public static Student enrollStudent(String department) {
        Student student = null;

        if (department.equals("Computer Science")) {
            student = new ComputerScienceStudent();
        } else if (department.equals("Electronics")) {
            student = new ElectronicsStudent();
        } else if (department.equals("Mechanical Engineering")) {
            student = new MechanicalEngineeringStudent();
        }

        return student;
    }
}


class StrategyFactory {
    public static EnrollmentStrategy createStrategy(String strategyType) {
        if (strategyType.equalsIgnoreCase("SelfFinanced")) {
            return new SelfFinancedEnrollmentStrategy();
        } else if (strategyType.equalsIgnoreCase("Scholarship")) {
            return new ScholarshipEnrollmentStrategy();
        }
        return null;
    }
}


class IUTEnrollmentSystem {
    public static void main(String[] args) {
        Student student = DepartmentFactory.enrollStudent("Computer Science");

        student.setEnrollmentStrategy(StrategyFactory.createStrategy("SelfFinanced"));
        student.type();
        double tuition = student.calculateTuition();
        System.out.println("Tuition: $" + tuition);

        student.setEnrollmentStrategy(new DiscountDecorator(student.getEnrollmentStrategy(), 0.04));
        student.setEnrollmentStrategy(new AdditionalFeeDecorator(student.getEnrollmentStrategy(), 1500.0));
        tuition = student.calculateTuition();
        System.out.println("After Discount: $" + tuition);

        student = DepartmentFactory.enrollStudent("Mechanical Engineering");
        student.setEnrollmentStrategy(StrategyFactory.createStrategy("Scholarship"));
        student.setEnrollmentStrategy(new AdditionalFeeDecorator(student.getEnrollmentStrategy(), 1500.0));
        student.type();
        tuition = student.calculateTuition();
        System.out.println("Tuition: $" + tuition);

        student.setEnrollmentStrategy(StrategyFactory.createStrategy("SelfFinanced"));
        student.setEnrollmentStrategy(new AdditionalFeeDecorator(student.getEnrollmentStrategy(), 1500.0));
        tuition = student.calculateTuition();
        System.out.println("Updated Tuition: $" + tuition);
    }
}
