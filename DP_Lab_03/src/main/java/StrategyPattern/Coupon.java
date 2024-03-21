package StrategyPattern;
//Context Class
public class Coupon {
    private DiscountStrategy discountStrategy;

    Coupon(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    double calculateTotal(double total) {
        return discountStrategy.applyDiscount(total);
    }
}
