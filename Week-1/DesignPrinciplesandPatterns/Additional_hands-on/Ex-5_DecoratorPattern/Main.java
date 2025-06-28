interface Notifier {
    void send();
}
class EmailNotifier implements Notifier {
    public void send() { System.out.println("Email Sent"); }
}
abstract class NotifierDecorator implements Notifier {
    Notifier notifier;
    NotifierDecorator(Notifier n) { notifier = n; }
}
class SMSNotifier extends NotifierDecorator {
    SMSNotifier(Notifier n) { super(n); }
    public void send() {
        notifier.send();
        System.out.println("SMS Sent");
    }
}
public class Main {
    public static void main(String[] args) {
        Notifier n = new SMSNotifier(new EmailNotifier());
        n.send();
    }
}