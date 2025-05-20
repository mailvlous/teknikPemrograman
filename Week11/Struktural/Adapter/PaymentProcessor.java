

public class PaymentProcessor {

    public PaymentService getAdapter(String gateway) {
        return switch (gateway.toLowerCase()) {
            case "midtrans" -> new MidtransAdapter();
            case "xendit" -> new XenditAdapter();
            default -> throw new IllegalArgumentException("Unknown gateway: " + gateway);
        };
    }

    public void process(String gateway, double amount) {
        PaymentService adapter = getAdapter(gateway);
        adapter.pay(amount);
    }
}

