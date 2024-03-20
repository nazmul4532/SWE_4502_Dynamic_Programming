package Task01;

public class CookieBakery extends Bakery {
    @Override
    protected void prepareIngredients() {
        System.out.println("Preparing ingredients for cookies");
    }

    @Override
    protected void mixIngredients() {
        System.out.println("Mixing ingredients properly, no need to be slow and methodical");
    }

    @Override
    protected void bakeInOven(){
        System.out.println("Bake in the Oven for 50 minutes");
    }
    @Override
    protected void cool() {
        System.out.println("Cooling the cookie for an hour");
    }
    @Override
    protected boolean shouldAddToppings() {
        return false;
    }
}
