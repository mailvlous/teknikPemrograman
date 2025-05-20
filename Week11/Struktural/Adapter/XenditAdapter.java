

// XenditAdapter.java
public class XenditAdapter implements PaymentService {
    private XenditAPI xendit = new XenditAPI();

    @Override
    public void pay(double amount) {
        xendit.makePayment(amount);
    }
}
