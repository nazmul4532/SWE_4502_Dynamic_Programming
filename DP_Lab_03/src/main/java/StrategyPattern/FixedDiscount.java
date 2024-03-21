package StrategyPattern;

class FixedDiscount implements DiscountStrategy {
    private double discountAmount;

    FixedDiscount(double discountAmount) {
        this.discountAmount = discountAmount;
    }

    @Override
    public double applyDiscount(double totalAmount) {
        return totalAmount - discountAmount;
    }
}
