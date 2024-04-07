import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Observer;

public class QuackCounter implements Quackable,QuackObservable{
    private Quackable duck;
    private static int quackCount = 0;
    private List<Observer> observers = new ArrayList<>();


    public QuackCounter(Quackable duck){
        this.duck=duck;
    }



    @Override
    public void quack() {
        duck.quack();
        quackCount++;
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(null, this);
        }
    }

    @Override
    public void add(Quackable quackable) {

    }

    @Override
    public Iterator<Quackable> iterator() {
        return null;
    }

    public int getQuackCount(){
        return quackCount;
    }
}
