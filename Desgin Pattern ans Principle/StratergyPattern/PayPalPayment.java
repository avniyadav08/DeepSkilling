public class PayPalPayment implements PaymentStrategy {

    @Override
    public void pay() {
        System.out.println("Payment Done using PayPal");
    }

}