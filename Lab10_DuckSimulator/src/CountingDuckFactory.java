public class CountingDuckFactory implements DuckFactory {
    @Override
    public Quackable createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }


    @Override
    public Quackable createFlock() {
        Flock flock = new Flock();
        flock.add(createMallardDuck());
        flock.add(createRubberDuck());
        // Add more ducks to the flock if needed
        return new QuackCounter(flock);
    }
}