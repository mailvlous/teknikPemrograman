public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart(500_000);

        // Pakai diskon tetap
        cart.setDiscountStrategy(new FixedDiscount(50_000));
        System.out.println("Total bayar (fixed discount): " + cart.calculateTotal());

        // Ganti ke diskon persentase
        cart.setDiscountStrategy(new PercentageDiscount(0.1)); // 10%
        System.out.println("Total bayar (percentage discount): " + cart.calculateTotal());

        // Diskon member premium
        cart.setDiscountStrategy(new PremiumMemberDiscount());
        System.out.println("Total bayar (premium member discount): " + cart.calculateTotal());

        // Diskon musiman 20%
        cart.setDiscountStrategy(new SeasonalDiscount(0.2));
        System.out.println("Total bayar (seasonal discount): " + cart.calculateTotal());
    }
}
