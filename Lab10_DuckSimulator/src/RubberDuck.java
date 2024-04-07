import java.util.Iterator;
import java.util.Observer;

public class RubberDuck implements Quackable{
    @Override
    public void quack() {
        System.out.println("Quack! I am a Mallard Duck!");
    }

    @Override
    public void add(Quackable quackable) {

    }

    @Override
    public Iterator<Quackable> iterator() {
        return null;
    }

    @Override
    public void registerObserver(Observer observer) {

    }

    @Override
    public void notifyObservers() {

    }
}
