package Task01;

public class CakeBakery extends Bakery {
    @Override
    protected void prepareIngredients() {
        System.out.println("Preparing ingredients for a cake");
    }

    @Override
    protected void mixIngredients() {
        System.out.println("Mixing ingredients for a Slowly so as to not form Clumps, make sure the peak forms for the egg whip");
    }

    @Override
    protected void bakeInOven(){
        System.out.println("Bake in the Oven for 45 minutes");
    }

    @Override
    protected void cool() {
        System.out.println("Cooling the cake for 45 minutes");
    }
}