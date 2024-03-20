package Task01;

public class Main {
    public static void main(String[] args) {
        CakeBakery cakeBakery = new CakeBakery();
        CookieBakery cookieBakery = new CookieBakery();

        System.out.println("Baking a cake:");
        cakeBakery.bake();
        System.out.println("------------------------");
        System.out.println("Baking cookies:");
        cookieBakery.bake();
    }
}