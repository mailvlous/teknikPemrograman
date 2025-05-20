

public class PercentageDiscount implements DiscountStrategy {
    private double percentage; // 0.1 untuk 10%

    public PercentageDiscount(double percentage) {
        this.percentage = percentage;
    }

    @Override
    public double applyDiscount(double totalPrice) {
        return totalPrice * (1 - percentage);
    }
}