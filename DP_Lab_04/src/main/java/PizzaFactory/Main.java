package PizzaFactory;

public class Main {
    public static void main(String[] args) {
        PizzaStore nyPizzaStore = PizzaStoreFactory.createPizzaStore("New York");
        PizzaStore chicagoPizzaStore = PizzaStoreFactory.createPizzaStore("Chicago");
        PizzaStore californiaPizzaStore = PizzaStoreFactory.createPizzaStore("California");


        Pizza nyCheesePizza = nyPizzaStore.orderPizza("cheese");
        Pizza nyPepperoniPizza = nyPizzaStore.orderPizza("pepperoni");
        Pizza chicagoPepperoniPizza = chicagoPizzaStore.orderPizza("pepperoni");
        Pizza californiaVeggiePizza = californiaPizzaStore.orderPizza("veggie");

//        System.out.println(nyCheesePizza.getClass().getSimpleName());
//        System.out.println(nyPepperoniPizza.getClass().getSimpleName());
//        System.out.println(chicagoPepperoniPizza.getClass().getSimpleName());
//        System.out.println(californiaVeggiePizza.getClass().getSimpleName());
    }
}