public class PremiumMemberDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double totalPrice) {
        // Misal diskon 15% untuk member premium
        return totalPrice * 0.85;
    }
}