package Task01;

public abstract class Bakery {
    public final void bake() {
        prepareIngredients();
        addIngredients();
        mixIngredients();
        bakeInOven();
        cool();
        if(shouldAddToppings()){
            addToppings();
        }
    }

    protected abstract void prepareIngredients();
    protected final void addIngredients(){
        System.out.println("Add all the ingredients to a large bowl");
    }
    protected abstract void mixIngredients();
    protected abstract void bakeInOven();

    protected abstract void cool();

    protected boolean shouldAddToppings() {
        return true;
    }
    protected void addToppings() {
        System.out.println("Adding toppings");
    }

    protected String setOvenTimer(){
        return "45 minutes";
    };
}
