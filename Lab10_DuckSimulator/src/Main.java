import java.util.Observer;

public class Main {
    public static void main(String[] args) {
        DuckFactory duckFactory = new CountingDuckFactory();

        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable flockOfDucks = duckFactory.createFlock();

        // Create Quackologist observer
        Observer quackologist = new Quackologist();

        // Register the observer for all ducks and the flock
        mallardDuck.registerObserver(quackologist);
        rubberDuck.registerObserver(quackologist);
        flockOfDucks.registerObserver(quackologist);

        System.out.println("Duck Simulator with Counting, Composite, and Observer");
        simulateDuck(mallardDuck);
        simulateDuck(rubberDuck);
        simulateDuck(flockOfDucks);

        Quackable someQuackable = duckFactory.createMallardDuck();
        QuackCounter quackCounter = new QuackCounter(someQuackable);
        // Display the total quack count for the specific Quackable
        System.out.println("Total Quacks: " + quackCounter.getQuackCount());
    }

    private static void simulateDuck(Quackable duck) {
        duck.quack();
    }
}
