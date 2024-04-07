import java.util.Iterator;

public interface Quackable extends QuackObservable{
    void quack();
    void add(Quackable quackable);
    Iterator<Quackable> iterator();
}
