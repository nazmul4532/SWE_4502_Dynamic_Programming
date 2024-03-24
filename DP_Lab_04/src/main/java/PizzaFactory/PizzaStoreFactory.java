package PizzaFactory;

public class PizzaStoreFactory {
    public static PizzaStore createPizzaStore(String location){
        if (location.equalsIgnoreCase("New York")) {
            return new NyPizzaStore();
        } else if (location.equalsIgnoreCase("Chicago")) {
            return new ChicagoPizzaStore();
        } else if (location.equalsIgnoreCase("California")) {
            return new CaliforniaPizzaStore();
        }
        // More Locations may be added here later for expansion if necessary
        return null;
    }
}
