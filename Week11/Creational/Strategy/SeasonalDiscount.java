public class SeasonalDiscount implements DiscountStrategy {
    private double seasonalRate;

    public SeasonalDiscount(double seasonalRate) {
        this.seasonalRate = seasonalRate;
    }

    @Override
    public double applyDiscount(double totalPrice) {
        return totalPrice * (1 - seasonalRate);
    }
}