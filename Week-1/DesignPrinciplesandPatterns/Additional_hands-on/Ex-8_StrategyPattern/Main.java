interface PaymentStrategy {
    void pay();
}
class CreditCardPayment implements PaymentStrategy {
    public void pay() { System.out.println("Paid by Card"); }
}
class PayPalPayment implements PaymentStrategy {
    public void pay() { System.out.println("Paid by PayPal"); }
}
class PaymentContext {
    PaymentStrategy strategy;
    void setStrategy(PaymentStrategy s) { strategy = s; }
    void pay() { strategy.pay(); }
}
public class Main {
    public static void main(String[] args) {
        PaymentContext c = new PaymentContext();
        c.setStrategy(new CreditCardPayment());
        c.pay();
    }
}