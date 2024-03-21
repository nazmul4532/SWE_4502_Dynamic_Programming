package StrategyPattern;

public class Main {
    public static void main(String[] args) {
        double total = 100.0;


        DiscountStrategy percentageDiscount = new PercentageDiscount(10.0);
        DiscountStrategy fixedDiscount = new FixedDiscount(20.0);


        Coupon coupon = new Coupon(percentageDiscount);


        double totalCost = coupon.calculateTotal(total);
        System.out.println("Total cost with Percentage Discount: $" + totalCost);

        coupon = new Coupon(fixedDiscount);
        totalCost = coupon.calculateTotal(total);
        System.out.println("Total cost with Fixed Discount: $" + totalCost);
    }
}
