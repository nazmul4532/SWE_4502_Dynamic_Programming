import java.util.Iterator;
import java.util.Observer;

public class GooseAdapter implements Quackable {
    private Goose goose;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.cluck();
    }

    @Override
    public void add(Quackable quackable) {

    }

    @Override
    public Iterator<Quackable> iterator() {
        // Return an iterator for the GooseAdapter
        return new Iterator<Quackable>() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public Quackable next() {
                return null;
            }
        };
    }

    @Override
    public void registerObserver(Observer observer) {

    }

    @Override
    public void notifyObservers() {

    }
}
