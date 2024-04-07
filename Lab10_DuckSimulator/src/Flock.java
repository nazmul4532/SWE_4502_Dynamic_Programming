import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Observer;

public class Flock implements Quackable {
    private List<Quackable> ducks = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void quack() {
        for (Quackable duck : ducks) {
            duck.quack();
        }
    }

    @Override
    public void add(Quackable quackable) {
        ducks.add(quackable);
    }

    @Override
    public Iterator<Quackable> iterator() {
        return ducks.iterator();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
        for (Quackable duck : ducks) {
            duck.registerObserver(observer);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(null, this);
        }
    }
}
