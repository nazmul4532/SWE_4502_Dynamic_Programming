package StrategyPattern;

class PercentageDiscount implements DiscountStrategy {
    private double percentage;

    PercentageDiscount(double percentage) {
        this.percentage = percentage;
    }

    @Override
    public double applyDiscount(double totalAmount) {
        return totalAmount - (totalAmount * (percentage / 100));
    }
}

