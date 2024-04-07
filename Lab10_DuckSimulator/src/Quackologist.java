import java.util.Observable;
import java.util.Observer;

public class Quackologist implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Quackologist: The ducks have quacked.");
    }
}