public class Main {

    public static void main(String[] args) {

        PaymentContext payment;

        payment = new PaymentContext(new CreditCardPayment());
        payment.makePayment();

        payment = new PaymentContext(new PayPalPayment());
        payment.makePayment();

    }

}