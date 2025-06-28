interface PaymentProcessor {
    void processPayment();
}
class PayPalGateway {
    void sendPayment() { System.out.println("PayPal Payment Done"); }
}
class PayPalAdapter implements PaymentProcessor {
    PayPalGateway gateway = new PayPalGateway();
    public void processPayment() { gateway.sendPayment(); }
}
public class Main {
    public static void main(String[] args) {
        PaymentProcessor p = new PayPalAdapter();
        p.processPayment();
    }
}