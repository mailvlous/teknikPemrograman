

public class MidtransAdapter implements PaymentService {
    private MidtransAPI midtrans = new MidtransAPI();

    @Override
    public void pay(double amount) {
        midtrans.charge(amount);
    }
}
