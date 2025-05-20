public class ShoppingCart {
    private DiscountStrategy discountStrategy;
    private double totalPrice;

    public ShoppingCart(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public double calculateTotal() {
        if (discountStrategy == null) {
            return totalPrice;
        }
        return discountStrategy.applyDiscount(totalPrice);
    }
}